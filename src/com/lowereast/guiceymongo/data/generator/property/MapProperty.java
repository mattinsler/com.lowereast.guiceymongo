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

import com.lowereast.guiceymongo.data.generator.type.MapType;
import com.lowereast.guiceymongo.data.generator.type.PrimitiveType;
import com.lowereast.guiceymongo.data.generator.type.Type;
import com.lowereast.guiceymongo.data.generator.type.UserType;

public class MapProperty extends Property<MapType> {
	public MapProperty(UserType enclosingType, String name, MapType type, boolean useCamelCaseKeys) {
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
		return type.getJavaType();
	}
	
	public String getBuilderValueType() {
		Type type = super.getType().getValueType();
		if (type instanceof UserType)
			return getValueType() + ".Builder";
		return getValueType();
	}
	
	public String getBuilderMapValueType() {
		Type type = super.getType().getValueType();
		if (type instanceof UserType)
			return getMapValueType() + ".Builder";
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
