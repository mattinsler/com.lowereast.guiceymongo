package com.lowereast.guiceymongo.data.generator;

import java.io.IOException;

import com.lowereast.guiceymongo.data.property.SetProperty;
import com.lowereast.guiceymongo.data.type.SetType;
import com.lowereast.guiceymongo.data.type.Type;

public class SetPropertyGenerator extends PropertyGenerator<SetType, SetProperty> {
	public SetPropertyGenerator(TypeRegistry typeRegistry) {
		super(SetType.class, typeRegistry);
	}
	
	@Override
	public void createKey(Appendable builder, SetProperty property, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("public static final String ").append(property.getKeyName()).append(" = \"").append(property.getKeyValue()).append("\";\n");
	}
	
	@Override
	public void createReadable(Appendable builder, SetProperty property, int indentCount) throws IOException {
		SetType type = property.getType();
		Type itemType = type.getItemType();

		// member variable
		appendIndent(builder, indentCount).append("protected ").append(type.getSimpleJavaType()).append(" ").append(property.getMemberVariableName()).append(" = null;\n");
		
		// getCount
		appendIndent(builder, indentCount).append("public int get").append(property.getCamelCaseName()).append("Count() {\n");
		appendIndent(builder, indentCount + 1).append("Set<?> set = get").append(property.getCamelCaseName()).append("Set();\n");
		appendIndent(builder, indentCount + 1).append("return set == null ? 0 : set.size();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// getSet
		appendIndent(builder, indentCount).append("public ").append(type.getSimpleJavaType()).append(" get").append(property.getCamelCaseName()).append("Set() {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null) {\n");
		appendIndent(builder, indentCount + 2).append("List<").append(itemType.getSimpleJavaType()).append("> list = super.<").append(itemType.getSimpleJavaType()).append(">getList(").append(property.getKeyName()).append(");\n");
		appendIndent(builder, indentCount + 2).append("if (list != null)\n");
		appendIndent(builder, indentCount + 3).append(property.getMemberVariableName()).append(" = Collections.unmodifiableSet(new HashSet<String>(list));\n");
		appendIndent(builder, indentCount + 1).append("}\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createBuilder(Appendable builder, SetProperty property, int indentCount) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
