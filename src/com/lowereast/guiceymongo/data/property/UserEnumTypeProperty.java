package com.lowereast.guiceymongo.data.property;

import com.lowereast.guiceymongo.data.type.UserEnumType;

public class UserEnumTypeProperty extends Property<UserEnumType> {
	public UserEnumTypeProperty(String name, UserEnumType type, boolean useCamelCaseKeys) {
		super(name, type, useCamelCaseKeys);
	}
}
