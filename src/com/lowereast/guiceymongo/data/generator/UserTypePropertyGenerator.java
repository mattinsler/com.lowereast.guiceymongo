package com.lowereast.guiceymongo.data.generator;

import java.io.IOException;

import com.lowereast.guiceymongo.data.property.UserTypeProperty;
import com.lowereast.guiceymongo.data.type.UserType;

public class UserTypePropertyGenerator extends PropertyGenerator<UserType, UserTypeProperty> {
	public UserTypePropertyGenerator(TypeRegistry typeRegistry) {
		super(UserType.class, typeRegistry);
	}
	
	@Override
	public void createKey(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("public static final String ").append(property.getKeyName()).append(" = \"").append(property.getKeyValue()).append("\";\n");
	}
	
	@Override
	public void createReadableMethod(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		createStandardReadableMethod(builder, property, indentCount);
	}
	
	@Override
	public void createWrapperMethod(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		UserType type = property.getType();
		
		// member variable
		appendIndent(builder, indentCount).append("protected ").append(type.getCanonicalJavaType()).append(" ").append(property.getMemberVariableName()).append(" = null;\n");
		
		// has
		appendIndent(builder, indentCount).append("@Override public boolean has").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return _backing.containsField(").append(property.getKeyName()).append(");\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("@Override public ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null) {\n");
		appendIndent(builder, indentCount + 2).append("Object value = _backing.get(").append(property.getKeyName()).append(");\n");
		appendIndent(builder, indentCount + 2).append("if (value != null && value instanceof com.mongodb.DBObject)\n");
		appendIndent(builder, indentCount + 3).append(property.getMemberVariableName()).append(" = ").append(type.getCanonicalJavaType()).append(".wrap((com.mongodb.DBObject)value);\n");
		appendIndent(builder, indentCount + 1).append("}\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		UserType type = property.getType();
		
		// member variable
		appendIndent(builder, indentCount).append("protected ").append(type.getCanonicalJavaType()).append(".Builder ").append(property.getMemberVariableName()).append(" = null;\n");
		
		// has
		appendIndent(builder, indentCount).append("@Override public boolean has").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" != null;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("@Override public ").append(type.getCanonicalJavaType()).append(".Builder get").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// set
		appendIndent(builder, indentCount).append("public Builder set").append(property.getCamelCaseName()).append("(").append(type.getCanonicalJavaType()).append(".Builder value) {\n");
		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(" = value;\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// clear
		appendIndent(builder, indentCount).append("public Builder clear").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(" = null;\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createBuilderBuild(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("if (").append(property.getMemberVariableName()).append(" != null)\n");
		appendIndent(builder, indentCount + 1).append("dbObject.put(").append(property.getKeyName()).append(", ").append(property.getMemberVariableName()).append(".build());\n");
	}
	
	@Override
	public void createUpdaterMethod(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		UserType type = property.getType();
		
		// has
		appendIndent(builder, indentCount).append("@Override public boolean has").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return _wrapper.has").append(property.getCamelCaseName()).append("() || _builder.has").append(property.getCamelCaseName()).append("();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("@Override public ").append(type.getCanonicalJavaType()).append(".Builder get").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return _builder.has").append(property.getCamelCaseName()).append("() ? _builder.get").append(property.getCamelCaseName()).append("() : _wrapper.get").append(property.getCamelCaseName()).append("();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// set
		appendIndent(builder, indentCount).append("public Updater set").append(property.getCamelCaseName()).append("(").append(type.getCanonicalJavaType()).append(".Builder value) {\n");
		appendIndent(builder, indentCount + 1).append("_builder.set").append(property.getCamelCaseName()).append("(value);\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// clear
		appendIndent(builder, indentCount).append("public Updater clear").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("_builder.clear").append(property.getCamelCaseName()).append("();\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createUpdaterBuildUpdate(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("if (_builder.has").append(property.getCamelCaseName()).append("())\n");
		appendIndent(builder, indentCount + 1).append("dbObject.put((\"\".equals(path) ? \"\" : path + \".\") + ").append(property.getKeyName()).append(", _builder.get").append(property.getCamelCaseName()).append("());\n");
	}
}
