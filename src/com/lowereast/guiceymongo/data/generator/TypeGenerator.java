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

import com.lowereast.guiceymongo.data.generator.property.BlobProperty;
import com.lowereast.guiceymongo.data.generator.property.ListProperty;
import com.lowereast.guiceymongo.data.generator.property.MapProperty;
import com.lowereast.guiceymongo.data.generator.property.PrimitiveProperty;
import com.lowereast.guiceymongo.data.generator.property.Property;
import com.lowereast.guiceymongo.data.generator.property.SetProperty;
import com.lowereast.guiceymongo.data.generator.property.UserEnumTypeProperty;
import com.lowereast.guiceymongo.data.generator.property.UserTypeProperty;
import com.lowereast.guiceymongo.data.generator.type.Type;
import com.lowereast.guiceymongo.data.generator.type.UserEnumType;
import com.lowereast.guiceymongo.data.generator.type.UserType;

public class TypeGenerator {
	private final PrimitivePropertyGenerator _primitivePropertyGenerator;
	private final BlobPropertyGenerator _blobPropertyGenerator;
	private final ListPropertyGenerator _listPropertyGenerator;
	private final SetPropertyGenerator _setPropertyGenerator;
	private final MapPropertyGenerator _mapPropertyGenerator;
	private final UserEnumTypePropertyGenerator _userEnumTypePropertyGenerator;
	private final UserTypePropertyGenerator _userTypePropertyGenerator;
	
	public TypeGenerator(TypeRegistry registry) {
		_primitivePropertyGenerator = new PrimitivePropertyGenerator(registry);
		_blobPropertyGenerator = new BlobPropertyGenerator(registry);
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
	
	private String getSimpleName(String typeName) {
		int index = typeName.lastIndexOf(".");
		if (index >= 0)
			typeName = typeName.substring(index + 1);
		return typeName;
	}
	
	private void create(String methodName, Appendable builder, UserType type, int indentCount) throws IOException {
		methodName = "create" + methodName;
		try {
			for (Property<?> property : type.getProperties()) {
				if (property instanceof PrimitiveProperty)
					PrimitivePropertyGenerator.class.getDeclaredMethod(methodName, Appendable.class, PrimitiveProperty.class, int.class).invoke(_primitivePropertyGenerator, builder, property, indentCount);
				else if (property instanceof BlobProperty)
					BlobPropertyGenerator.class.getDeclaredMethod(methodName, Appendable.class, BlobProperty.class, int.class).invoke(_blobPropertyGenerator, builder, property, indentCount);
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
		
		appendIndent(builder, indentCount).append("public static class Updater extends ").append(getSimpleName(type.getJavaType())).append(" implements com.lowereast.guiceymongo.data.IsUpdatable<").append(getSimpleName(type.getJavaType())).append("> {\n");

		// member variables
		if (type.getParentType() != null)
			appendIndent(builder, indentCount + 1).append("private final ").append(type.getParentType().getJavaType()).append(".Updater _parent;\n");
		appendIndent(builder, indentCount + 1).append("private final Wrapper _wrapper;\n");
		appendIndent(builder, indentCount + 1).append("private final Builder _builder;\n");
		if (type.getParentType() == null)
			appendIndent(builder, indentCount + 1).append("private final com.mongodb.DBCollection _collection;\n");
		
		// constructor
		if (type.getParentType() == null) {
			appendIndent(builder, indentCount + 1).append("private Updater(Wrapper wrapper, com.mongodb.DBCollection collection) {\n");
			appendIndent(builder, indentCount + 2).append("_wrapper = wrapper;\n");
			appendIndent(builder, indentCount + 2).append("_builder = ").append(type.getJavaType()).append(".newBuilder();\n");
			appendIndent(builder, indentCount + 2).append("_collection = collection;\n");
		} else {
			appendIndent(builder, indentCount + 1).append("private Updater(").append(type.getParentType().getJavaType()).append(".Updater parent, Wrapper wrapper, Builder builder) {\n");
			appendIndent(builder, indentCount + 2).append("_parent = parent;\n");
			appendIndent(builder, indentCount + 2).append("_wrapper = wrapper != null ? wrapper : ").append(type.getJavaType()).append(".wrap(new com.mongodb.BasicDBObject());\n");
			appendIndent(builder, indentCount + 2).append("_builder = builder != null ? builder : ").append(type.getJavaType()).append(".newBuilder();\n");
		}
		appendIndent(builder, indentCount + 1).append("}\n");
		
		// updater methods
		create("UpdaterMethod", builder, type, indentCount + 1);
		
		// buildUpdate
		if (type.getParentType() == null) {
			appendIndent(builder, indentCount + 1).append("public com.mongodb.DBObject buildUpdate() {\n");
			appendIndent(builder, indentCount + 2).append("com.mongodb.DBObject dbObject = new com.mongodb.BasicDBObject();\n");
			appendIndent(builder, indentCount + 2).append("buildUpdate(dbObject, \"\");\n");
			appendIndent(builder, indentCount + 2).append("if (dbObject.keySet().size() == 0)\n");
			appendIndent(builder, indentCount + 3).append("return null;\n");
			appendIndent(builder, indentCount + 2).append("return new com.mongodb.BasicDBObject(\"$set\", dbObject);\n");
			appendIndent(builder, indentCount + 1).append("}\n");
		}
		
		appendIndent(builder, indentCount + 1).append("private void buildUpdate(com.mongodb.DBObject dbObject, String path) {\n");
		create("UpdaterBuildUpdate", builder, type, indentCount + 2);
		appendIndent(builder, indentCount + 1).append("}\n");

		// update
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
			appendIndent(builder, indentCount + 1).append("return new Updater(").append(type.getJavaType()).append(".wrap(backing), collection);\n");
			appendIndent(builder, indentCount).append("}\n");
		}
	}
	
	private void createBuilder(Appendable builder, UserType type, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("public static class Builder extends ").append(getSimpleName(type.getJavaType())).append(" implements com.lowereast.guiceymongo.data.IsBuilder<").append(getSimpleName(type.getJavaType())).append("> {\n");
		
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
		
		appendIndent(builder, indentCount).append("public static Builder newBuilder(").append(type.getJavaType()).append(" value) {\n");
		appendIndent(builder, indentCount + 1).append("Builder builder = new Builder();\n");
		create("BuilderNewBuilder", builder, type, indentCount + 1);
		appendIndent(builder, indentCount + 1).append("return builder;\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	private void createWrapper(Appendable builder, UserType type, int indentCount) throws IOException {
		appendIndent(builder, indentCount).append("public static class Wrapper extends ").append(getSimpleName(type.getJavaType())).append(" implements com.lowereast.guiceymongo.data.IsWrapper<").append(getSimpleName(type.getJavaType())).append("> {\n");
		
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
		
//		appendIndent(builder, indentCount + 1).append("public ").append(getSimpleName(type.getJavaType())).append(" getWrapped() {\n");
//		appendIndent(builder, indentCount + 2).append("return this;\n");
//		appendIndent(builder, indentCount + 1).append("}\n");

		appendIndent(builder, indentCount).append("}\n");
		
		appendIndent(builder, indentCount).append("public static com.lowereast.guiceymongo.data.DataWrapper<").append(type.getJavaType()).append("> DataWrapper = new com.lowereast.guiceymongo.data.DataWrapper<").append(type.getJavaType()).append(">() {\n");
		appendIndent(builder, indentCount + 1).append("public ").append(type.getJavaType()).append(".Wrapper wrap(com.mongodb.DBObject backing) {\n");
		appendIndent(builder, indentCount + 2).append("return ").append(type.getJavaType()).append(".wrap(backing);\n");
		appendIndent(builder, indentCount + 1).append("}\n");
		appendIndent(builder, indentCount).append("};\n");
		
		appendIndent(builder, indentCount).append("public static ").append(type.getJavaType()).append(".Wrapper wrap(com.mongodb.DBObject backing) {\n");
		appendIndent(builder, indentCount + 1).append("if (backing == null)\n");
		appendIndent(builder, indentCount + 2).append("return null;\n");
		appendIndent(builder, indentCount + 1).append("return new ").append(type.getJavaType()).append(".Wrapper(backing);\n");
		appendIndent(builder, indentCount).append("}\n");
		
		appendIndent(builder, indentCount).append("public static ").append(type.getJavaType()).append(".Wrapper convertFrom(com.lowereast.guiceymongo.data.IsWrapper<?> wrapped) {\n");
		appendIndent(builder, indentCount + 1).append("if (wrapped == null)\n");
		appendIndent(builder, indentCount + 2).append("return null;\n");
		appendIndent(builder, indentCount + 1).append("return new ").append(type.getJavaType()).append(".Wrapper(wrapped.getDBObject());\n");
		appendIndent(builder, indentCount).append("}\n");
		
		appendIndent(builder, indentCount).append("public static ").append(type.getJavaType()).append(".Wrapper convertFrom(com.lowereast.guiceymongo.data.IsData data) {\n");
		appendIndent(builder, indentCount + 1).append("if (data == null || !(data instanceof com.lowereast.guiceymongo.data.IsWrapper<?>))\n");
		appendIndent(builder, indentCount + 2).append("return null;\n");
		appendIndent(builder, indentCount + 1).append("return new ").append(type.getJavaType()).append(".Wrapper(((com.lowereast.guiceymongo.data.IsWrapper<?>)data).getDBObject());\n");
		appendIndent(builder, indentCount).append("}\n");
	}
	
	private void createEnumType(Appendable builder, UserEnumType type, int indentCount, boolean innerClass) throws IOException {
		appendIndent(builder, indentCount).append("public " + (innerClass ? "static " : "") + "enum ").append(getSimpleName(type.getJavaType())).append(" {\n");
		
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
		appendIndent(builder, indentCount).append("public " + (innerClass ? "static " : "") + "abstract class ").append(getSimpleName(type.getJavaType())).append(" implements com.lowereast.guiceymongo.data.IsData {\n");
		
		create("Key", builder, type, indentCount + 1);
		builder.append("\n");
		
		create("ReadableMethod", builder, type, indentCount + 1);
		builder.append("\n");
		
		createWrapper(builder, type, indentCount + 1);
		
		createBuilder(builder, type, indentCount + 1);
		
//		createUpdater(builder, type, indentCount + 1);

		appendIndent(builder, indentCount + 1).append("@Override public boolean equals(Object obj) {\n");
		appendIndent(builder, indentCount + 2).append("if (obj == null || !(obj instanceof ").append(getSimpleName(type.getJavaType())).append("))\n");
		appendIndent(builder, indentCount + 3).append("return false;\n");
		if (type.getProperties().size() > 0) {
			appendIndent(builder, indentCount + 2).append(getSimpleName(type.getJavaType())).append(" other = (").append(getSimpleName(type.getJavaType())).append(")obj;\n");
			create("Equals", builder, type, indentCount + 1);
		}
		appendIndent(builder, indentCount + 2).append("return true;\n");
		appendIndent(builder, indentCount + 1).append("}\n");
		
		for (Type childType : type.getChildTypes()) {
			if (childType instanceof UserType)
				createUserType(builder, (UserType)childType, indentCount + 1, true);
			else if (childType instanceof UserEnumType)
				createEnumType(builder, (UserEnumType)childType, indentCount + 1, true);
		}
		appendIndent(builder, indentCount).append("}\n");
	}
	
	public void generate(Appendable builder, UserType type) throws IOException {
		builder.append("// Generated file!!!  DO NOT EDIT THIS!!!\n\n");

		createUserType(builder, type, 0, false);
	}
}
