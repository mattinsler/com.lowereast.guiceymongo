package com.lowereast.mongoose.guice.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Map;

import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.internal.Maps;
import com.lowereast.mongoose.MongooseEvalException;
import com.lowereast.mongoose.guice.Mongoose;
import com.mongodb.DB;
import com.mongodb.MongoException;

public class JavascriptProxy<T> implements Module, Provider<T> {
	private final String _databaseKey;
	private final Class<T> _proxyInterface;
	
	private Provider<DB> _databaseProvider;
	
	public JavascriptProxy(Class<T> proxyInterface, String databaseKey) {
		if (!proxyInterface.isInterface())
			throw new RuntimeException("Proxy class must be an interface");
		_proxyInterface = proxyInterface;
		_databaseKey = databaseKey;
	}

	@Inject
	void initialize(Injector injector) {
		_databaseProvider = injector.getProvider(Key.get(DB.class, MongooseDatabases.database(_databaseKey)));
	}
	
	public void configure(Binder binder) {
		binder.skipSources(JavascriptProxy.class, Mongoose.class).bind(_proxyInterface).toProvider(this);
	}
	
	@SuppressWarnings("unchecked")
	public T get() {
		return (T)Proxy.newProxyInstance(_proxyInterface.getClassLoader(), new Class<?>[] { _proxyInterface }, new Handler<T>(_proxyInterface, _databaseProvider.get()));
	}
	
	private static String createArgumentString(int numArguments) {
		StringBuilder builder = new StringBuilder("(");
		for (int x = 0; x < numArguments; ++x) {
			if (x > 0)
				builder.append(",");
			builder.append((char)('a' + x));
		}
		builder.append(")");
		return builder.toString();
	}
	
	private interface Invocation {
		Object invoke(DB database, Object[] args);
	}
	
	private static class VoidNoArgInvocation implements Invocation {
		private final String _code;
		public VoidNoArgInvocation(String methodName) {
			_code = methodName + "()";
		}
		public Object invoke(DB database, Object[] args) {
			return database.eval(_code);
		}
	}
	
	private static class VoidInvocation implements Invocation {
		private final String _code;
		public VoidInvocation(String methodName, Class<?>[] argumentTypes) {
			String argumentString = createArgumentString(argumentTypes.length);
			_code = "function" + argumentString + "{" + methodName + argumentString + "}";
		}
		public Object invoke(DB database, Object[] args) {
			return database.eval(_code, args);
		}
	}
	
	private interface Converter<From, To> {
		To convert(From value);
	}
	private static final Converter<Double, Integer> DoubleToIntConverter = new Converter<Double, Integer>() {
		public Integer convert(Double value) {
			return value.intValue();
		}
	};
	private static final Converter<Object, Object> NoOpConverter = new Converter<Object, Object>() {
		public Object convert(Object value) {
			return value;
		}
	};
	
	private static class ReturningInvocation implements Invocation {
		private final String _code;
		private final Converter<?, ?> _converter;
		
		public ReturningInvocation(Class<?> returnType, String methodName, Class<?>[] argumentTypes) {
			String argumentString = createArgumentString(argumentTypes.length);
			_code = "function" + argumentString + "{return " + methodName + argumentString + "}";

			if (int.class.equals(returnType) || Integer.class.equals(returnType)) {
				_converter = DoubleToIntConverter;
			} else {
				_converter = NoOpConverter;
			}
		}
		@SuppressWarnings("unchecked")
		public Object invoke(DB database, Object[] args) {
			return ((Converter<Object, Object>)_converter).convert(database.eval(_code, args));
		}
	}
	
	private static class Handler<T> implements InvocationHandler {
		private final DB _database;
		private final Class<T> _proxyInterface;
		private final Map<Method, Invocation> _invocations = Maps.newHashMap();
		
		public Handler(Class<T> proxyInterface, DB database) {
			_proxyInterface = proxyInterface;
			_database = database;
			
			for (Method method : proxyInterface.getDeclaredMethods()) {
				if (Modifier.isPublic(method.getModifiers()) && Modifier.isAbstract(method.getModifiers())) {
					Invocation invocation;
					
					String methodName = method.getName();
					Class<?> methodReturnType = method.getReturnType();
					Class<?>[] argumentTypes = method.getParameterTypes();
					
					if (Void.class.equals(methodReturnType) || void.class.equals(methodReturnType)) {
						if (argumentTypes.length == 0) {
							invocation = new VoidNoArgInvocation(methodName);
						} else {
							invocation = new VoidInvocation(methodName, argumentTypes);
						}
					} else {
						invocation = new ReturningInvocation(methodReturnType, methodName, argumentTypes);
					}
					
					_invocations.put(method, invocation);
				}
			}
		}
		
		public Object invoke(Object proxy, java.lang.reflect.Method method, Object[] args) throws Throwable {
			if (Object.class.equals(method.getDeclaringClass())) {
				return method.invoke(this, args);
			}
			try {
				Invocation invocation = _invocations.get(method);
				if (invocation == null)
					throw new RuntimeException();
				return invocation.invoke(_database, args);
			} catch (MongoException e) {
				throw MongooseEvalException.create(e);
			}
		}
		
		@Override
		public String toString() {
			return _proxyInterface.getName();
		}
	}
}
