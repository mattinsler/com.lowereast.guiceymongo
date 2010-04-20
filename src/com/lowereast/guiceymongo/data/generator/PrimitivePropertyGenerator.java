package com.lowereast.guiceymongo.data.generator;

import java.io.IOException;

import com.lowereast.guiceymongo.data.option.Option;
import com.lowereast.guiceymongo.data.property.PrimitiveProperty;
import com.lowereast.guiceymongo.data.type.PrimitiveType;

public class PrimitivePropertyGenerator extends PropertyGenerator<PrimitiveType, PrimitiveProperty> {
	public PrimitivePropertyGenerator(TypeRegistry typeRegistry) {
		super(PrimitiveType.class, typeRegistry);
	}
	
	@Override
	public void createKey(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		String keyValue;
		
		Option identityOption = property.getOption("identity");
		if (identityOption != null) {
			if (identityOption.getParameters().isEmpty())
				keyValue = "_id";
			else {
				keyValue = identityOption.getParameters().get("value").toString();
				if (keyValue == null)
					throw new RuntimeException("Problems with the identity option... Can only be [identity] or [identity('key')] or [identity(value='key')]");
			}
		} else {
			keyValue = property.getKeyValue();
		}
		
		appendIndent(builder, indentCount).append("public static final String ").append(property.getKeyName()).append(" = \"").append(keyValue).append("\";\n");
	}
	
	@Override
	public void createReadableMethod(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		createStandardReadableMethod(builder, property, indentCount);
	}
	
	@Override
	public void createWrapperMethod(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		PrimitiveType type = property.getType();

		// has
		appendIndent(builder, indentCount).append("@Override public boolean has").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return _backing.containsField(").append(property.getKeyName()).append(");\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("@Override public ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("() {\n");
		if (property.getOption("identity") != null && PrimitiveType.StringType.equals(type)) {
			appendIndent(builder, indentCount + 1).append("return _backing.get(").append(property.getKeyName()).append(").toString();\n");
		} else if (property.getOption("identity") != null && !PrimitiveType.ObjectIdType.equals(type)) {
			throw new RuntimeException("Option identity is only valid for properties of type string or object_id");
		} else if (PrimitiveType.Int32Type.equals(type)) {
			appendIndent(builder, indentCount + 1).append("Object value = _backing.get(").append(property.getKeyName()).append(");\n");
			appendIndent(builder, indentCount + 1).append("if (value instanceof Double)\n");
			appendIndent(builder, indentCount + 2).append("return ((Double)value).intValue();\n");
			appendIndent(builder, indentCount + 1).append("return (Integer)value;\n");
		} else {
			appendIndent(builder, indentCount + 1).append("return (").append(type.getJavaBoxedType()).append(")_backing.get(").append(property.getKeyName()).append(");\n");
		}
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		PrimitiveType type = property.getType();
		
		// member variable
		appendIndent(builder, indentCount).append("protected ").append(type.getJavaBoxedType()).append(" ").append(property.getMemberVariableName()).append(" = null;\n");
		
		// has
		appendIndent(builder, indentCount).append("@Override public boolean has").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" != null;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("@Override public ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// set
		appendIndent(builder, indentCount).append("public Builder set").append(property.getCamelCaseName()).append("(").append(type.getCanonicalJavaType()).append(" value) {\n");
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
	public void createBuilderBuild(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("if (").append(property.getMemberVariableName()).append(" != null)\n");
		appendIndent(builder, indentCount + 1).append("dbObject.put(").append(property.getKeyName()).append(", ").append(property.getMemberVariableName()).append(");\n");
	}
	
	@Override
	public void createUpdaterMethod(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		PrimitiveType type = property.getType();
		
		// has
		appendIndent(builder, indentCount).append("@Override public boolean has").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return _wrapper.has").append(property.getCamelCaseName()).append("() || _builder.has").append(property.getCamelCaseName()).append("();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("@Override public ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return _builder.has").append(property.getCamelCaseName()).append("() ? _builder.get").append(property.getCamelCaseName()).append("() : _wrapper.get").append(property.getCamelCaseName()).append("();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// set
		appendIndent(builder, indentCount).append("public Updater set").append(property.getCamelCaseName()).append("(").append(type.getCanonicalJavaType()).append(" value) {\n");
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
	public void createUpdaterBuildUpdate(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("if (_builder.has").append(property.getCamelCaseName()).append("())\n");
		appendIndent(builder, indentCount + 1).append("dbObject.put(").append(property.getKeyName()).append(", _builder.get").append(property.getCamelCaseName()).append("());\n");
	}
}
