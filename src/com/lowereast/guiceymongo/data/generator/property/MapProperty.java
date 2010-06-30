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

package com.lowereast.guiceymongo.data.generator.property;

import com.lowereast.guiceymongo.data.generator.type.ListType;
import com.lowereast.guiceymongo.data.generator.type.MapType;
import com.lowereast.guiceymongo.data.generator.type.PrimitiveType;
import com.lowereast.guiceymongo.data.generator.type.SetType;
import com.lowereast.guiceymongo.data.generator.type.Type;
import com.lowereast.guiceymongo.data.generator.type.UserDataType;

public class MapProperty extends Property<MapType> {
	public MapProperty(UserDataType enclosingType, String name, MapType type, boolean useCamelCaseKeys) {
		super(enclosingType, name, type, useCamelCaseKeys);
	}
	
	@Override
	public String getMemberVariableName() {
		return super.getMemberVariableName() + "Map";
	}
	
	public String getKeyType() {
		return super.getType().getKeyType().getJavaType();
	}
	
	public String getMapKeyType() {
		Type type = super.getType().getKeyType();
		if (type instanceof PrimitiveType)
			return ((PrimitiveType)type).getJavaBoxedType();
		return type.getJavaType();
	}
	
	public String getBuilderKeyType() {
		return getMapKeyType();
	}
	
	public String getValueType() {
		return super.getType().getValueType().getJavaType();
	}
	
	public String getMapValueType() {
		Type type = super.getType().getValueType();
		if (type instanceof PrimitiveType)
			return ((PrimitiveType)type).getJavaBoxedType();
		if (type instanceof ListType) {
			Type itemType = ((ListType)type).getItemType();
			if (itemType instanceof PrimitiveType)
				return "java.util.List<" + ((PrimitiveType)itemType).getJavaBoxedType() + ">";
		}
		return type.getJavaType();
	}
	
	public String getNewMapValueType() {
		Type type = super.getType().getValueType();
		if (type instanceof UserDataType) {
			return type.getJavaType() + ".newBuilder";
		}
		if (type instanceof ListType) {
			Type itemType = ((ListType)type).getItemType();
			if (itemType instanceof PrimitiveType)
				return "java.util.ArrayList<" + ((PrimitiveType)itemType).getJavaBoxedType() + ">";
			return "java.util.ArrayList<" + ((ListType)type).getItemType().getJavaType() + ">";
		}
		if (type instanceof SetType) {
			Type itemType = ((SetType)type).getItemType();
			if (itemType instanceof PrimitiveType)
				return "java.util.HashSet<" + ((PrimitiveType)itemType).getJavaBoxedType() + ">";
			return "java.util.HashSet<" + ((SetType)type).getItemType().getJavaType() + ">";
		}
		return "";
	}
	
	public String getBuilderValueType() {
		Type type = super.getType().getValueType();
		if (type instanceof UserDataType)
			return getValueType() + ".Builder";
		return getValueType();
	}
	
	public String getBuilderMapValueType() {
		Type type = super.getType().getValueType();
		if (type instanceof UserDataType)
			return getMapValueType() + ".Builder";
		if (type instanceof ListType) {
			Type itemType = ((ListType)type).getItemType();
			if (itemType instanceof PrimitiveType)
				return "java.util.List<" + ((PrimitiveType)itemType).getJavaBoxedType() + ">";
		}
			
		return getMapValueType();
	}
	
	public String getMapType() {
		return "java.util.Map<" + getMapKeyType() + ", " + getMapValueType() + ">";
	}
	
	public String getBuilderMapType() {
		return "java.util.Map<" + getBuilderKeyType() + ", " + getBuilderMapValueType() + ">";
	}
	
	public String getNewMapType() {
		return "java.util.HashMap<" + getMapKeyType() + ", " + getMapValueType() + ">";
	}
	
	public String getNewBuilderType() {
		return "java.util.HashMap<" + getBuilderKeyType() + ", " + getBuilderValueType() + ">";
	}
}
