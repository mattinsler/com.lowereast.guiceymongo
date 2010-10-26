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

import com.lowereast.guiceymongo.data.generator.property.PrimitiveProperty;
import com.lowereast.guiceymongo.data.generator.type.PrimitiveType;
import com.lowereast.guiceymongo.data.generator.type.Type;

public class PrimitivePropertyGenerator extends PropertyGenerator<PrimitiveType, PrimitiveProperty> {
	public PrimitivePropertyGenerator(TypeRegistry typeRegistry) {
		super(PrimitiveType.class, typeRegistry);
	}
	
	@Override
	public void createEquals(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		Type type = property.getType();
		
		String s;
		if (PrimitiveType.BoolType.equals(type) ||
				PrimitiveType.DoubleType.equals(type) ||
				PrimitiveType.FloatType.equals(type) ||
				PrimitiveType.Int32Type.equals(type) ||
				PrimitiveType.Int64Type.equals(type))
			s =	"if (this.has$p.camelCaseName$() != other.has$p.camelCaseName$() || (this.has$p.camelCaseName$() && this.get$p.camelCaseName$() != other.get$p.camelCaseName$()))\n";
		else
			s =	"if (this.has$p.camelCaseName$() != other.has$p.camelCaseName$() || (this.has$p.camelCaseName$() && !this.get$p.camelCaseName$().equals(other.get$p.camelCaseName$())))\n";
		s +=		"return false;\n";
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createKey(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"public static final String $p.keyName$ = \"$p.keyValue$\";\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createReadableMethod(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"public abstract boolean has$p.camelCaseName$();\n" +
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"public abstract $p.primitiveType$ get$p.camelCaseName$();\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createWrapperMethod(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		PrimitiveType type = property.getType();

		String s =
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"@Override\n" +
				"public boolean has$p.camelCaseName$() {\n" +
					"return _backing.containsField($p.keyName$);\n" +
				"}\n" +
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"@Override\n" +
				"public $p.primitiveType$ get$p.camelCaseName$() {\n";
		
		if (property.hasOption("identity")) {
			if (PrimitiveType.StringType.equals(type)) {
				s +=
					"Object value = _backing.get($p.keyName$);\n" +
					"return value == null ? null : value.toString();\n";
			} else if (PrimitiveType.ObjectIdType.equals(type))
				s +=
					"return ($p.primitiveBoxedType$)_backing.get($p.keyName$);\n";
			else
				throw new RuntimeException("Option identity is only valid for properties of type string or object_id");
		} else if (PrimitiveType.Int32Type.equals(type)) {
			s +=	"Object value = _backing.get($p.keyName$);\n" +
					"if (value instanceof Double)\n" +
						"return ((Double)value).intValue();\n" +
					"return (Integer)value;\n";
		} else
			s +=	"return ($p.primitiveBoxedType$)_backing.get($p.keyName$);\n";
		
		s += 	"}\n";
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				// member variable
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"protected $p.primitiveBoxedType$ $p.memberVariableName$ = null;\n" +
				// has
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"@Override\n" +
				"public boolean has$p.camelCaseName$() {\n" +
					"return $p.memberVariableName$ != null;\n" +
				"}\n" +
				// get
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"@Override\n" +
				"public $p.primitiveType$ get$p.camelCaseName$() {\n" +
					"return $p.memberVariableName$;\n" +
				"}\n" +
				// set
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"public Builder set$p.camelCaseName$($p.primitiveType$ value) {\n" +
					"$p.memberVariableName$ = value;\n" +
					"return this;\n" +
				"}\n" +
				// clear
				"/**\n" +
				" * $p.comment$\n" +
				" */\n" +
				"public Builder clear$p.camelCaseName$() {\n" +
					"$p.memberVariableName$ = null;\n" +
					"return this;\n" +
				"}\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}

	@Override
	public void createBuilderNewBuilder(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if (value.has$p.camelCaseName$())\n" +
					"builder.set$p.camelCaseName$(value.get$p.camelCaseName$());\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderBuild(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if ($p.memberVariableName$ != null)\n" +
					"dbObject.put($p.keyName$, $p.memberVariableName$);\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createUpdaterMethod(Appendable builder, PrimitiveProperty property, int indentCount) throws IOException {
		PrimitiveType type = property.getType();
		
		// has
		appendIndent(builder, indentCount).append("@Override public boolean has").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return _wrapper.has").append(property.getCamelCaseName()).append("() || _builder.has").append(property.getCamelCaseName()).append("();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// get
		appendIndent(builder, indentCount).append("@Override public ").append(type.getJavaType()).append(" get").append(property.getCamelCaseName()).append("() {\n");
		appendIndent(builder, indentCount + 1).append("return _builder.has").append(property.getCamelCaseName()).append("() ? _builder.get").append(property.getCamelCaseName()).append("() : _wrapper.get").append(property.getCamelCaseName()).append("();\n");
		appendIndent(builder, indentCount).append("}\n");
		
		// set
		appendIndent(builder, indentCount).append("public Updater set").append(property.getCamelCaseName()).append("(").append(type.getJavaType()).append(" value) {\n");
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
		if (property.getOption("identity") == null) {
			appendIndent(builder, indentCount).append("if (_builder.has").append(property.getCamelCaseName()).append("())\n");
			appendIndent(builder, indentCount + 1).append("dbObject.put(path + ").append(property.getKeyName()).append(", _builder.get").append(property.getCamelCaseName()).append("());\n");
		}
	}
}
