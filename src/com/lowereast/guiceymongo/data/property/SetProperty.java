package com.lowereast.guiceymongo.data.property;

import com.lowereast.guiceymongo.data.type.SetType;

public class SetProperty extends Property<SetType> {
	public SetProperty(String name, SetType type, boolean useCamelCaseKeys) {
		super(name, type, useCamelCaseKeys);
	}
	
	@Override
	public String getMemberVariableName() {
		return super.getMemberVariableName() + "Set";
	}
}
