package com.lowereast.guiceymongo.annotation;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.internal.Lists;
import com.google.inject.internal.Maps;

public class Annotations {
	private static class AnnotationProxy<T extends Annotation> implements InvocationHandler {
		private final Class<T> _annotationClass;
		private final List<String> _elements = Lists.newArrayList();
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
		
		private static boolean isEqualToAny(Object lhs, Object... rhs) {
			for (Object item : rhs) {
				if (lhs.equals(item))
					return true;
			}
			return false;
		}
		
		private int valueHashCode(Class<?> elementType, Object value) {
			if (elementType.isArray()) {
				return Arrays.hashCode((Object[])value);
			} else if (isEqualToAny(elementType,
					byte.class, Byte.class,
					char.class, Character.class,
					double.class, Double.class,
					float.class, Float.class,
					int.class, Integer.class,
					long.class, Long.class,
					short.class, Short.class,
					boolean.class, Boolean.class,
					String.class)
					|| elementType.isEnum()
					|| elementType.isAnnotation()) {
				return value.hashCode();
			}
			throw new RuntimeException("This shouldn't happen");
		}
		
		private int calculateHashCode() {
			// This is specified in java.lang.Annotation.
			int hashCode = 0;
			for (String element : _elements)
				hashCode += (127 * element.hashCode()) ^ valueHashCode(_methods.get(element).getReturnType(), _values.get(element));
			return hashCode;
		}
		
		private boolean checkEquals(Object other) throws Throwable {
			if (!_annotationClass.isAssignableFrom(other.getClass()))
				return false;
			for (String element : _elements) {
				if (!_values.get(element).equals(_methods.get(element).invoke(other)))
					return false;
			}
			return true;
		}
		
		private String buildString() {
			StringBuilder builder = new StringBuilder("@").append(_annotationClass.getName());
			if (_elements.size() > 0) {
				builder.append("(");
				for (int x = 0; x < _elements.size(); ++x) {
					if (x > 0)
						builder.append(",");
					builder.append(_elements.get(x)).append("=").append(_values.get(_elements.get(x)));
				}
				builder.append(")");
			}
			return builder.toString();
		}
		
		// http://java.sun.com/j2se/1.5.0/docs/api/java/lang/annotation/Annotation.html
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			String methodName = method.getName();

			if ("annotationType".equals(methodName)) {
				return _annotationClass;
			} else if ("equals".equals(methodName)) {
				return checkEquals(args[0]);
			} else if ("hashCode".equals(methodName)) {
				return calculateHashCode();
			} else if ("toString".equals(methodName)) {
				return buildString();
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
