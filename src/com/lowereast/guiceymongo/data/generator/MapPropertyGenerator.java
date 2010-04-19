package com.lowereast.guiceymongo.data.generator;

import java.io.IOException;

import com.lowereast.guiceymongo.data.property.MapProperty;
import com.lowereast.guiceymongo.data.type.MapType;
import com.lowereast.guiceymongo.data.type.Type;

public class MapPropertyGenerator extends PropertyGenerator<MapType, MapProperty> {
	public MapPropertyGenerator(TypeRegistry typeRegistry) {
		super(MapType.class, typeRegistry);
	}
	
	@Override
	public void createKey(Appendable builder, MapProperty property, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("public static final String ").append(property.getKeyName()).append(" = \"").append(property.getKeyValue()).append("\";\n");
	}

	@Override
	public void createReadable(Appendable builder, MapProperty property, int indentCount) throws IOException {
		MapType type = property.getType();
		Type keyType = type.getKeyType();
		Type valueType = type.getValueType();

		// member variable
		appendIndent(builder, indentCount).append("protected ").append(type.getSimpleJavaType()).append(" ").append(property.getMemberVariableName()).append(" = null;\n");
		
		// getMap
		appendIndent(builder, indentCount).append("protected ").append(type.getSimpleJavaType()).append(" get").append(property.getCamelCaseName()).append("Map() {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null) {\n");
		appendIndent(builder, indentCount + 2).append("Object value = super.getField(" + property.getKeyName() + ");\n");
		appendIndent(builder, indentCount + 2).append("if (value != null && value instanceof DBObject) {\n");
		
		appendIndent(builder, indentCount + 3).append(type.getSimpleJavaType()).append(" map = new Hash").append(type.getSimpleJavaType()).append("();\n");
		appendIndent(builder, indentCount + 3).append("DBObject obj = (DBObject)value;\n");
		appendIndent(builder, indentCount + 3).append("for (String key : obj.keySet())\n");
		appendIndent(builder, indentCount + 4).append("map.put(DBObjectUtil.decodeKey(key), ").append(valueType.getSimpleJavaType()).append(".wrap((DBObject)obj.get(key)));\n");
		appendIndent(builder, indentCount + 3).append(property.getMemberVariableName()).append(" = Collections.unmodifiableMap(map);\n");
		
		appendIndent(builder, indentCount + 2).append("}\n");
		appendIndent(builder, indentCount + 1).append("}\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");

		// contains
		appendIndent(builder, indentCount).append("public boolean contains").append(property.getCamelCaseName()).append("(").append(keyType.getSimpleJavaType()).append(" key) {\n");
		appendIndent(builder, indentCount + 1).append("Map<?, ?> map = get").append(property.getCamelCaseName()).append("Map();\n");
		appendIndent(builder, indentCount + 1).append("return map == null ? false : map.containsKey(key);\n");
		appendIndent(builder, indentCount).append("}\n");

		// get
		appendIndent(builder, indentCount).append("public ").append(valueType.getSimpleJavaType()).append(" get").append(property.getCamelCaseName()).append("(").append(keyType.getSimpleJavaType()).append(" key) {\n");
		appendIndent(builder, indentCount + 1).append(type.getSimpleJavaType()).append(" map = get").append(property.getCamelCaseName()).append("Map();\n");
		appendIndent(builder, indentCount + 1).append("return map == null ? null : map.get(key);\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// getCount
		appendIndent(builder, indentCount).append("public int get").append(property.getCamelCaseName()).append("Count() {\n");
		appendIndent(builder, indentCount + 1).append(type.getSimpleJavaType()).append(" map = get").append(property.getCamelCaseName()).append("Map();\n");
		appendIndent(builder, indentCount + 1).append("return map == null ? 0 : map.size();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// keys
		appendIndent(builder, indentCount).append("public Set<String> get").append(property.getCamelCaseName()).append("Keys() {\n");
		appendIndent(builder, indentCount + 1).append(type.getSimpleJavaType()).append(" map = get").append(property.getCamelCaseName()).append("Map();\n");
		appendIndent(builder, indentCount + 1).append("return map == null ? null : map.keySet();\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createBuilder(Appendable builder, MapProperty property, int indentCount) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
