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

import com.lowereast.guiceymongo.data.generator.property.UserTypeProperty;
import com.lowereast.guiceymongo.data.generator.type.UserType;

public class UserTypePropertyGenerator extends PropertyGenerator<UserType, UserTypeProperty> {
	public UserTypePropertyGenerator(TypeRegistry typeRegistry) {
		super(UserType.class, typeRegistry);
	}
	
	@Override
	public void createEquals(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if (this.has$p.camelCaseName$() != other.has$p.camelCaseName$() || (this.has$p.camelCaseName$() && !this.get$p.camelCaseName$().equals(other.get$p.camelCaseName$())))\n" +
		        	"return false;\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createKey(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
//		appendIndent(builder, indentCount).append("public static final com.lowereast.guiceymongo.data.DocumentProperty<").append(property.getEnclosingType().getCanonicalJavaType()).append(", ").append(property.getType().getCanonicalJavaType()).append("> ").append(property.getKeyName()).append(" = com.lowereast.guiceymongo.data.DocumentProperty.create(\"").append(property.getKeyValue()).append("\");\n");
		
		StringTemplate template = new StringTemplate(
				"public static final String $p.keyName$ = \"$p.keyValue$\";\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createReadableMethod(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"public abstract boolean has$p.camelCaseName$();\n" +
				"public abstract $p.userType$ get$p.camelCaseName$();\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createWrapperMethod(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"protected $p.userType$.Wrapper $p.memberVariableName$ = null;\n" +
				"@Override\n" +
				"public boolean has$p.camelCaseName$() {\n" +
					"return _backing.containsField($p.keyName$);\n" +
				"}\n" +
				"@Override\n" +
				"public $p.userType$.Wrapper get$p.camelCaseName$() {\n" +
					"if ($p.memberVariableName$ == null) {\n" +
						"Object value = _backing.get($p.keyName$);\n" +
						"if (value != null && value instanceof com.mongodb.DBObject)\n" +
							"$p.memberVariableName$ = $p.userType$.wrap((com.mongodb.DBObject)value);\n" +
					"}\n" +
					"return $p.memberVariableName$;\n" +
				"}\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				// member variable
				"protected $p.builderUserType$ $p.memberVariableName$ = null;\n" +
				// has
				"@Override\n" +
				"public boolean has$p.camelCaseName$() {\n" +
					"return $p.memberVariableName$ != null;\n" +
				"}\n" +
				// get
				"@Override\n" +
				"public $p.builderUserType$ get$p.camelCaseName$() {\n" +
					"return $p.memberVariableName$;\n" +
				"}\n" +
				// getOrCreate
				"public $p.builderUserType$ getOrCreate$p.camelCaseName$() {\n" +
					"if ($p.memberVariableName$ == null)\n" +
						"$p.memberVariableName$ = $p.userType$.newBuilder();\n" +
					"return $p.memberVariableName$;\n" +
				"}\n" +
				// set
				"public Builder set$p.camelCaseName$($p.builderUserType$ value) {\n" +
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
	public void createBuilderNewBuilder(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if (value.has$p.camelCaseName$())\n" +
					"builder.set$p.camelCaseName$($p.userType$.newBuilder(value.get$p.camelCaseName$()));\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderBuild(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if ($p.memberVariableName$ != null)\n" +
					"dbObject.put($p.keyName$, $p.memberVariableName$.build());\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createUpdaterMethod(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
		UserType type = property.getType();
		
//		protected UserEntity.Settings.Updater _settings = null;
//		@Override public boolean hasSettings() {
//			return _settings != null || _wrapper.hasSettings();
//		}
//		@Override public UserEntity.Settings.Updater getSettings() {
//			if (_settings == null && _wrapper.hasSettings())
//				_settings = new UserEntity.Settings.Updater(this, _wrapper.getSettings(), UserEntity.Settings.newBuilder());
//			return _settings;
//		}
//		public Updater setSettings(UserEntity.Settings.Builder value) {
//			_settings = new UserEntity.Settings.Updater(this, _wrapper.getSettings(), _builder.getSettings());
//			return this;
//		}
//		public Updater clearSettings() {
//			_settings = null;
//			return this;
//		}
		
		// member variable
		appendIndent(builder, indentCount).append("protected ").append(type.getJavaType()).append(".Updater ").append(property.getMemberVariableName()).append(" = null;\n");
		
		// has
		appendIndent(builder, indentCount).append("@Override public boolean has").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(" != null || _wrapper.has").append(property.getCamelCaseName()).append("() || _builder.has").append(property.getCamelCaseName()).append("();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("@Override public ").append(type.getJavaType()).append(".Updater get").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("if (").append(property.getMemberVariableName()).append(" == null && (_wrapper.has").append(property.getCamelCaseName()).append("() || _builder.has").append(property.getCamelCaseName()).append("()))\n");
		appendIndent(builder, indentCount + 2).append(property.getMemberVariableName()).append(" = new ").append(type.getJavaType()).append(".Updater(this, _wrapper.get").append(property.getCamelCaseName()).append("(), _builder.get").append(property.getCamelCaseName()).append("());\n");
		appendIndent(builder, indentCount + 1).append("return ").append(property.getMemberVariableName()).append(";\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// set
		appendIndent(builder, indentCount).append("public Updater set").append(property.getCamelCaseName()).append("(").append(type.getJavaType()).append(".Updater value) {\n");
		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(" = new ").append(type.getJavaType()).append(".Updater(this, null, _builder.get").append(property.getCamelCaseName()).append("());\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// clear
		appendIndent(builder, indentCount).append("public Updater clear").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("// Should I be clearing the builder and wrapper or just the updates?\n");
		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(" = null;\n");
		appendIndent(builder, indentCount + 1).append("return this;\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createUpdaterBuildUpdate(Appendable builder, UserTypeProperty property, int indentCount) throws IOException {
//		if (_settings != null)
//			_settings.buildUpdate(dbObject, path + SettingsKey + ".");
		appendIndent(builder, indentCount).append("if (").append(property.getMemberVariableName()).append(" != null)\n");
		appendIndent(builder, indentCount + 1).append(property.getMemberVariableName()).append(".buildUpdate(dbObject, path + ").append(property.getKeyName()).append(" + \".\");\n");
	}
}
