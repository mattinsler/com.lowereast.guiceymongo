package com.lowereast.guiceymongo.data.generator;

import java.io.IOException;

import com.lowereast.guiceymongo.data.property.SetProperty;
import com.lowereast.guiceymongo.data.type.SetType;
import com.lowereast.guiceymongo.data.type.Type;
import com.lowereast.guiceymongo.data.type.UserEnumType;
import com.lowereast.guiceymongo.data.type.UserType;

public class SetPropertyGenerator extends PropertyGenerator<SetType, SetProperty> {
	public SetPropertyGenerator(TypeRegistry typeRegistry) {
		super(SetType.class, typeRegistry);
	}
	
	@Override
	public void createKey(Appendable builder, SetProperty property, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("public static final String ").append(property.getKeyName()).append(" = \"").append(property.getKeyValue()).append("\";\n");
	}
	
	@Override
	public void createReadableMethod(Appendable builder, SetProperty property, int indentCount) throws IOException {
		SetType type = property.getType();
		
		// getCount
		appendIndent(builder, indentCount).append("public abstract int get").append(property.getCamelCaseName()).append("Count();\n");
		// getSet
		appendIndent(builder, indentCount).append("public abstract ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("Set();\n");
		// contains
		appendIndent(builder, indentCount).append("public abstract boolean contains(").append(type.getCanonicalJavaType()).append(" value);\n");
	}
	
	@Override
	public void createWrapperMethod(Appendable builder, SetProperty property, int indentCount) throws IOException {
		SetType type = property.getType();
		Type itemType = type.getItemType();

		// member variable
		appendIndent(builder, indentCount).append("protected ").append(type.getCanonicalJavaType()).append(" ").append(property.getMemberVariableName()).append(" = null;\n");

		// getCount
		appendIndent(builder, indentCount).append("@Override public int get").append(property.getCamelCaseName()).append("Count() {\n");
		appendIndent(builder, indentCount + 1).append("java.util.Set<?> set = get").append(property.getCamelCaseName()).append("Set();\n");
		appendIndent(builder, indentCount + 1).append("return set == null ? 0 : set.size();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// getSet
		appendIndent(builder, indentCount).append("@SuppressWarnings(\"unchecked\") @Override public ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("Set() {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null) {\n");
		
		if (itemType instanceof UserType) {
			appendIndent(builder, indentCount + 2).append("Object value = _backing.get(").append(property.getKeyName()).append(");\n");
			appendIndent(builder, indentCount + 2).append("if (value != null && value instanceof java.util.List<?>) {\n");
			appendIndent(builder, indentCount + 3).append(type.getCanonicalJavaType()).append(" set = new java.util.HashSet<").append(itemType.getCanonicalJavaType()).append(">();\n");
			appendIndent(builder, indentCount + 3).append("for (com.mongodb.DBObject o : (java.util.List<com.mongodb.DBObject>)value)\n");
			appendIndent(builder, indentCount + 4).append("set.add(").append(itemType.getCanonicalJavaType()).append(".wrap(o));\n");
			appendIndent(builder, indentCount + 3).append(property.getMemberVariableName()).append(" = java.util.Collections.unmodifiableSet(set);\n");
			appendIndent(builder, indentCount + 2).append("}\n");
		} else {
			appendIndent(builder, indentCount + 2).append("Object value = _backing.get(").append(property.getKeyName()).append(");\n");
			appendIndent(builder, indentCount + 2).append("if (value != null && value instanceof java.util.List<?>)\n");
			appendIndent(builder, indentCount + 3).append(property.getMemberVariableName()).append(" = java.util.Collections.unmodifiableSet(new java.util.HashSet<").append(itemType.getCanonicalJavaType()).append(">((java.util.List<").append(itemType.getCanonicalJavaType()).append(">)value));\n");
		}
		
		appendIndent(builder, indentCount + 1).append("}\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// contains
		appendIndent(builder, indentCount).append("@Override public boolean contains(").append(type.getCanonicalJavaType()).append(" value) {\n");
		appendIndent(builder, indentCount + 1).append(type.getCanonicalJavaType()).append(" set = get").append(property.getCamelCaseName()).append("Set();\n");
		appendIndent(builder, indentCount + 1).append("return set == null ? null : set.contains(value);\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, SetProperty property, int indentCount) throws IOException {
		SetType type = property.getType();
		Type itemType = type.getItemType();
		
		// member variable
		if (itemType instanceof UserType)
			appendIndent(builder, indentCount).append("protected java.util.Set<").append(itemType.getCanonicalJavaType()).append(".Builder> ").append(property.getMemberVariableName()).append(" = null;\n");
		else
			appendIndent(builder, indentCount).append("protected ").append(type.getCanonicalJavaType()).append(" ").append(property.getMemberVariableName()).append(" = null;\n");
		
		// getCount
		appendIndent(builder, indentCount).append("@Override public int get").append(property.getCamelCaseName()).append("Count() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" == null ? 0 : ").append(property.getMemberVariableName()).append(".size();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// getSet
		if (itemType instanceof UserType)
			appendIndent(builder, indentCount).append("@Override public java.util.Set<").append(itemType.getCanonicalJavaType()).append(".Builder> get").append(property.getCamelCaseName()).append("Set() {\n");
		else
			appendIndent(builder, indentCount).append("@Override public ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("Set() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// contains
		appendIndent(builder, indentCount).append("@Override public boolean contains(").append(type.getCanonicalJavaType()).append(" value) {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" == null ? false : ").append(property.getMemberVariableName()).append(".contains(value);\n");
		appendIndent(builder, indentCount).append("}\n");

		// add
		if (itemType instanceof UserType)
			appendIndent(builder, indentCount).append("public Builder add").append(property.getCamelCaseName()).append("(").append(itemType.getCanonicalJavaType()).append(".Builder value) {\n");
		else
			appendIndent(builder, indentCount).append("public Builder add").append(property.getCamelCaseName()).append("(").append(itemType.getCanonicalJavaType()).append(" value) {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null)\n");
		if (itemType instanceof UserType)
			appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(" = new java.util.HashSet<").append(itemType.getCanonicalJavaType()).append(".Builder>();\n");
		else
			appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(" = new java.util.HashSet<").append(itemType.getCanonicalJavaType()).append(">();\n");
		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(".add(value);\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// addAll
		if (itemType instanceof UserType)
			appendIndent(builder, indentCount).append("public Builder addAll").append(property.getCamelCaseName()).append("(Iterable<? extends ").append(itemType.getCanonicalJavaType()).append(".Builder> value) {\n");
		else
			appendIndent(builder, indentCount).append("public Builder addAll").append(property.getCamelCaseName()).append("(Iterable<? extends ").append(itemType.getCanonicalJavaType()).append("> value) {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null)\n");
		if (itemType instanceof UserType) {
			appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(" = new java.util.HashSet<").append(itemType.getCanonicalJavaType()).append(".Builder>();\n");
			appendIndent(builder, indentCount + 1).append("for (").append(itemType.getCanonicalJavaType()).append(".Builder item : value)\n");
		} else {
			appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(" = new java.util.HashSet<").append(itemType.getCanonicalJavaType()).append(">();\n");
			appendIndent(builder, indentCount + 1).append("for (").append(itemType.getCanonicalJavaType()).append(" item : value)\n");
		}
		appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(".add(item);\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// clear
		appendIndent(builder, indentCount).append("public Builder clear").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(" = null;\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createBuilderBuild(Appendable builder, SetProperty property, int indentCount) throws IOException {
		SetType type = property.getType();
		Type itemType = type.getItemType();
		
		if (itemType instanceof UserEnumType) {
			appendIndent(builder, indentCount).append("if (").append(property.getMemberVariableName()).append(" != null) {\n");
			appendIndent(builder, indentCount + 1).append("java.util.List<String> list = new java.util.ArrayList<String>();\n");
			appendIndent(builder, indentCount + 1).append("for (").append(itemType.getCanonicalJavaType()).append(" value : ").append(property.getMemberVariableName()).append(")\n");
			appendIndent(builder, indentCount + 2).append("list.add(value.name());\n");
			appendIndent(builder, indentCount + 1).append("dbObject.put(").append(property.getKeyName()).append(", list);\n");
			appendIndent(builder, indentCount).append("}\n");
		} if (itemType instanceof UserType) {
			appendIndent(builder, indentCount).append("if (").append(property.getMemberVariableName()).append(" != null) {\n");
			appendIndent(builder, indentCount + 1).append("java.util.List<com.mongodb.DBObject> list = new java.util.ArrayList<com.mongodb.DBObject>();\n");
			appendIndent(builder, indentCount + 1).append("for (").append(itemType.getCanonicalJavaType()).append(".Builder value : ").append(property.getMemberVariableName()).append(")\n");
			appendIndent(builder, indentCount + 2).append("list.add(value.build());\n");
			appendIndent(builder, indentCount + 1).append("dbObject.put(").append(property.getKeyName()).append(", list);\n");
			appendIndent(builder, indentCount).append("}\n");
		} else {
			appendIndent(builder, indentCount).append("if (").append(property.getMemberVariableName()).append(" != null)\n");
			appendIndent(builder, indentCount + 1).append("dbObject.put(").append(property.getKeyName()).append(", new java.util.ArrayList<").append(itemType.getCanonicalJavaType()).append(">(").append(property.getMemberVariableName()).append("));\n");
		}
	}

	@Override
	public void createUpdaterMethod(Appendable builder, SetProperty property, int indentCount) throws IOException {
	}
	
	@Override
	public void createUpdaterBuildUpdate(Appendable builder, SetProperty property, int indentCount) throws IOException {
	}
}
