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
import java.util.ArrayList;
import java.util.List;

import com.lowereast.guiceymongo.data.property.ListProperty;
import com.lowereast.guiceymongo.data.property.MapProperty;
import com.lowereast.guiceymongo.data.property.PrimitiveProperty;
import com.lowereast.guiceymongo.data.property.Property;
import com.lowereast.guiceymongo.data.property.SetProperty;
import com.lowereast.guiceymongo.data.property.UserEnumTypeProperty;
import com.lowereast.guiceymongo.data.property.UserTypeProperty;
import com.lowereast.guiceymongo.data.type.UserEnumType;
import com.lowereast.guiceymongo.data.type.UserType;

public class TypeGenerator {
	private final PrimitivePropertyGenerator _primitivePropertyGenerator;
	private final ListPropertyGenerator _listPropertyGenerator;
	private final SetPropertyGenerator _setPropertyGenerator;
	private final MapPropertyGenerator _mapPropertyGenerator;
	private final UserEnumTypePropertyGenerator _userEnumTypePropertyGenerator;
	private final UserTypePropertyGenerator _userTypePropertyGenerator;
	
	public TypeGenerator(TypeRegistry registry) {
		_primitivePropertyGenerator = new PrimitivePropertyGenerator(registry);
		_listPropertyGenerator = new ListPropertyGenerator(registry);
		_setPropertyGenerator = new SetPropertyGenerator(registry);
		_mapPropertyGenerator = new MapPropertyGenerator(registry);
		_userEnumTypePropertyGenerator = new UserEnumTypePropertyGenerator(registry);
		_userTypePropertyGenerator = new UserTypePropertyGenerator(registry);
	}
	
	private Appendable appendIndent(Appendable builder, int indentCount) throws IOException {
		for (int x = 0; x < indentCount; ++x)
			builder.append("\t");
		return builder;
	}

	private void createPropertyKeys(Appendable builder, UserType type, int indentCount) throws IOException {
		for (Property<?> property : type.getProperties()) {
			if (property instanceof PrimitiveProperty)
				_primitivePropertyGenerator.createKey(builder, (PrimitiveProperty)property, indentCount + 1);
			else if (property instanceof ListProperty)
				_listPropertyGenerator.createKey(builder, (ListProperty)property, indentCount + 1);
			else if (property instanceof SetProperty)
				_setPropertyGenerator.createKey(builder, (SetProperty)property, indentCount + 1);
			else if (property instanceof MapProperty)
				_mapPropertyGenerator.createKey(builder, (MapProperty)property, indentCount + 1);
			else if (property instanceof UserEnumTypeProperty)
				_userEnumTypePropertyGenerator.createKey(builder, (UserEnumTypeProperty)property, indentCount + 1);
			else if (property instanceof UserTypeProperty)
				_userTypePropertyGenerator.createKey(builder, (UserTypeProperty)property, indentCount + 1);
		}
	}
	
	private void createUserTypeBuilder(Appendable builder, UserType type, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("public static class Builder implements IsBuildable {\n");
		
		appendIndent(builder, indentCount + 1).append("private Builder() {}\n");

		for (Property<?> property : type.getProperties()) {
			if (property instanceof PrimitiveProperty)
				_primitivePropertyGenerator.createBuilder(builder, (PrimitiveProperty)property, indentCount + 1);
			else if (property instanceof ListProperty)
				_listPropertyGenerator.createBuilder(builder, (ListProperty)property, indentCount + 1);
			else if (property instanceof SetProperty)
				_setPropertyGenerator.createBuilder(builder, (SetProperty)property, indentCount + 1);
			else if (property instanceof MapProperty)
				_mapPropertyGenerator.createBuilder(builder, (MapProperty)property, indentCount + 1);
			else if (property instanceof UserEnumTypeProperty)
				_userEnumTypePropertyGenerator.createBuilder(builder, (UserEnumTypeProperty)property, indentCount + 1);
			else if (property instanceof UserTypeProperty)
				_userTypePropertyGenerator.createBuilder(builder, (UserTypeProperty)property, indentCount + 1);
		}
		
		appendIndent(builder, indentCount + 1).append("public DBObject build() {\n");
		appendIndent(builder, indentCount + 2).append("return null;\n");
		appendIndent(builder, indentCount + 1).append("}\n");
		
		appendIndent(builder, indentCount).append("}\n");
		
		appendIndent(builder, indentCount).append("public static Builder newBuilder() {\n");
		appendIndent(builder, indentCount + 1).append("return new Builder();\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	private void createReadableUserType(Appendable builder, UserType type, int indentCount, boolean innerClass) throws IOException {
		if (type instanceof UserEnumType) {
			createEnumType(builder, (UserEnumType)type, indentCount, innerClass);
			return;
		}
		appendIndent(builder, indentCount).append("public " + (innerClass ? "static " : "") + "class ").append(type.getSimpleJavaType()).append(" extends GuiceyDBObject implements IsReadable {\n");
		
		createPropertyKeys(builder, type, indentCount + 1);
		
		appendIndent(builder, indentCount + 1).append("private ").append(type.getSimpleJavaType()).append("(DBObject backing) {\n");
		appendIndent(builder, indentCount + 2).append("super(backing);\n");
		appendIndent(builder, indentCount + 1).append("}\n");

		for (Property<?> property : type.getProperties()) {
			if (property instanceof PrimitiveProperty)
				_primitivePropertyGenerator.createReadable(builder, (PrimitiveProperty)property, indentCount + 1);
			else if (property instanceof ListProperty)
				_listPropertyGenerator.createReadable(builder, (ListProperty)property, indentCount + 1);
			else if (property instanceof SetProperty)
				_setPropertyGenerator.createReadable(builder, (SetProperty)property, indentCount + 1);
			else if (property instanceof MapProperty)
				_mapPropertyGenerator.createReadable(builder, (MapProperty)property, indentCount + 1);
			else if (property instanceof UserEnumTypeProperty)
				_userEnumTypePropertyGenerator.createReadable(builder, (UserEnumTypeProperty)property, indentCount + 1);
			else if (property instanceof UserTypeProperty)
				_userTypePropertyGenerator.createReadable(builder, (UserTypeProperty)property, indentCount + 1);
		}
		
		appendIndent(builder, indentCount + 1).append("public static ").append(type.getSimpleJavaType()).append(" wrap(DBObject backing) {\n");
		appendIndent(builder, indentCount + 2).append("if (backing == null)\n");
		appendIndent(builder, indentCount + 3).append("return null;\n");
		appendIndent(builder, indentCount + 2).append("return new ").append(type.getSimpleJavaType()).append("(backing);\n");
		appendIndent(builder, indentCount + 1).append("}\n");
		
//		createUserTypeBuilder(builder, type, indentCount + 1);
		
		for (UserType childType : type.getChildTypes())
			createReadableUserType(builder, childType, indentCount + 1, true);
		
		appendIndent(builder, indentCount).append("}\n");
	}
	
	private void createEnumType(Appendable builder, UserEnumType type, int indentCount, boolean innerClass) throws IOException {
		appendIndent(builder, indentCount).append("public " + (innerClass ? "static " : "") + "enum ").append(type.getSimpleJavaType()).append(" {\n");
		
		List<String> values = new ArrayList<String>(type.getValues());
		for (int x = 0; x < values.size(); ++x) {
			appendIndent(builder, indentCount + 1).append(values.get(x));
			if (x < values.size() - 1)
				builder.append(",");
			builder.append("\n");
		}
		
		appendIndent(builder, indentCount).append("}\n");
	}
	
	public void createUserType(Appendable builder, UserType type) throws IOException {
		builder.append("// Generated file!!!  DO NOT EDIT THIS!!!\n\n");
		// create imports
		for (String i : type.getUserTypeFileImports())
			builder.append("import ").append(i).append(";\n");
		
		createReadableUserType(builder, type, 0, false);
	}
}
