package com.lowereast.guiceymongo.data.property;

import com.lowereast.guiceymongo.data.type.UserType;

public class UserTypeProperty extends Property<UserType> {
	public UserTypeProperty(String name, UserType type, boolean useCamelCaseKeys) {
		super(name, type, useCamelCaseKeys);
	}
}
