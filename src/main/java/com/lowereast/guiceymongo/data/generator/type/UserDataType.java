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

package com.lowereast.guiceymongo.data.generator.type;

import java.util.List;

import com.google.inject.internal.Lists;
import com.lowereast.guiceymongo.data.generator.property.Property;

public class UserDataType extends UserType {
	private final List<Property<?>> _properties = Lists.newArrayList();
	private final List<UserType> _childTypes = Lists.newArrayList();
	
	private Property<?> _identityProperty;
	
	public UserDataType(String guiceyType) {
		super(guiceyType);
	}

	public List<Property<?>> getProperties() {
		return _properties;
	}
	
	public void addProperty(Property<?> property) {
		_properties.add(property);
	}
	
	public List<UserType> getChildTypes() {
		return _childTypes;
	}
	
	public void addChildType(UserType childType) {
		if (_childTypes.indexOf(childType) == -1) {
			_childTypes.add(childType);
			childType.setParentType(this);
		}
	}
	
	public Property<?> getIdentityProperty() {
		return _identityProperty;
	}
	
	public void setIdentityProperty(Property<?> identityProperty) {
		_identityProperty = identityProperty;
	}
}
