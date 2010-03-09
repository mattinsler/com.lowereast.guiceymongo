package com.lowereast.mongoose.annotation;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.inject.internal.Maps;
import com.google.inject.internal.Sets;

public class Annotations {
	private static class AnnotationProxy<T extends Annotation> implements InvocationHandler {
		private final Class<T> _annotationClass;
		private final Set<String> _elements = Sets.newHashSet();
		private final Map<String, Object> _values;
		private final Map<String, Method> _methods = Maps.newHashMap();
		
		public AnnotationProxy(Class<T> annotationClass, Map<String, Object> values) {
			_values = (values == null ? Maps.<String, Object>newHashMap() : new HashMap<String, Object>(values));
			_annotationClass = annotationClass;
			for (Method method : _annotationClass.getDeclaredMethods()) {
				if (Modifier.isPublic(method.getModifiers()) && Modifier.isAbstract(method.getModifiers()) && method.getParameterTypes().length == 0) {
					String elementName = method.getName();
					_elements.add(elementName);
					_methods.put(elementName, method);
					Object defaultValue = method.getDefaultValue();
					if (defaultValue != null && !_values.containsKey(elementName))
						_values.put(elementName, defaultValue);
				}
			}
		}
		
		// http://java.sun.com/j2se/1.5.0/docs/api/java/lang/annotation/Annotation.html
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			String methodName = method.getName();

			if ("annotationType".equals(methodName)) {
				return _annotationClass;
			} else if ("equals".equals(methodName)) {
				Object other = args[0];
				if (!_annotationClass.isAssignableFrom(other.getClass()))
					return false;
				for (String element : _elements) {
					if (!_values.get(element).equals(_methods.get(element).invoke(other)))
						return false;
				}
				return true;
//			if (!(o instanceof MongoCollection)) {
//				return false;
//			}
//			MongoCollection other = (MongoCollection) o;
//			return _database.equals(other.database()) && _collection.equals(other.collection());
			} else if ("hashCode".equals(methodName)) {
				// This is specified in java.lang.Annotation.
				int hashCode = 0;
				for (String element : _elements) {
					hashCode += (127 * element.hashCode()) ^ _values.get(element).hashCode();
				}
				return hashCode;
//				return ((127 * "database".hashCode()) ^ _database.hashCode()) + ((127 * "collection".hashCode()) ^ _collection.hashCode());
			} else if ("toString".equals(methodName)) {
				StringBuilder builder = new StringBuilder("@").append(_annotationClass.getName());
				if (_elements.size() > 0) {
					builder.append("(");
					for (String element : _elements)
						builder.append(element).append("=").append(_values.get(element));
					builder.append(")");
				}
				return builder.toString();
//				return "@" + MongoCollection.class.getName() + "(database=" + _database + ",collection=" + _collection + ")";
			} else if (_elements.contains(methodName)) {
				return _values.get(methodName);
			}
			throw new RuntimeException();
		}
	}
	
	public static <T extends Annotation> T proxy(Class<T> annotationClass) {
		return proxy(annotationClass, null);
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Annotation> T proxy(Class<T> annotationClass, Map<String, Object> values) {
		return (T)Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[] { annotationClass, Serializable.class }, new AnnotationProxy(annotationClass, values));
	}
}
