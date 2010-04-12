/**
 *      Copyright (C) 2010 Lowereast Software
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.lowereast.guiceymongo.wrapper.generator;

import java.util.Map;

public final class TypeParser {
	private TypeParser() {}
	
//	private static String getTypeName(String type) {
//		if ("string".equals(type))
//			return "String";
//		else if ("int".equals(type))
//			return "int";
//		else if ("bool".equals(type))
//			return "boolean";
//		else if ("map".equals(type))
//			return "map";
//		throw new RuntimeException("Unknown type: " + type);
//	}
	
	private static Property createProperty(String key, String type) {
		return new Property(key, type);
	}
	
	private static Property createProperty(String key, Object[] array) {
		if (array.length == 0)
			throw new RuntimeException("[" + key + "] Must specify an array type");
		if (array.length > 1)
			throw new RuntimeException("[" + key + "] Must specify only one array type");
		if (!(array[0] instanceof String))
			throw new RuntimeException("[" + key + "] Must specify an array type as a string");
		return new ArrayProperty(key, (String)array[0]);
	}
	
	private static Property createProperty(String key, Map<String, Object> map) {
		Object value = map.get("type");
		if (value == null)
			throw new RuntimeException();
		if (!(value instanceof String))
			throw new RuntimeException();
		String type = (String)value;
		if ("map".equals(type))
			return parseMapPropertyOptions(key, map);
		throw new RuntimeException();
	}
	
	private static MapProperty parseMapPropertyOptions(String name, Map<String, Object> map) {
		Object value = map.get("key");
		if (value == null)
			throw new RuntimeException();
		if (!(value instanceof String))
			throw new RuntimeException();
		String keyType = (String)value;
		
		value = map.get("value");
		if (value == null)
			throw new RuntimeException();
		if (!(value instanceof String))
			throw new RuntimeException();
		String valueType = (String)value;
		return new MapProperty(name, keyType, valueType);
	}
	
	private static Type parseType(String name, Map<String, Object> map) {
		Type type = new Type(name);
		
		for (String key : map.keySet()) {
			Object value = map.get(key);
			if (value == null)
				throw new RuntimeException("No type specified");
			
			Property property = null;
			if (value instanceof String) {
				property = createProperty(key, (String)value);
			} else if (value instanceof Object[]) {
				property = createProperty(key, (Object[])value);
			} else if (value instanceof Map<?, ?>) {
				property = createProperty(key, (Map<String, Object>)value);
			}
			
			type.properties.add(property);
		}
			
		return type;
	}
	
	public static void parseJSON(Object json, TypeRegistry registry) {
		if (json instanceof Map<?, ?>) {
			Map<String, Object> m = (Map<String, Object>)json;
			for (String key : m.keySet()) {
				Object value = m.get(key);
				if (value == null)
					throw new RuntimeException("No type definition specified for " + key);
				if (!(value instanceof Map<?, ?>))
					throw new RuntimeException("[" + key + "] Type specification must be a map");
				
				Type type = parseType(key, (Map<String, Object>)value);
				registry.types.put(type.name, type);
			}
		}
	}
}
