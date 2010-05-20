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

import com.lowereast.guiceymongo.data.generator.type.PrimitiveType;
import com.lowereast.guiceymongo.data.generator.type.SetType;
import com.lowereast.guiceymongo.data.generator.type.Type;
import com.lowereast.guiceymongo.data.generator.type.UserDataType;

public class SetProperty extends Property<SetType> {
	public SetProperty(UserDataType enclosingType, String name, SetType type, boolean useCamelCaseKeys) {
		super(enclosingType, name, type, useCamelCaseKeys);
	}
	
	@Override
	public String getMemberVariableName() {
		return super.getMemberVariableName() + "Set";
	}
	
	public String getItemType() {
		return super.getType().getItemType().getJavaType();
	}
	
	public String getSetItemType() {
		Type type = super.getType().getItemType();
		if (type instanceof PrimitiveType)
			return ((PrimitiveType)type).getJavaBoxedType();
		return type.getJavaType();
	}
	
	public String getBuilderItemType() {
		Type type = super.getType().getItemType();
		if (type instanceof UserDataType)
			return getItemType() + ".Builder";
		return getItemType();
	}
	
	public String getBuilderSetItemType() {
		Type type = super.getType().getItemType();
		if (type instanceof UserDataType)
			return getSetItemType() + ".Builder";
		return getSetItemType();
	}
	
	public String getSetType() {
		return "java.util.Set<" + getSetItemType() + ">";
	}
	
	public String getNewSetType() {
		return "java.util.HashSet<" + getSetItemType() + ">";
	}
}
