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

import java.io.IOException;

public class TypeGenerator {
	public static String toUpperFirstLetter(String value) {
		if (value.length() == 1)
			return value.toUpperCase();
		return value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
	}
	
	public static String toCamelCase(String value) {
		String[] pieces = value.split("_");
		if (pieces.length == 1)
			return toUpperFirstLetter(value);
		
		StringBuilder builder = new StringBuilder();
		for (int x = 0; x < pieces.length; ++x)
			builder.append(toUpperFirstLetter(pieces[x]));
		return builder.toString();
	}
	
	public static String toLowerCamelCase(String value) {
		String[] pieces = value.split("_");
		if (pieces.length == 1)
			return value.toLowerCase();
		
		StringBuilder builder = new StringBuilder(pieces[0].toLowerCase());
		for (int x = 1; x < pieces.length; ++x)
			builder.append(toUpperFirstLetter(pieces[x]));
		return builder.toString();
	}
	
	private static String getTypeName(String name, TypeRegistry registry) {
		if ("string".equals(name))
			return "String";
		else if ("int".equals(name))
			return "int";
		else if ("bool".equals(name))
			return "boolean";
		else if (registry.types.containsKey(name))
			return toCamelCase(name);
		throw new RuntimeException("Unknown type: " + name);
	}
	
	private static void generateImports(Appendable builder, Type type, TypeRegistry registry) throws IOException {
		boolean hasArray = false;
		boolean hasMap = false;
		for (Property p : type.properties) {
			if (p instanceof ArrayProperty)
				hasArray = true;
			if (p instanceof MapProperty)
				hasMap = true;
		}
		if (hasArray) {
//			builder.append("import java.util.ArrayList;\n");
			builder.append("import java.util.Collections;\n");
			builder.append("import java.util.List;\n");
		}
		if (hasMap) {
			builder.append("import java.util.HashMap;\n");
			builder.append("import java.util.Map;\n");
		}
//		builder.append("import com.mongodb.BasicDBObject;\n");
		builder.append("import com.mongodb.DBObject;\n");
		builder.append("import com.lowereast.guiceymongo.ReadableDBObject;\n");
		builder.append("import com.lowereast.guiceymongo.wrapper.GuiceyDBObject;\n");
	}
	
	private static void generateProperties(Appendable builder, Type type, TypeRegistry registry) throws IOException {
		for (Property p : type.properties) {
			builder.append("\tpublic static final String ").append(toCamelCase(p.name)).append("Key = \"").append(p.name).append("\";\n");
		}
	}
	
	private static void generatePrimitiveReadableProperty(Appendable builder, Type type, TypeRegistry registry, Property property) throws IOException {
		String propertyType = getTypeName(property.type, registry);
		
		// has
		builder.append("\tpublic boolean has").append(property.camelCaseName).append("() {\n");
		builder.append("\t\treturn super.hasField(").append(property.camelCaseName).append("Key);\n");
		builder.append("\t}\n");
		// get
		builder.append("\tpublic ").append(propertyType).append(" get").append(property.camelCaseName).append("() {\n");
		builder.append("\t\treturn super._getField(").append(property.camelCaseName).append("Key);\n");
//		builder.append("\t\treturn super.<").append(propertyType).append(">_getField(").append(camelCasePropertyName).append("Key);\n");
		builder.append("\t}\n");
	}
	
	private static void generateArrayReadableProperty(Appendable builder, Type type, TypeRegistry registry, ArrayProperty property) throws IOException {
		String propertyType = getTypeName(property.type, registry);
		String propertyName = "_" + property.lowerCamelCaseName + "List";

		// getCount
		builder.append("\tpublic int get").append(property.camelCaseName).append("Count() {\n");
		builder.append("\t\tList<?> list = get").append(property.camelCaseName).append("List();\n");
		builder.append("\t\treturn list == null ? 0 : list.size();\n");
		builder.append("\t}\n");
		// getList
		builder.append("\tprotected List<").append(propertyType).append("> ").append(propertyName).append(" = null;\n");
		builder.append("\tpublic List<").append(propertyType).append("> get").append(property.camelCaseName).append("List() {\n");
		builder.append("\t\tif (").append(propertyName).append(" == null)\n");
		builder.append("\t\t\t").append(propertyName).append(" = super.<").append(propertyType).append(">getList(").append(property.camelCaseName).append("Key);\n");
		builder.append("\t\treturn ").append(propertyName).append(" == null ? null : Collections.unmodifiableList(").append(propertyName).append(");\n");
		builder.append("\t}\n");
	}

	private static void generateMapReadableProperty(Appendable builder, Type type, TypeRegistry registry, MapProperty property) throws IOException {
		String keyType = getTypeName(property.keyType, registry);
		String valueType = getTypeName(property.valueType, registry);
		String propertyName = "_" + property.lowerCamelCaseName + "Map";
		
		builder.append("\tprotected Map<").append(keyType).append(", ").append(valueType).append("> ").append(propertyName).append(" = null;\n");
		// getMap
		builder.append("\tprotected Map<").append(keyType).append(", ").append(valueType).append("> get").append(property.camelCaseName).append("Map() {\n");
		builder.append("\t\tif (").append(propertyName).append(" == null) {\n");
		builder.append("\t\t\tObject value = super.getField(" + property.camelCaseName + "Key);\n");
		builder.append("\t\t\tif (value != null && value instanceof DBObject) {\n");
		builder.append("\t\t\t\t").append(propertyName).append(" = new HashMap<").append(keyType).append(", ").append(valueType).append(">();\n");
		builder.append("\t\t\t\tDBObject obj = (DBObject)value;\n");
		builder.append("\t\t\t\tfor (String key : obj.keySet())\n");
		builder.append("\t\t\t\t\t").append(propertyName).append(".put(key, ").append(valueType).append(".wrap((DBObject)obj.get(key)));\n");
		builder.append("\t\t\t}\n");
		builder.append("\t\t}\n");
		builder.append("\t\treturn ").append(propertyName).append(";\n");
		builder.append("\t}\n");
		// contains
		builder.append("\tpublic boolean contains").append(property.camelCaseName).append("(").append(keyType).append(" key) {\n");
		builder.append("\t\treturn get").append(property.camelCaseName).append("Map().containsKey(key);\n");
		builder.append("\t}\n");
		// get
		builder.append("\tpublic ").append(valueType).append(" get").append(property.camelCaseName).append("(").append(keyType).append(" key) {\n");
		builder.append("\t\treturn get").append(property.camelCaseName).append("Map().get(key);\n");
		builder.append("\t}\n");
	}
	
	private static void generateUserReadableProperty(Appendable builder, Type type, TypeRegistry registry, Property property) throws IOException {
		String propertyType = getTypeName(property.type, registry);
		String propertyName = "_" + property.lowerCamelCaseName;
		
		// has
		builder.append("\tpublic boolean has").append(property.camelCaseName).append("() {\n");
		builder.append("\t\treturn super.hasField(").append(property.camelCaseName).append("Key);\n");
		builder.append("\t}\n");
		// get
		builder.append("\tprotected ").append(propertyType).append(" ").append(propertyName).append(" = null;\n");
		builder.append("\tpublic ").append(propertyType).append(" get").append(property.camelCaseName).append("() {\n");
		builder.append("\t\tif (").append(propertyName).append(" == null) {\n");
		builder.append("\t\t\tObject value = super.getField(").append(property.camelCaseName).append("Key);\n");
		builder.append("\t\t\tif (value != null && value instanceof DBObject)\n");
		builder.append("\t\t\t\t").append(propertyName).append(" = ").append(propertyType).append(".wrap((DBObject)value);\n");
		builder.append("\t\t}\n");
		builder.append("\t\treturn ").append(propertyName).append(";\n");
		builder.append("\t}\n");
	}
	
	private static void generateBuilder(Appendable builder, Type type, TypeRegistry registry) throws IOException {
		builder.append("\tpublic static class Builder extends ").append(toCamelCase(type.name)).append(" {\n");
		// constructor
		builder.append("\t\tprivate Builder() {\n");
		builder.append("\t\t\tsuper(new BasicDBObject());\n");
		builder.append("\t\t}\n");
		
		for (Property p : type.properties) {
			// clear
			builder.append("\t\tpublic Builder clear").append(p.camelCaseName).append("() {\n");
			builder.append("\t\t\tsuper.clearField(").append(p.camelCaseName).append("Key);\n");
			builder.append("\t\t\treturn this;\n");
			builder.append("\t\t}\n");
			
			if (registry.types.containsKey(p.type)) {
				String propertyType = getTypeName(p.type, registry);
				// set
				builder.append("\t\tpublic Builder set").append(p.camelCaseName).append("(").append(propertyType).append(" value) {\n");
				builder.append("\t\t\t_").append(p.lowerCamelCaseName).append(" = value;\n");
				builder.append("\t\t\tsuper.setField(").append(p.camelCaseName).append("Key, _").append(p.lowerCamelCaseName).append(");\n");
				builder.append("\t\t\treturn this;\n");
				builder.append("\t\t}\n");
			} else if (p instanceof ArrayProperty) {
				String propertyType = getTypeName(p.type, registry);
				String propertyName = "_" + p.lowerCamelCaseName + "List";
				// getOrCreate
				builder.append("\t\tprotected List<").append(propertyType).append("> getOrCreate").append(p.camelCaseName).append("List() {\n");
				builder.append("\t\t\tList<").append(propertyType).append("> list = get").append(p.camelCaseName).append("List();\n");
				builder.append("\t\t\tif (list == null) {\n");
				builder.append("\t\t\t\t").append(propertyName).append(" = new ArrayList<").append(propertyType).append(">();\n");
				builder.append("\t\t\t\tsuper.setField(").append(p.camelCaseName).append("Key, ").append(propertyName).append(");\n");
				builder.append("\t\t\t}\n");
				builder.append("\t\t\treturn ").append(propertyName).append(";\n");
				builder.append("\t\t}\n");
				// add
				builder.append("\t\tpublic Builder add").append(p.camelCaseName).append("(").append(propertyType).append(" value) {\n");
				builder.append("\t\t\tgetOrCreate").append(p.camelCaseName).append("List().add(value);\n");
				builder.append("\t\t\treturn this;\n");
				builder.append("\t\t}\n");
				// addAll
				builder.append("\t\tpublic Builder addAll").append(p.camelCaseName).append("(Iterable<? extends ").append(propertyType).append("> value) {\n");
				builder.append("\t\t\tList<").append(propertyType).append("> list = getOrCreate").append(p.camelCaseName).append("List();\n");
				builder.append("\t\t\tfor (").append(propertyType).append(" item : value)\n");
				builder.append("\t\t\t\tlist.add(item);\n");
				builder.append("\t\t\treturn this;\n");
				builder.append("\t\t}\n");
			} else if (p instanceof MapProperty) {
				String keyType = getTypeName(((MapProperty)p).keyType, registry);
				String valueType = getTypeName(((MapProperty)p).valueType, registry);
				String propertyName = "_" + p.lowerCamelCaseName + "Map";
//				protected Map<String, MailAccount> getOrCreateAccountMap() {
//					Map<String, MailAccount> map = getAccountMap();
//					if (map == null) {
//						_accountMap = new HashMap<String, MailAccount>();
//						super.setField(AccountKey, _accountMap);
//					}
//					return _accountMap;
//				}
//				public Builder addAccount(String key, MailAccount value) {
//					getOrCreateAccountMap().put(key, value);
//					return this;
//				}
				// getOrCreate
				builder.append("\t\tprotected Map<").append(keyType).append(", ").append(valueType).append("> getOrCreate").append(p.camelCaseName).append("Map() {\n");
				builder.append("\t\t\tMap<").append(keyType).append(", ").append(valueType).append("> map = get").append(p.camelCaseName).append("Map();\n");
				builder.append("\t\t\tif (map == null) {\n");
				builder.append("\t\t\t\t").append(propertyName).append(" = new HashMap<").append(keyType).append(", ").append(valueType).append(">();\n");
				builder.append("\t\t\t\tsuper.setField(").append(p.camelCaseName).append("Key, ").append(propertyName).append(");\n");
				builder.append("\t\t\t}\n");
				builder.append("\t\t\treturn ").append(propertyName).append(";\n");
				builder.append("\t\t}\n");
				// add
				builder.append("\t\tpublic Builder add").append(p.camelCaseName).append("(").append(keyType).append(" key, ").append(valueType).append(" value) {\n");
				builder.append("\t\t\tgetOrCreate").append(p.camelCaseName).append("Map().put(key, value);\n");
				builder.append("\t\t\treturn this;\n");
				builder.append("\t\t}\n");
			} else {
				String propertyType = getTypeName(p.type, registry);
				// set
				builder.append("\t\tpublic Builder set").append(p.camelCaseName).append("(").append(propertyType).append(" value) {\n");
				builder.append("\t\t\tsuper.setField(").append(p.camelCaseName).append("Key, value);\n");
				builder.append("\t\t\treturn this;\n");
				builder.append("\t\t}\n");
			}
		}
		
		builder.append("\t}\n");
		
		builder.append("\tpublic static Builder newBuilder() {\n");
		builder.append("\t\treturn new Builder();\n");
		builder.append("\t}\n");
	}
	
	private static void generateObject(Appendable builder, Type type, TypeRegistry registry) throws IOException {
		generateImports(builder, type, registry);
		
		String camelCaseTypeName = toCamelCase(type.name);
		builder.append("public class ").append(camelCaseTypeName).append(" extends GuiceyDBObject implements ReadableDBObject {\n");
		
		generateProperties(builder, type, registry);
		
		builder.append("\tprivate ").append(toCamelCase(type.name)).append("(DBObject backing) {\n");
		builder.append("\t\tsuper(backing);\n");
		builder.append("\t}\n");
		
		for (Property p : type.properties) {
			if (registry.types.containsKey(p.type)) {
				generateUserReadableProperty(builder, type, registry, p);
			} else if (p instanceof ArrayProperty) {
				generateArrayReadableProperty(builder, type, registry, (ArrayProperty)p);
			} else if (p instanceof MapProperty) {
				generateMapReadableProperty(builder, type, registry, (MapProperty)p);
			} else {
				generatePrimitiveReadableProperty(builder, type, registry, p);
			}
		}
	
		builder.append("\tpublic static ").append(camelCaseTypeName).append(" wrap(DBObject backing) {\n");
		builder.append("\t\tif (backing == null)\n");
		builder.append("\t\t\treturn null;\n");
		builder.append("\t\treturn new ").append(camelCaseTypeName).append("(backing);\n");
		builder.append("\t}\n");
		
//		generateBuilder(builder, type, registry);
		
		builder.append("}\n");
	}
	
	public static String generate(Type type, TypeRegistry registry) throws IOException {
		StringBuilder builder = new StringBuilder();
		
		generateObject(builder, type, registry);
		
		return builder.toString();
	}
}
