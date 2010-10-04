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

import com.lowereast.guiceymongo.data.generator.property.UserEnumProperty;
import com.lowereast.guiceymongo.data.generator.type.UserEnumType;

public class UserEnumPropertyGenerator extends PropertyGenerator<UserEnumType, UserEnumProperty> {
	public UserEnumPropertyGenerator(TypeRegistry typeRegistry) {
		super(UserEnumType.class, typeRegistry);
	}
	
	@Override
	public void createEquals(Appendable builder, UserEnumProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if (this.has$p.camelCaseName$() != other.has$p.camelCaseName$() || (this.has$p.camelCaseName$() && this.get$p.camelCaseName$() != other.get$p.camelCaseName$()))\n" +
		        	"return false;\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createKey(Appendable builder, UserEnumProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"public static final String $p.keyName$ = \"$p.keyValue$\";\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createReadableMethod(Appendable builder, UserEnumProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"public abstract boolean has$p.camelCaseName$();\n" +
				"public abstract $p.enumType$ get$p.camelCaseName$();\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createWrapperMethod(Appendable builder, UserEnumProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"protected $p.enumType$ $p.memberVariableName$ = null;\n" +
				"@Override\n" +
				"public boolean has$p.camelCaseName$() {\n" +
					"return _backing.containsField($p.keyName$);\n" +
				"}\n" +
				"@Override\n" +
				"public $p.enumType$ get$p.camelCaseName$() {\n" +
					"if ($p.memberVariableName$ == null) {\n" +
						"String value = (String)_backing.get($p.keyName$);\n" +
						"if (value != null) {\n" +
							"try {\n" +
								"$p.memberVariableName$ = $p.enumType$.valueOf(value);\n" +
							"} catch (Exception e) {\n" +
							"}\n" +
						"}\n" +
					"}\n" +
					"return $p.memberVariableName$;\n" +
				"}\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, UserEnumProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				// member variable
				"protected $p.enumType$ $p.memberVariableName$ = null;\n" +
				// has
				"@Override\n" +
				"public boolean has$p.camelCaseName$() {\n" +
					"return $p.memberVariableName$ != null;\n" +
				"}\n" +
				// get
				"@Override\n" +
				"public $p.enumType$ get$p.camelCaseName$() {\n" +
					"return $p.memberVariableName$;\n" +
				"}\n" +
				// set
				"public Builder set$p.camelCaseName$($p.enumType$ value) {\n" +
					"$p.memberVariableName$ = value;\n" +
					"return this;\n" +
				"}\n" +
				// clear
				"public Builder clear$p.camelCaseName$() {\n" +
					"$p.memberVariableName$ = null;\n" +
					"return this;\n" +
				"}\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderNewBuilder(Appendable builder, UserEnumProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if (value.has$p.camelCaseName$())\n" +
					"builder.set$p.camelCaseName$(value.get$p.camelCaseName$());\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderBuild(Appendable builder, UserEnumProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if ($p.memberVariableName$ != null)\n" +
					"dbObject.put($p.keyName$, $p.memberVariableName$.name());\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}

	@Override
	public void createUpdaterMethod(Appendable builder, UserEnumProperty property, int indentCount) throws IOException {
	}
	
	@Override
	public void createUpdaterBuildUpdate(Appendable builder, UserEnumProperty property, int indentCount) throws IOException {
	}
}
