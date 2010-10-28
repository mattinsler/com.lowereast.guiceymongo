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

import com.lowereast.guiceymongo.data.generator.property.SetProperty;
import com.lowereast.guiceymongo.data.generator.type.SetType;
import com.lowereast.guiceymongo.data.generator.type.Type;
import com.lowereast.guiceymongo.data.generator.type.UserEnumType;
import com.lowereast.guiceymongo.data.generator.type.UserDataType;

public class SetPropertyGenerator extends PropertyGenerator<SetType, SetProperty> {
	public SetPropertyGenerator(TypeRegistry typeRegistry) {
		super(SetType.class, typeRegistry);
	}
	
	@Override
	public void createEquals(Appendable builder, SetProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if (this.get$p.camelCaseName$Count() != other.get$p.camelCaseName$Count())\n" +
	        		"return false;\n" +
	        	"if (this.get$p.camelCaseName$Count() > 0) {\n" +
	        		"for ($p.itemType$ item : this.get$p.camelCaseName$Set()) {\n" +
	        			"if (!other.contains$p.camelCaseName$(item))\n" +
	        				"return false;" +
	        		"}\n" +
	        	"}\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}

	@Override
	public void createKey(Appendable builder, SetProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"public static final String $p.keyName$ = \"$p.keyValue$\";\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createReadableMethod(Appendable builder, SetProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"public abstract int get$p.camelCaseName$Count();\n" +
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"public abstract $p.setType$ get$p.camelCaseName$Set();\n" +
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"public abstract boolean contains$p.camelCaseName$($p.itemType$ value);\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createWrapperMethod(Appendable builder, SetProperty property, int indentCount) throws IOException {
		Type itemType = property.getType().getItemType();

		String s =
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"protected $p.setType$ $p.memberVariableName$ = null;\n" +
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"@Override\n" +
				"public int get$p.camelCaseName$Count() {\n" +
					"$p.setType$ set = get$p.camelCaseName$Set();\n" +
					"return set == null ? 0 : set.size();\n" +
				"}\n" +
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"@Override\n" +
				"@SuppressWarnings(\"unchecked\")" +
				"public $p.setType$ get$p.camelCaseName$Set() {\n" +
					"if ($p.memberVariableName$ == null) {\n" +
						"Object value = _backing.get($p.keyName$);\n" +
						"if (value != null && value instanceof java.util.List<?>) {\n";
		
		if (itemType instanceof UserEnumType) {
			s +=
							"$p.setType$ set = new $p.newSetType$();\n" +
							"for (String item : (java.util.List<String>)value) {\n" +
								"try {\n" +
									"set.add($p.setItemType$.valueOf(item));\n" +
								"} catch (Exception e) {\n" +
								"}\n" +
							"}\n" +
							"$p.memberVariableName$ = java.util.Collections.unmodifiableSet(set);\n";
		} else if (itemType instanceof UserDataType) {
			s +=
							"$p.setType$ set = new $p.newSetType$();\n" +
							"for (com.mongodb.DBObject o : (java.util.List<com.mongodb.DBObject>)value)\n" +
								"set.add($p.setItemType$.wrap(o));\n" +
							"$p.memberVariableName$ = java.util.Collections.unmodifiableSet(set);\n";
		} else
			s +=			"$p.memberVariableName$ = java.util.Collections.unmodifiableSet(new $p.newSetType$((java.util.List<$p.setItemType$>)value));\n";
		
		s +=
						"}\n" +
					"}\n" +
					"return $p.memberVariableName$;\n" +
				"}\n" +
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"@Override\n" +
				"public boolean contains$p.camelCaseName$($p.itemType$ value) {\n" +
					"$p.setType$ set = get$p.camelCaseName$Set();\n" +
					"return set == null ? false : set.contains(value);\n" +
				"}\n";
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, SetProperty property, int indentCount) throws IOException {
		String s =
				// member variable
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"protected $p.setType$ $p.memberVariableName$ = null;\n" +
				// getCount
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"@Override\n" +
				"public int get$p.camelCaseName$Count() {\n" +
					"return $p.memberVariableName$ == null ? 0 : $p.memberVariableName$.size();\n" +
				"}\n" +
				// getSet
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"@Override\n" +
				"public $p.setType$ get$p.camelCaseName$Set() {\n" +
					"return java.util.Collections.unmodifiableSet($p.memberVariableName$);\n" +
				"}\n" +
				// contains
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"@Override\n" +
				"public boolean contains$p.camelCaseName$($p.itemType$ value) {\n" +
					"return $p.memberVariableName$ == null ? false : $p.memberVariableName$.contains(value);\n" +
				"}\n" +
				// add
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"public Builder add$p.camelCaseName$($p.builderItemType$ value) {\n" +
					"if ($p.memberVariableName$ == null)\n" +
						"$p.memberVariableName$ = new $p.newSetType$();\n" +
					"$p.memberVariableName$.add(value);\n" +
					"return this;" +
				"}\n" +
				// addAll
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"public Builder addAll$p.camelCaseName$(Iterable<? extends $p.builderSetItemType$> value) {\n" +
					"if ($p.memberVariableName$ == null)\n" +
						"$p.memberVariableName$ = new $p.newSetType$();\n" +
					"for ($p.builderItemType$ item : value)\n" +
						"$p.memberVariableName$.add(item);\n" +
					"return this;\n" +
				"}\n" +
				// clear
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"public Builder clear$p.camelCaseName$() {\n" +
					"$p.memberVariableName$ = null;\n" +
					"return this;\n" +
				"}\n";
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderNewBuilder(Appendable builder, SetProperty property, int indentCount) throws IOException {
		Type itemType = property.getType().getItemType();
		
		String s =
				"if (value.get$p.camelCaseName$Count() > 0) {\n";
		if (itemType instanceof UserDataType)
			s +=	"for ($p.itemType$ item : value.get$p.camelCaseName$Set())\n" +
						"builder.add$p.camelCaseName$($p.itemType$.newBuilder(item));\n";
		else
			s +=	"builder.addAll$p.camelCaseName$(value.get$p.camelCaseName$Set());\n";
		s +=	"}\n";
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderBuild(Appendable builder, SetProperty property, int indentCount) throws IOException {
		Type itemType = property.getType().getItemType();
		
		String s;
		if (itemType instanceof UserEnumType) {
			s =
				"if ($p.memberVariableName$ != null) {\n" +
					"java.util.List<String> list = new java.util.ArrayList<String>();\n" +
					"for ($p.itemType$ item : $p.memberVariableName$)\n" +
						"list.add(item.name());\n" +
					"dbObject.put($p.keyName$, list);\n" +
				"}\n";
		} else if (itemType instanceof UserDataType) {
			s = 
				"if ($p.memberVariableName$ != null) {\n" +
					"java.util.List<com.mongodb.DBObject> list = new java.util.ArrayList<com.mongodb.DBObject>();\n" +
					"for ($p.itemType$ item : $p.memberVariableName$)\n" +
						"list.add((($p.builderSetItemType$)item).build());\n" +
					"dbObject.put($p.keyName$, list);\n" +
				"}\n";
		} else {
			s =
				"if ($p.memberVariableName$ != null)\n" +
					"dbObject.put($p.keyName$, new java.util.ArrayList<$p.setItemType$>($p.memberVariableName$));\n";
		}
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}

	@Override
	public void createUpdaterMethod(Appendable builder, SetProperty property, int indentCount) throws IOException {
//		@Override public int getEmailAddressCount() {
//			return _builder._emailAddressSet == null ? _wrapper.getEmailAddressCount() : _builder.getEmailAddressCount();
//		}
//		@Override public java.util.Set<String> getEmailAddressSet() {
//			return _builder._emailAddressSet == null ? _wrapper.getEmailAddressSet() : _builder.getEmailAddressSet();
//		}
//		@Override public boolean containsEmailAddress(java.util.Set<String> value) {
//			return _builder._emailAddressSet == null ? _wrapper.containsEmailAddress(value) : _builder.containsEmailAddress(value);
//		}
	}
	
	@Override
	public void createUpdaterBuildUpdate(Appendable builder, SetProperty property, int indentCount) throws IOException {
	}
}
