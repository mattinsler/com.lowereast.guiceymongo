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
	public void createReadable(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		PrimitiveType type = property.getType();
		
		// has
		appendIndent(builder, indentCount).append("public boolean has").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return super.hasField(").append(property.getKeyName()).append(");\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("public ").append(type.getSimpleJavaType()).append(" get").append(property.getCamelCaseName()).append("() {\n");
		if (property.getOption("identity") != null) {
			if (PrimitiveType.StringType.equals(type)) {
				appendIndent(builder, indentCount + 1).append("return super.getField(").append(property.getKeyName()).append(").toString();\n");
			} else if (PrimitiveType.ObjectIdType.equals(type)) {
				appendIndent(builder, indentCount + 1).append("return super.<").append(type.getJavaBoxedType()).append(">_getField(").append(property.getKeyName()).append(");\n");
			} else {
				throw new RuntimeException("Option identity is only valid for properties of type string or object_id");
			}
		} else {
			if (PrimitiveType.Int32Type.equals(type)) {
				appendIndent(builder, indentCount + 1).append("Object value = super._getField(").append(property.getKeyName()).append(");\n");
				appendIndent(builder, indentCount + 1).append("if (value instanceof Double)\n");
				appendIndent(builder, indentCount + 2).append("return ((Double)value).intValue();\n");
				appendIndent(builder, indentCount + 1).append("return (Integer)value;\n");
			} else {
				appendIndent(builder, indentCount + 1).append("return super.<").append(type.getJavaBoxedType()).append(">_getField(").append(property.getKeyName()).append(");\n");
			}
		}
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createBuilder(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		PrimitiveType type = property.getType();
		
		// member variable
		appendIndent(builder, indentCount).append("protected ").append(type.getJavaBoxedType()).append(" ").append(property.getMemberVariableName()).append(" = null;\n");
		
		// has
		appendIndent(builder, indentCount).append("public boolean has").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" != null;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("public ").append(type.getSimpleJavaType()).append(" get").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// set
		appendIndent(builder, indentCount).append("public Builder set").append(property.getCamelCaseName()).append("(").append(type.getSimpleJavaType()).append(" value) {\n");
		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(" = value;\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// clear
		appendIndent(builder, indentCount).append("public Builder clear").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(" = null;\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
	}
}
