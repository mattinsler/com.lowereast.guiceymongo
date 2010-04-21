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
import java.lang.reflect.InvocationTargetException;
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
	
	private void create(String methodName, Appendable builder, UserType type, int indentCount) throws IOException {
		methodName = "create" + methodName;
		try {
			for (Property<?> property : type.getProperties()) {
				if (property instanceof PrimitiveProperty)
					PrimitivePropertyGenerator.class.getDeclaredMethod(methodName, Appendable.class, PrimitiveProperty.class, int.class).invoke(_primitivePropertyGenerator, builder, property, indentCount);
				else if (property instanceof ListProperty)
					ListPropertyGenerator.class.getDeclaredMethod(methodName, Appendable.class, ListProperty.class, int.class).invoke(_listPropertyGenerator, builder, property, indentCount);
				else if (property instanceof SetProperty)
					SetPropertyGenerator.class.getDeclaredMethod(methodName, Appendable.class, SetProperty.class, int.class).invoke(_setPropertyGenerator, builder, property, indentCount);
				else if (property instanceof MapProperty)
					MapPropertyGenerator.class.getDeclaredMethod(methodName, Appendable.class, MapProperty.class, int.class).invoke(_mapPropertyGenerator, builder, property, indentCount);
				else if (property instanceof UserEnumTypeProperty)
					UserEnumTypePropertyGenerator.class.getDeclaredMethod(methodName, Appendable.class, UserEnumTypeProperty.class, int.class).invoke(_userEnumTypePropertyGenerator, builder, property, indentCount);
				else if (property instanceof UserTypeProperty)
					UserTypePropertyGenerator.class.getDeclaredMethod(methodName, Appendable.class, UserTypeProperty.class, int.class).invoke(_userTypePropertyGenerator, builder, property, indentCount);
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}

	private void createUpdater(Appendable builder, UserType type, int indentCount) throws IOException {
		// find root type...
		UserType rootType = type;
		while (rootType.getParentType() != null)
			rootType = rootType.getParentType();
		if (rootType.getIdentityProperty() == null)
			return;
		
		appendIndent(builder, indentCount).append("public static class Updater extends ").append(type.getSimpleJavaType()).append(" implements com.lowereast.guiceymongo.IsUpdatable {\n");

		// member variables
		if (type.getParentType() != null)
			appendIndent(builder, indentCount + 1).append("private final ").append(type.getParentType().getCanonicalJavaType()).append(" _parent;\n");
		appendIndent(builder, indentCount + 1).append("private final Wrapper _wrapper;\n");
		appendIndent(builder, indentCount + 1).append("private final Builder _builder;\n");
		appendIndent(builder, indentCount + 1).append("private final com.mongodb.DBCollection _collection;\n");
		
		// constructor
		if (type.getParentType() == null)
			appendIndent(builder, indentCount + 1).append("private Updater(Wrapper wrapper, com.mongodb.DBCollection collection) {\n");
		else {
			appendIndent(builder, indentCount + 1).append("private Updater(").append(type.getParentType().getCanonicalJavaType()).append(" parent, Wrapper wrapper, com.mongodb.DBCollection collection) {\n");
			appendIndent(builder, indentCount + 2).append("_parent = parent;\n");
		}
		appendIndent(builder, indentCount + 2).append("_wrapper = wrapper;\n");
		appendIndent(builder, indentCount + 2).append("_builder = ").append(type.getSimpleJavaType()).append(".newBuilder();\n");
		appendIndent(builder, indentCount + 2).append("_collection = collection;\n");
		appendIndent(builder, indentCount + 1).append("}\n");
		
		create("UpdaterMethod", builder, type, indentCount + 1);
		
		if (type.getParentType() == null) {
			appendIndent(builder, indentCount + 1).append("public com.mongodb.DBObject buildUpdate() {\n");
			appendIndent(builder, indentCount + 2).append("com.mongodb.DBObject dbObject = new com.mongodb.BasicDBObject();\n");
			appendIndent(builder, indentCount + 2).append("buildUpdate(dbObject, \"\")\n");
			appendIndent(builder, indentCount + 2).append("if (dbObject.keySet().size() == 0)\n");
			appendIndent(builder, indentCount + 3).append("return null;\n");
			appendIndent(builder, indentCount + 2).append("return new com.mongodb.BasicDBObject(\"$set\", dbObject);\n");
			appendIndent(builder, indentCount + 1).append("}\n");
		}
		appendIndent(builder, indentCount + 1).append("private void buildUpdate(com.mongodb.DBObject dbObject, String path) {\n");
		create("UpdaterBuildUpdate", builder, type, indentCount + 2);
		appendIndent(builder, indentCount + 1).append("}\n");

		if (type.getParentType() == null) {
			appendIndent(builder, indentCount + 1).append("public void update() {\n");
			appendIndent(builder, indentCount + 2).append("com.mongodb.DBObject updateObject = buildUpdate();\n");
			appendIndent(builder, indentCount + 2).append("if (updateObject != null)\n");
			appendIndent(builder, indentCount + 3).append("_collection.update(new com.mongodb.BasicDBObject(").append(type.getIdentityProperty().getKeyName()).append(", get").append(type.getIdentityProperty().getCamelCaseName()).append("()), updateObject);\n");
			appendIndent(builder, indentCount + 1).append("}\n");
		} else {
			appendIndent(builder, indentCount + 1).append("public void update() {\n");
			appendIndent(builder, indentCount + 2).append("_parent.update();\n");
			appendIndent(builder, indentCount + 1).append("}\n");
		}
		
		appendIndent(builder, indentCount).append("}\n");

		if (type.getParentType() == null) {
			appendIndent(builder, indentCount).append("public static Updater newUpdater(com.mongodb.DBObject backing, com.mongodb.DBCollection collection) {\n");
			appendIndent(builder, indentCount + 1).append("if (backing != null && collection != null)\n");
			appendIndent(builder, indentCount + 2).append("return null;\n");
			appendIndent(builder, indentCount + 1).append("return new Updater(").append(type.getSimpleJavaType()).append(".wrap(backing), collection);\n");
			appendIndent(builder, indentCount).append("}\n");
		}
	}
	
	private void createBuilder(Appendable builder, UserType type, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("public static class Builder extends ").append(type.getSimpleJavaType()).append(" implements com.lowereast.guiceymongo.IsBuildable {\n");
		
		// constructor
		appendIndent(builder, indentCount + 1).append("private Builder() {}\n");
		
		create("BuilderMethod", builder, type, indentCount + 1);
		
		appendIndent(builder, indentCount + 1).append("public com.mongodb.DBObject build() {\n");
		appendIndent(builder, indentCount + 2).append("com.mongodb.DBObject dbObject = new com.mongodb.BasicDBObject();\n");
		create("BuilderBuild", builder, type, indentCount + 2);
		appendIndent(builder, indentCount + 2).append("return dbObject;\n");
		appendIndent(builder, indentCount + 1).append("}\n");
		
		appendIndent(builder, indentCount).append("}\n");
		
		appendIndent(builder, indentCount).append("public static Builder newBuilder() {\n");
		appendIndent(builder, indentCount + 1).append("return new Builder();\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	private void createWrapper(Appendable builder, UserType type, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("public static class Wrapper extends ").append(type.getSimpleJavaType()).append(" implements com.lowereast.guiceymongo.IsWrapped {\n");
		
		// member variable
		appendIndent(builder, indentCount + 1).append("private com.mongodb.DBObject _backing;\n");
		builder.append("\n");
		
		// constructor
		appendIndent(builder, indentCount + 1).append("private Wrapper(com.mongodb.DBObject backing) {\n");
		appendIndent(builder, indentCount + 2).append("_backing = backing;\n");
		appendIndent(builder, indentCount + 1).append("}\n");

		create("WrapperMethod", builder, type, indentCount + 1);
		
		appendIndent(builder, indentCount + 1).append("public com.mongodb.DBObject getDBObject() {\n");
		appendIndent(builder, indentCount + 2).append("return _backing;\n");
		appendIndent(builder, indentCount + 1).append("}\n");

		appendIndent(builder, indentCount).append("}\n");
		
		appendIndent(builder, indentCount).append("public static ").append(type.getSimpleJavaType()).append(".Wrapper wrap(com.mongodb.DBObject backing) {\n");
		appendIndent(builder, indentCount + 1).append("if (backing == null)\n");
		appendIndent(builder, indentCount + 2).append("return null;\n");
		appendIndent(builder, indentCount + 1).append("return new ").append(type.getSimpleJavaType()).append(".Wrapper(backing);\n");
		appendIndent(builder, indentCount).append("}\n");
		
		appendIndent(builder, indentCount).append("public static ").append(type.getSimpleJavaType()).append(".Wrapper convertFrom(com.lowereast.guiceymongo.IsWrapped wrapped) {\n");
		appendIndent(builder, indentCount + 1).append("if (wrapped == null)\n");
		appendIndent(builder, indentCount + 2).append("return null;\n");
		appendIndent(builder, indentCount + 1).append("return new ").append(type.getSimpleJavaType()).append(".Wrapper(wrapped.getDBObject());\n");
		appendIndent(builder, indentCount).append("}\n");
		
		appendIndent(builder, indentCount).append("public static ").append(type.getSimpleJavaType()).append(".Wrapper convertFrom(com.lowereast.guiceymongo.IsReadable readable) {\n");
		appendIndent(builder, indentCount + 1).append("if (readable == null || !(readable instanceof com.lowereast.guiceymongo.IsWrapped))\n");
		appendIndent(builder, indentCount + 2).append("return null;\n");
		appendIndent(builder, indentCount + 1).append("return new ").append(type.getSimpleJavaType()).append(".Wrapper(((com.lowereast.guiceymongo.IsWrapped)readable).getDBObject());\n");
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

	private void createUserType(Appendable builder, UserType type, int indentCount, boolean innerClass) throws IOException {
		if (type instanceof UserEnumType) {
			createEnumType(builder, (UserEnumType)type, 1, false);
			return;
		}
		appendIndent(builder, indentCount).append("public " + (innerClass ? "static " : "") + "abstract class ").append(type.getSimpleJavaType()).append(" implements com.lowereast.guiceymongo.IsReadable {\n");
		
		create("Key", builder, type, indentCount + 1);
		builder.append("\n");
		
		create("ReadableMethod", builder, type, indentCount + 1);
		builder.append("\n");
		
		createWrapper(builder, type, indentCount + 1);
		
		createBuilder(builder, type, indentCount + 1);
		
//		createUpdater(builder, type, indentCount + 1);
		
		for (UserType childType : type.getChildTypes())
			createUserType(builder, childType, indentCount + 1, true);
		appendIndent(builder, indentCount).append("}\n");
	}
	
	public void generate(Appendable builder, UserType type) throws IOException {
		builder.append("// Generated file!!!  DO NOT EDIT THIS!!!\n\n");
//		// create imports
//		for (String i : type.getUserTypeFileImports())
//			builder.append("import ").append(i).append(";\n");

		createUserType(builder, type, 0, false);
	}
}
