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

import com.lowereast.guiceymongo.data.generator.type.UserType;

public class UserTypeProperty extends Property<UserType> {
	public UserTypeProperty(UserType enclosingType, String name, UserType type, boolean useCamelCaseKeys) {
		super(enclosingType, name, type, useCamelCaseKeys);
	}
	
	public String getUserType() {
		return super.getType().getJavaType();
	}
	
	public String getBuilderUserType() {
		return getUserType() + ".Builder";
	}
}
