package com.lowereast.guiceymongo.data.generator;

import java.io.IOException;

import com.lowereast.guiceymongo.data.property.ListProperty;
import com.lowereast.guiceymongo.data.type.ListType;
import com.lowereast.guiceymongo.data.type.Type;
import com.lowereast.guiceymongo.data.type.UserType;

public class ListPropertyGenerator extends PropertyGenerator<ListType, ListProperty> {
	public ListPropertyGenerator(TypeRegistry typeRegistry) {
		super(ListType.class, typeRegistry);
	}
	
	@Override
	public void createKey(Appendable builder, ListProperty property, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("public static final String ").append(property.getKeyName()).append(" = \"").append(property.getKeyValue()).append("\";\n");
	}
	
	@Override
	public void createReadable(Appendable builder, ListProperty property, int indentCount) throws IOException {
		ListType type = property.getType();
		Type itemType = type.getItemType();

		// member variable
		appendIndent(builder, indentCount).append("protected ").append(type.getSimpleJavaType()).append(" ").append(property.getMemberVariableName()).append(" = null;\n");
		
		// getCount
		appendIndent(builder, indentCount).append("public int get").append(property.getCamelCaseName()).append("Count() {\n");
		appendIndent(builder, indentCount + 1).append("List<?> list = get").append(property.getCamelCaseName()).append("List();\n");
		appendIndent(builder, indentCount + 1).append("return list == null ? 0 : list.size();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// getList
		appendIndent(builder, indentCount).append("public ").append(type.getSimpleJavaType()).append(" get").append(property.getCamelCaseName()).append("List() {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null) {\n");
		
		if (itemType instanceof UserType) {
			appendIndent(builder, indentCount + 2).append("List<DBObject> list = super.<DBObject>getList(").append(property.getKeyName()).append(");\n");
			appendIndent(builder, indentCount + 2).append("if (list != null) {\n");
			appendIndent(builder, indentCount + 3).append(type.getSimpleJavaType()).append(" value = new ArrayList<").append(itemType.getSimpleJavaType()).append(">();\n");
			appendIndent(builder, indentCount + 3).append("for (DBObject o : list)\n");
			appendIndent(builder, indentCount + 4).append("value.add(").append(itemType.getSimpleJavaType()).append(".wrap(o));\n");
			appendIndent(builder, indentCount + 3).append(property.getMemberVariableName()).append(" = Collections.unmodifiableList(value);\n");
			appendIndent(builder, indentCount + 2).append("}\n");
		} else {
			appendIndent(builder, indentCount + 2).append(type.getSimpleJavaType()).append(" list = super.<").append(itemType.getSimpleJavaType()).append(">getList(").append(property.getKeyName()).append(");\n");
			appendIndent(builder, indentCount + 2).append("if (list != null)\n");
			appendIndent(builder, indentCount + 3).append(property.getMemberVariableName()).append(" = Collections.unmodifiableList(list);\n");
		}
		
		appendIndent(builder, indentCount + 1).append("}\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createBuilder(Appendable builder, ListProperty property, int indentCount) throws IOException {
		ListType type = property.getType();
		
		// member variable
		appendIndent(builder, indentCount).append("protected ").append(type.getSimpleJavaType()).append(" ").append(property.getMemberVariableName()).append(" = null;\n");
		
		// has
		appendIndent(builder, indentCount).append("public boolean has").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" != null;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("public ").append(type.getSimpleJavaType()).append(" get").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// add
		appendIndent(builder, indentCount).append("public Builder add").append(property.getCamelCaseName()).append("(").append(type.getSimpleJavaType()).append(" value) {\n");
//		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(" = value;\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// addAll
		appendIndent(builder, indentCount).append("public Builder addAll").append(property.getCamelCaseName()).append("(").append(type.getSimpleJavaType()).append(" value) {\n");
//		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(" = value;\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// clear
		appendIndent(builder, indentCount).append("public Builder clear").append(property.getCamelCaseName()).append("() {\n");
//		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(" = null;\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
	}
}
