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

package com.lowereast.guiceymongo.data.parser;

import java.util.List;

import org.antlr.runtime.tree.CommonTree;

import com.lowereast.guiceymongo.data.generator.TypeRegistry;
import com.lowereast.guiceymongo.data.option.Option;
import com.lowereast.guiceymongo.data.property.ListProperty;
import com.lowereast.guiceymongo.data.property.MapProperty;
import com.lowereast.guiceymongo.data.property.PrimitiveProperty;
import com.lowereast.guiceymongo.data.property.Property;
import com.lowereast.guiceymongo.data.property.SetProperty;
import com.lowereast.guiceymongo.data.property.UserEnumTypeProperty;
import com.lowereast.guiceymongo.data.property.UserTypeProperty;
import com.lowereast.guiceymongo.data.type.ListType;
import com.lowereast.guiceymongo.data.type.MapType;
import com.lowereast.guiceymongo.data.type.PrimitiveType;
import com.lowereast.guiceymongo.data.type.SetType;
import com.lowereast.guiceymongo.data.type.Type;
import com.lowereast.guiceymongo.data.type.UserEnumType;
import com.lowereast.guiceymongo.data.type.UserType;

public class TypeParser {
	private final boolean _useCamelCaseKeys;
	private final TypeRegistry _typeRegistry;

	public TypeParser(TypeRegistry typeRegistry, boolean useCamelCaseKeys) {
		_useCamelCaseKeys = useCamelCaseKeys;
		_typeRegistry = typeRegistry;
	}
	
	private Option parseOptionTree(CommonTree tree) {
		assert GuiceyDataParser.OPTION == tree.getToken().getType();
		
		List<CommonTree> children = tree.getChildren();
		Option option = new Option(children.get(0).getText());
		if (children.size() == 2 && GuiceyDataParser.PAIR != children.get(1).getToken().getType())
			option.addParameter("value", children.get(1).getText());
		else {
			for (int x = 1; x < children.size(); ++x) {
				if (GuiceyDataParser.PAIR == children.get(x).getToken().getType() && children.get(x).getChildCount() == 2)
					option.addParameter(children.get(x).getChild(0).getText(), children.get(x).getChild(1).getText());
			}
		}
		return option;
	}
	
	private Property<?> getProperty(UserType userType, String propertyName, int typeNumber, List<CommonTree> typeArguments) {
		Type type = _typeRegistry.getScopedGuiceyType(userType, typeArguments.get(0).getText());
		if (type == null)
			throw new RuntimeException("Could not find type " + typeArguments.get(0).getText());
		
		switch (typeNumber) {
		case GuiceyDataParser.TYPE_PRIMITIVE:
			if (type instanceof PrimitiveType)
				return new PrimitiveProperty(propertyName, (PrimitiveType)type, _useCamelCaseKeys);
			else if (type instanceof UserEnumType)
				return new UserEnumTypeProperty(propertyName, (UserEnumType)type, _useCamelCaseKeys);
			else if (type instanceof UserType)
				return new UserTypeProperty(propertyName, (UserType)type, _useCamelCaseKeys);
		case GuiceyDataParser.TYPE_LIST:
			return new ListProperty(propertyName, new ListType(type), _useCamelCaseKeys);
		case GuiceyDataParser.TYPE_SET:
			return new SetProperty(propertyName, new SetType(type), _useCamelCaseKeys);
		case GuiceyDataParser.TYPE_MAP:
			Type valueType = _typeRegistry.getScopedGuiceyType(userType, typeArguments.get(1).getText());
			if (valueType == null)
				throw new RuntimeException("Could not find type " + typeArguments.get(1).getText());
			return new MapProperty(propertyName, new MapType(type, valueType), _useCamelCaseKeys);
		}
		throw new RuntimeException("The parser might have messed up...");
	}
	
	private void parsePropertyTree(CommonTree tree, UserType type) {
		assert GuiceyDataParser.PROPERTY == tree.getToken().getType();
		
		List<CommonTree> children = tree.getChildren();
		String propertyName = children.get(0).getText();
		
		Property<?> property = getProperty(type, propertyName, children.get(1).getToken().getType(), children.subList(2, children.size()));
		type.addProperty(property);
		
		for (int x = 3; x < children.size(); ++x) {
			if (GuiceyDataParser.OPTION == children.get(x).getToken().getType()) {
				Option option = parseOptionTree(children.get(x));
				property.addOption(option);
				if ("identity".equals(option.getName())) {
					// validation possibly...
					type.setIdentityProperty(property);
				}
			}
		}
	}
	
	private void parseDataTree(CommonTree tree, UserType parentType) {
		assert GuiceyDataParser.DATA == tree.getToken().getType();

		UserType type = _typeRegistry.getGuiceyType((parentType == null ? "" : parentType.getGuiceyType() + ".") + tree.getChild(0).getText());
		
		List<CommonTree> children = tree.getChildren();
		for (CommonTree child : children.subList(1, children.size())) {
			switch (child.getToken().getType()) {
			case GuiceyDataParser.DATA:
				parseDataTree(child, type);
				break;
			case GuiceyDataParser.ENUM:
				parseEnumTree(child, type);
				break;
			case GuiceyDataParser.PROPERTY:
				parsePropertyTree(child, type);
				break;
			}
		}
	}
	
	private void parseEnumTree(CommonTree tree, UserType parentType) {
		assert GuiceyDataParser.ENUM == tree.getToken().getType();
		
		UserEnumType type = _typeRegistry.getGuiceyType((parentType == null ? "" : parentType.getGuiceyType() + ".") + tree.getChild(0).getText());
		
		List<CommonTree> children = tree.getChildren();
		for (int x = 1; x < children.size(); ++x)
			type.addValue(children.get(x).getText());
	}
	
	private void registerAllUserTypes(CommonTree tree, UserType parentType) {
		try {
		UserType type = null;
		if (tree.getToken() != null) {
			if (GuiceyDataParser.DATA == tree.getToken().getType() && tree.getChildCount() > 0)
				type = new UserType(tree.getChild(0).getText());
			else if (GuiceyDataParser.ENUM == tree.getToken().getType() && tree.getChildCount() > 0)
				type = new UserEnumType(tree.getChild(0).getText());
			if (type != null) {
				if (parentType != null)
					parentType.addChildType(type);
				_typeRegistry.addType(type);
			}
		}
		if (tree.getChildCount() > 0) {
			for (CommonTree child : (List<CommonTree>)tree.getChildren())
				registerAllUserTypes(child, type);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void parse(CommonTree tree) {
		if (tree == null)
			return;
			
		registerAllUserTypes(tree, null);
		for (UserType type : _typeRegistry.getTypes(UserType.class))
			System.out.println(type.getSimpleJavaType());
		
		for (CommonTree typeTree : (List<CommonTree>)tree.getChildren()) {
			if (GuiceyDataParser.EOF != typeTree.getToken().getType()) {
				if (GuiceyDataParser.DATA == typeTree.getToken().getType())
					parseDataTree(typeTree, null);
				else if (GuiceyDataParser.ENUM == typeTree.getToken().getType())
					parseEnumTree(typeTree, null);
			}
		}
	}
}
