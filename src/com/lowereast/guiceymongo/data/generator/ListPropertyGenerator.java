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

package com.lowereast.guiceymongo.data.generator;

import java.io.IOException;

import org.antlr.stringtemplate.StringTemplate;

import com.lowereast.guiceymongo.data.generator.property.ListProperty;
import com.lowereast.guiceymongo.data.generator.type.ListType;
import com.lowereast.guiceymongo.data.generator.type.PrimitiveType;
import com.lowereast.guiceymongo.data.generator.type.Type;
import com.lowereast.guiceymongo.data.generator.type.UserEnumType;
import com.lowereast.guiceymongo.data.generator.type.UserType;

public class ListPropertyGenerator extends PropertyGenerator<ListType, ListProperty> {
	public ListPropertyGenerator(TypeRegistry typeRegistry) {
		super(ListType.class, typeRegistry);
	}

	@Override
	public void createEquals(Appendable builder, ListProperty property, int indentCount) throws IOException {
		Type itemType = property.getType().getItemType();
		
		String s =
			"if (this.get$p.camelCaseName$Count() != other.get$p.camelCaseName$Count())\n" +
        		"return false;\n" +
        	"for (int index = 0; index < this.get$p.camelCaseName$Count(); ++index) {\n";
		if (PrimitiveType.BoolType.equals(itemType) ||
				PrimitiveType.DoubleType.equals(itemType) ||
				PrimitiveType.FloatType.equals(itemType) ||
				PrimitiveType.Int32Type.equals(itemType) ||
				PrimitiveType.Int64Type.equals(itemType)) {
			s +=
				"if (this.get$p.camelCaseName$(index) != other.get$p.camelCaseName$(index))";
		} else
			s +=
				"if (!this.get$p.camelCaseName$(index).equals(other.get$p.camelCaseName$(index)))";
		s +=
					"return false;\n" +
			"}\n";
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}

	@Override
	public void createKey(Appendable builder, ListProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"public static final String $p.keyName$ = \"$p.keyValue$\";\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createReadableMethod(Appendable builder, ListProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"public abstract int get$p.camelCaseName$Count();\n" +
				"public abstract $p.listType$ get$p.camelCaseName$List();\n" +
				"public abstract $p.itemType$ get$p.camelCaseName$(int index);\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createWrapperMethod(Appendable builder, ListProperty property, int indentCount) throws IOException {
		ListType type = property.getType();

		String s =
				"protected $p.listType$ $p.memberVariableName$ = null;\n" +
				"@Override\n" +
				"public int get$p.camelCaseName$Count() {\n" +
					"$p.listType$ list = get$p.camelCaseName$List();\n" +
					"return list == null ? 0 : list.size();\n" +
				"}\n" +
				"@SuppressWarnings(\"unchecked\")\n" +
				"@Override\n" +
				"public $p.listType$ get$p.camelCaseName$List() {\n" +
					"if ($p.memberVariableName$ == null) {\n" +
						"Object value = _backing.get($p.keyName$);\n" +
						"if (value != null && value instanceof java.util.List<?>) {\n";

		if (type.getItemType() instanceof UserEnumType) {
			s +=
							"$p.listType$ list = new $p.newListType$();\n" +
							"for (String item : (java.util.List<String>)value) {\n" +
								"try {\n" +
									"list.add($p.listItemType$.valueOf(item));\n" +
								"} catch (Exception e) {\n" +
								"}\n" +
							"}\n" +
							"$p.memberVariableName$ = java.util.Collections.unmodifiableList(list);\n";
		} else if (type.getItemType() instanceof UserType) {
			s +=
							"$p.listType$ list = new $p.newListType$();\n" +
							"for (com.mongodb.DBObject o : (java.util.List<com.mongodb.DBObject>)value)\n" +
								"list.add($p.listItemType$.wrap(o));\n" +
							"$p.memberVariableName$ = java.util.Collections.unmodifiableList(list);\n";
		} else
			s +=			"$p.memberVariableName$ = java.util.Collections.unmodifiableList(($p.listType$)value);\n";
		
		s +=
						"}\n" +
					"}\n" +
					"return $p.memberVariableName$;\n" +
				"}\n" +
				"@Override\n" +
				"public $p.itemType$ get$p.camelCaseName$(int index) {\n" +
					"$p.listType$ list = get$p.camelCaseName$List();\n" +
					"if (list == null)\n" +
						"throw new IndexOutOfBoundsException();\n" +
					"return list.get(index);\n" +
				"}\n";
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, ListProperty property, int indentCount) throws IOException {
		Type itemType = property.getType().getItemType();
		
		String s =
				// member variable
				"protected $p.listType$ $p.memberVariableName$ = null;\n" +
				// getCount
				"@Override\n" +
				"public int get$p.camelCaseName$Count() {\n" +
					"return $p.memberVariableName$ == null ? 0 : $p.memberVariableName$.size();\n" +
				"}\n" +
				// getList
				"@Override\n" +
				"public $p.listType$ get$p.camelCaseName$List() {\n" +
					"return java.util.Collections.unmodifiableList($p.memberVariableName$);\n" +
				"}\n" +
				"@Override\n" +
				// get
				"public $p.builderItemType$ get$p.camelCaseName$(int index) {\n";
		if (itemType instanceof UserType)
			s +=	"return $p.memberVariableName$ == null ? null : ($p.builderItemType$)$p.memberVariableName$.get(index);\n";
		else
			s +=	"return $p.memberVariableName$ == null ? null : $p.memberVariableName$.get(index);\n";
		s +=
				"}\n" +
				// add
				"public Builder add$p.camelCaseName$($p.builderItemType$ value) {\n" +
					"if ($p.memberVariableName$ == null)\n" +
						"$p.memberVariableName$ = new $p.newListType$();\n" +
					"$p.memberVariableName$.add(value);\n" +
					"return this;\n" +
				"}\n" +
				// addAll
				"public Builder addAll$p.camelCaseName$(Iterable<? extends $p.builderListItemType$> value) {\n" +
					"if ($p.memberVariableName$ == null)\n" +
						"$p.memberVariableName$ = new $p.newListType$();\n" +
					"for ($p.builderItemType$ item : value)\n" +
						"$p.memberVariableName$.add(item);\n" +
					"return this;\n" +
				"}\n" +
				// clear
				"public Builder clear$p.camelCaseName$() {\n" +
					"$p.memberVariableName$ = null;\n" +
					"return this;\n" +
				"}\n";

		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderNewBuilder(Appendable builder, ListProperty property, int indentCount) throws IOException {
		Type itemType = property.getType().getItemType();
		
		String s =
				"if (value.get$p.camelCaseName$Count() > 0) {\n";
		if (itemType instanceof UserType) {
			s +=
					"for ($p.itemType$ item : value.get$p.camelCaseName$List())\n" +
						"builder.add$p.camelCaseName$($p.builderListItemType$.newBuilder(item));\n";
		} else
			s +=
					"builder.addAll$p.camelCaseName$(value.get$p.camelCaseName$List());\n";
		s +=	"}\n";
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderBuild(Appendable builder, ListProperty property, int indentCount) throws IOException {
		Type itemType = property.getType().getItemType();

		String s;
		if (itemType instanceof UserEnumType) {
			s =
				"if ($p.memberVariableName$ != null) {\n" +
					"java.util.List<String> list = new java.util.ArrayList<String>();\n" +
					"for ($p.itemType$ value : $p.memberVariableName$)\n" +
						"list.add(value.name());\n" +
					"dbObject.put($p.keyName$, list);\n" +
				"}\n";
		} else if (itemType instanceof UserType) {
			s =
				"if ($p.memberVariableName$ != null) {\n" +
					"java.util.List<com.mongodb.DBObject> list = new java.util.ArrayList<com.mongodb.DBObject>();\n" +
					"for ($p.itemType$ value : $p.memberVariableName$)\n" +
						"list.add((($p.builderListItemType$)value).build());\n" +
					"dbObject.put($p.keyName$, list);\n" +
				"}\n";
		} else {
			s =
				"if ($p.memberVariableName$ != null)\n" +
					"dbObject.put($p.keyName$, $p.memberVariableName$);\n";
		}
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
////	protected java.util.List<String> _editList = null;
//	protected java.util.List<String> _editListAdded = null;
//	@Override public int getEditCount() {
//		return _builder.getEditList() != null ? _builder.getEditCount() : _wrapper.getEditCount();
//	}
//	@Override public java.util.List<String> getEditList() {
//		return _builder.getEditList() != null ? _builder.getEditList() : _wrapper.getEditList();
//	}
//	@Override public String getEdit(int index) {
//		return _builder.getEditList() != null ? _builder.getEdit(index) : _wrapper.getEdit(index);
//	}
//	public Updater addEdit(String value) {
//		if (_builder.getEditList() == null && _wrapper.getEditList() != null)
//			_builder.addAllEdit(_wrapper.getEditList());
//		_builder.addEdit(value);
//		if (_editListAdded == null)
//			_editListAdded = new java.util.ArrayList<String>();
//		_editListAdded.add(value);
//		return this;
//	}
//	public Updater addAllEdit(Iterable<? extends String> value) {
//		if (_builder.getEditList() == null && _wrapper.getEditList() != null)
//			_builder.addAllEdit(_wrapper.getEditList());
//		if (_editListAdded == null)
//			_editListAdded = new java.util.ArrayList<String>();
//		_builder.addAllEdit(value);
//		for (String item : value)
//			_editListAdded.add(item);
//		return this;
//	}
//	public Updater clearEdit() {
//		_editListAdded = null;
//		return this;
//	}
	
	@Override
	public void createUpdaterMethod(Appendable builder, ListProperty property, int indentCount) throws IOException {
		ListType type = property.getType();
		Type itemType = type.getItemType();
		
		// member variable
		if (itemType instanceof UserType)
			appendIndent(builder, indentCount).append("protected java.util.List<").append(itemType.getJavaType()).append(".Updater> ").append(property.getMemberVariableName()).append("Added = null;\n");
		else
			appendIndent(builder, indentCount).append("protected ").append(type.getJavaType()).append(" ").append(property.getMemberVariableName()).append("Added = null;\n");
		
		// getCount
		appendIndent(builder, indentCount).append("@Override public int get").append(property.getCamelCaseName()).append("Count() {\n");
		appendIndent(builder, indentCount + 1).append("return _wrapper.").append(property.getMemberVariableName()).append(" != nullgetCount() || _builder.getCount();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// getList
		if (itemType instanceof UserType)
			appendIndent(builder, indentCount).append("@Override public java.util.List<").append(itemType.getJavaType()).append(".Builder> get").append(property.getCamelCaseName()).append("List() {\n");
		else
			appendIndent(builder, indentCount).append("@Override public ").append(type.getJavaType()).append(" get").append(property.getCamelCaseName()).append("List() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		if (itemType instanceof UserType)
			appendIndent(builder, indentCount).append("@Override public ").append(type.getItemType().getJavaType()).append(".Builder get").append(property.getCamelCaseName()).append("(int index) {\n");
		else
			appendIndent(builder, indentCount).append("@Override public ").append(type.getItemType().getJavaType()).append(" get").append(property.getCamelCaseName()).append("(int index) {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" == null ? null : ").append(property.getMemberVariableName()).append(".get(index);\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// add
		if (itemType instanceof UserType)
			appendIndent(builder, indentCount).append("public Builder add").append(property.getCamelCaseName()).append("(").append(itemType.getJavaType()).append(".Builder value) {\n");
		else
			appendIndent(builder, indentCount).append("public Builder add").append(property.getCamelCaseName()).append("(").append(itemType.getJavaType()).append(" value) {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null)\n");
		if (itemType instanceof UserType)
			appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(" = new java.util.ArrayList<").append(itemType.getJavaType()).append(".Builder>();\n");
		else
			appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(" = new java.util.ArrayList<").append(itemType.getJavaType()).append(">();\n");
		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(".add(value);\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// addAll
		if (itemType instanceof UserType)
			appendIndent(builder, indentCount).append("public Builder addAll").append(property.getCamelCaseName()).append("(Iterable<? extends ").append(itemType.getJavaType()).append(".Builder> value) {\n");
		else
			appendIndent(builder, indentCount).append("public Builder addAll").append(property.getCamelCaseName()).append("(Iterable<? extends ").append(itemType.getJavaType()).append("> value) {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null)\n");
		if (itemType instanceof UserType) {
			appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(" = new java.util.ArrayList<").append(itemType.getJavaType()).append(".Builder>();\n");
			appendIndent(builder, indentCount + 1).append("for (").append(itemType.getJavaType()).append(".Builder item : value)\n");
		} else {
			appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(" = new java.util.ArrayList<").append(itemType.getJavaType()).append(">();\n");
			appendIndent(builder, indentCount + 1).append("for (").append(itemType.getJavaType()).append(" item : value)\n");
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
	public void createUpdaterBuildUpdate(Appendable builder, ListProperty property, int indentCount) throws IOException {
	}
}
