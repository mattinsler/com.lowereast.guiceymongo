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
import com.lowereast.guiceymongo.data.generator.type.PrimitiveType;
import com.lowereast.guiceymongo.data.generator.type.Type;
import com.lowereast.guiceymongo.data.generator.type.UserDataType;

public class ListProperty extends Property<ListType> {
	public ListProperty(UserDataType enclosingType, String name, ListType type, String comment, boolean useCamelCaseKeys) {
		super(enclosingType, name, type, comment, useCamelCaseKeys);
	}

	@Override
	public String getMemberVariableName() {
		return super.getMemberVariableName() + "List";
	}

	public String getItemType() {
		return super.getType().getItemType().getJavaType();
	}
	
	public String getListItemType() {
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
	
	public String getBuilderListItemType() {
		Type type = super.getType().getItemType();
		if (type instanceof UserDataType)
			return getListItemType() + ".Builder";
		return getListItemType();
	}
	
	public String getListType() {
		return "java.util.List<" + getListItemType() + ">";
	}
	
	public String getNewListType() {
		return "java.util.ArrayList<" + getListItemType() + ">";
	}
}
