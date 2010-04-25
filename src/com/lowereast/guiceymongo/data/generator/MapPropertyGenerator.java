package com.lowereast.guiceymongo.data.generator;

import java.io.IOException;

import com.lowereast.guiceymongo.data.property.MapProperty;
import com.lowereast.guiceymongo.data.type.ListType;
import com.lowereast.guiceymongo.data.type.MapType;
import com.lowereast.guiceymongo.data.type.SetType;
import com.lowereast.guiceymongo.data.type.Type;
import com.lowereast.guiceymongo.data.type.UserEnumType;
import com.lowereast.guiceymongo.data.type.UserType;

public class MapPropertyGenerator extends PropertyGenerator<MapType, MapProperty> {
	public MapPropertyGenerator(TypeRegistry typeRegistry) {
		super(MapType.class, typeRegistry);
	}
	
	@Override
	public void createKey(Appendable builder, MapProperty property, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("public static final String ").append(property.getKeyName()).append(" = \"").append(property.getKeyValue()).append("\";\n");
	}
	
	@Override
	public void createReadableMethod(Appendable builder, MapProperty property, int indentCount) throws IOException {
		MapType type = property.getType();
		Type keyType = type.getKeyType();
		Type valueType = type.getValueType();
		
		// contains
		appendIndent(builder, indentCount).append("public abstract boolean contains").append(property.getCamelCaseName()).append("(").append(keyType.getCanonicalJavaType()).append(" key);\n");
		// getCount
		appendIndent(builder, indentCount).append("public abstract int get").append(property.getCamelCaseName()).append("Count();\n");
		// get
		appendIndent(builder, indentCount).append("public abstract ").append(valueType.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("(").append(keyType.getCanonicalJavaType()).append(" key);\n");
		// keys
		appendIndent(builder, indentCount).append("public abstract java.util.Set<String> get").append(property.getCamelCaseName()).append("Keys();\n");
	}

	@Override
	public void createWrapperMethod(Appendable builder, MapProperty property, int indentCount) throws IOException {
		MapType type = property.getType();
		Type keyType = type.getKeyType();
		Type valueType = type.getValueType();

		// member variable
		appendIndent(builder, indentCount).append("protected ").append(type.getCanonicalJavaType()).append(" ").append(property.getMemberVariableName()).append(" = null;\n");

		// getMap
		if (valueType instanceof ListType || valueType instanceof SetType)
			appendIndent(builder, indentCount).append("@SuppressWarnings(\"unchecked\")\n");
		appendIndent(builder, indentCount).append("protected ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("Map() {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null) {\n");
		appendIndent(builder, indentCount + 2).append("Object value = _backing.get(" + property.getKeyName() + ");\n");
		appendIndent(builder, indentCount + 2).append("if (value != null && value instanceof com.mongodb.DBObject) {\n");
		
		appendIndent(builder, indentCount + 3).append(type.getCanonicalJavaType()).append(" map = new java.util.HashMap<").append(keyType.getCanonicalJavaType()).append(", ").append(valueType.getCanonicalJavaType()).append(">();\n");
		appendIndent(builder, indentCount + 3).append("com.mongodb.DBObject obj = (com.mongodb.DBObject)value;\n");
		appendIndent(builder, indentCount + 3).append("for (String key : obj.keySet()) {\n");
		
		if (valueType instanceof ListType) {
			Type itemType = ((ListType)valueType).getItemType();
			
			if (itemType instanceof UserEnumType) {
			} else if (itemType instanceof UserType) {
//				appendIndent(builder, indentCount + 2).append("Object value = _backing.get(").append(property.getKeyName()).append(");\n");
//				appendIndent(builder, indentCount + 2).append("if (value != null && value instanceof java.util.List<?>) {\n");
//				appendIndent(builder, indentCount + 3).append(type.getCanonicalJavaType()).append(" list = new java.util.ArrayList<").append(itemType.getCanonicalJavaType()).append(">();\n");
//				appendIndent(builder, indentCount + 3).append("for (com.mongodb.DBObject o : (java.util.List<com.mongodb.DBObject>)value)\n");
//				appendIndent(builder, indentCount + 4).append("list.add(").append(itemType.getCanonicalJavaType()).append(".wrap(o));\n");
//				appendIndent(builder, indentCount + 3).append(property.getMemberVariableName()).append(" = java.util.Collections.unmodifiableList(list);\n");
//				appendIndent(builder, indentCount + 2).append("}\n");
			} else {
				appendIndent(builder, indentCount + 4).append("Object list = obj.get(key);\n");
				appendIndent(builder, indentCount + 4).append("if (list != null && list instanceof java.util.List<?>)\n");
				appendIndent(builder, indentCount + 5).append("map.put(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key), (").append(valueType.getCanonicalJavaType()).append(")list);\n");
			}
		} else if (valueType instanceof SetType) {
			Type itemType = ((SetType)valueType).getItemType();
			
			if (itemType instanceof UserEnumType) {
			} else if (itemType instanceof UserType) {
//				appendIndent(builder, indentCount + 2).append("Object value = _backing.get(").append(property.getKeyName()).append(");\n");
//				appendIndent(builder, indentCount + 2).append("if (value != null && value instanceof java.util.List<?>) {\n");
//				appendIndent(builder, indentCount + 3).append(type.getCanonicalJavaType()).append(" list = new java.util.ArrayList<").append(itemType.getCanonicalJavaType()).append(">();\n");
//				appendIndent(builder, indentCount + 3).append("for (com.mongodb.DBObject o : (java.util.List<com.mongodb.DBObject>)value)\n");
//				appendIndent(builder, indentCount + 4).append("list.add(").append(itemType.getCanonicalJavaType()).append(".wrap(o));\n");
//				appendIndent(builder, indentCount + 3).append(property.getMemberVariableName()).append(" = java.util.Collections.unmodifiableList(list);\n");
//				appendIndent(builder, indentCount + 2).append("}\n");
			} else {
				appendIndent(builder, indentCount + 4).append("Object list = obj.get(key);\n");
				appendIndent(builder, indentCount + 4).append("if (list != null && list instanceof java.util.List<?>)\n");
				appendIndent(builder, indentCount + 5).append("map.put(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key), new java.util.HashSet<").append(itemType.getCanonicalJavaType()).append(">((java.util.List<").append(itemType.getCanonicalJavaType()).append(">)list));\n");
			}
		} else {
			appendIndent(builder, indentCount + 4).append("map.put(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key), ").append(valueType.getCanonicalJavaType()).append(".wrap((com.mongodb.DBObject)obj.get(key)));\n");
		}
		
		appendIndent(builder, indentCount + 3).append("}\n");
		appendIndent(builder, indentCount + 3).append(property.getMemberVariableName()).append(" = java.util.Collections.unmodifiableMap(map);\n");
		
		appendIndent(builder, indentCount + 2).append("}\n");
		appendIndent(builder, indentCount + 1).append("}\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");

		// contains
		appendIndent(builder, indentCount).append("@Override public boolean contains").append(property.getCamelCaseName()).append("(").append(keyType.getCanonicalJavaType()).append(" key) {\n");
		appendIndent(builder, indentCount + 1).append("java.util.Map<?, ?> map = get").append(property.getCamelCaseName()).append("Map();\n");
		appendIndent(builder, indentCount + 1).append("return map == null ? false : map.containsKey(key);\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("@Override public ").append(valueType.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("(").append(keyType.getCanonicalJavaType()).append(" key) {\n");
		appendIndent(builder, indentCount + 1).append(type.getCanonicalJavaType()).append(" map = get").append(property.getCamelCaseName()).append("Map();\n");
		appendIndent(builder, indentCount + 1).append("return map == null ? null : map.get(key);\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// getCount
		appendIndent(builder, indentCount).append("@Override public int get").append(property.getCamelCaseName()).append("Count() {\n");
		appendIndent(builder, indentCount + 1).append(type.getCanonicalJavaType()).append(" map = get").append(property.getCamelCaseName()).append("Map();\n");
		appendIndent(builder, indentCount + 1).append("return map == null ? 0 : map.size();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// keys
		appendIndent(builder, indentCount).append("@Override public java.util.Set<String> get").append(property.getCamelCaseName()).append("Keys() {\n");
		appendIndent(builder, indentCount + 1).append(type.getCanonicalJavaType()).append(" map = get").append(property.getCamelCaseName()).append("Map();\n");
		appendIndent(builder, indentCount + 1).append("return map == null ? null : map.keySet();\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, MapProperty property, int indentCount) throws IOException {
		MapType type = property.getType();
		Type keyType = type.getKeyType();
		Type valueType = type.getValueType();

		// member variable
		if (valueType instanceof UserType)
			appendIndent(builder, indentCount).append("protected java.util.Map<").append(keyType.getCanonicalJavaType()).append(", ").append(valueType.getCanonicalJavaType()).append(".Builder> ").append(property.getMemberVariableName()).append(" = null;\n");
		else
			appendIndent(builder, indentCount).append("protected ").append(type.getCanonicalJavaType()).append(" ").append(property.getMemberVariableName()).append(" = null;\n");

		// getMap
		if (valueType instanceof UserType)
			appendIndent(builder, indentCount).append("protected java.util.Map<").append(keyType.getCanonicalJavaType()).append(", ").append(valueType.getCanonicalJavaType()).append(".Builder> get").append(property.getCamelCaseName()).append("Map() {\n");
		else
			appendIndent(builder, indentCount).append("protected ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("Map() {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null)\n");
		if (valueType instanceof UserType)
			appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(" = new java.util.HashMap<").append(keyType.getCanonicalJavaType()).append(", ").append(valueType.getCanonicalJavaType()).append(".Builder>();\n");
		else
			appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(" = new java.util.HashMap<").append(keyType.getCanonicalJavaType()).append(", ").append(valueType.getCanonicalJavaType()).append(">();\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");

		// contains
		appendIndent(builder, indentCount).append("@Override public boolean contains").append(property.getCamelCaseName()).append("(").append(keyType.getCanonicalJavaType()).append(" key) {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" == null ? false : ").append(property.getMemberVariableName()).append(".containsKey(key);\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		if (valueType instanceof UserType)
			appendIndent(builder, indentCount).append("@Override public ").append(valueType.getCanonicalJavaType()).append(".Builder get").append(property.getCamelCaseName()).append("(").append(keyType.getCanonicalJavaType()).append(" key) {\n");
		else
			appendIndent(builder, indentCount).append("@Override public ").append(valueType.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("(").append(keyType.getCanonicalJavaType()).append(" key) {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" == null ? null : ").append(property.getMemberVariableName()).append(".get(key);\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// getCount
		appendIndent(builder, indentCount).append("@Override public int get").append(property.getCamelCaseName()).append("Count() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" == null ? 0 : ").append(property.getMemberVariableName()).append(".size();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// keys
		appendIndent(builder, indentCount).append("@Override public java.util.Set<String> get").append(property.getCamelCaseName()).append("Keys() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" == null ? null : ").append(property.getMemberVariableName()).append(".keySet();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// add
		if (valueType instanceof UserType)
			appendIndent(builder, indentCount).append("public Builder add").append(property.getCamelCaseName()).append("(").append(keyType.getCanonicalJavaType()).append(" key, ").append(valueType.getCanonicalJavaType()).append(".Builder value) {\n");
		else
			appendIndent(builder, indentCount).append("public Builder add").append(property.getCamelCaseName()).append("(").append(keyType.getCanonicalJavaType()).append(" key, ").append(valueType.getCanonicalJavaType()).append(" value) {\n");
		appendIndent(builder, indentCount + 1).append("get").append(property.getCamelCaseName()).append("Map().put(key, value);\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// clear
		appendIndent(builder, indentCount).append("public Builder clear").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(" = null;\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createBuilderBuild(Appendable builder, MapProperty property, int indentCount) throws IOException {
		MapType type = property.getType();
		Type keyType = type.getKeyType();
		Type valueType = type.getValueType();
		
		if (valueType instanceof UserEnumType) {
			appendIndent(builder, indentCount).append("if (").append(property.getMemberVariableName()).append(" != null) {\n");
			appendIndent(builder, indentCount + 1).append("java.util.Map<String, String> map = new java.util.HashMap<String, String>();\n");
			appendIndent(builder, indentCount + 1).append("for (java.util.Map.Entry<").append(keyType.getCanonicalJavaType()).append(", ").append(valueType.getCanonicalJavaType()).append("> value : ").append(property.getMemberVariableName()).append(".entrySet())\n");
			appendIndent(builder, indentCount + 2).append("map.put(com.lowereast.guiceymongo.util.DBObjectUtil.encodeKey(value.getKey()), value.getValue().name());\n");
			appendIndent(builder, indentCount + 1).append("dbObject.put(").append(property.getKeyName()).append(", map);\n");
			appendIndent(builder, indentCount).append("}\n");
		} else if (valueType instanceof UserType) {
			appendIndent(builder, indentCount).append("if (").append(property.getMemberVariableName()).append(" != null) {\n");
			appendIndent(builder, indentCount + 1).append("java.util.Map<String, com.mongodb.DBObject> map = new java.util.HashMap<String, com.mongodb.DBObject>();\n");
			appendIndent(builder, indentCount + 1).append("for (java.util.Map.Entry<").append(keyType.getCanonicalJavaType()).append(", ").append(valueType.getCanonicalJavaType()).append(".Builder> value : ").append(property.getMemberVariableName()).append(".entrySet())\n");
			appendIndent(builder, indentCount + 2).append("map.put(com.lowereast.guiceymongo.util.DBObjectUtil.encodeKey(value.getKey()), value.getValue().build());\n");
			appendIndent(builder, indentCount + 1).append("dbObject.put(").append(property.getKeyName()).append(", map);\n");
			appendIndent(builder, indentCount).append("}\n");
		} else {
			appendIndent(builder, indentCount).append("if (").append(property.getMemberVariableName()).append(" != null)\n");
			appendIndent(builder, indentCount + 1).append("dbObject.put(").append(property.getKeyName()).append(", ").append(property.getMemberVariableName()).append(");\n");
		}
	}
	
	@Override
	public void createUpdaterMethod(Appendable builder, MapProperty property, int indentCount) throws IOException {
	}
	
	@Override
	public void createUpdaterBuildUpdate(Appendable builder, MapProperty property, int indentCount) throws IOException {
	}
}
