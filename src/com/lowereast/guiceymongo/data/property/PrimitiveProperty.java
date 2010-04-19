package com.lowereast.guiceymongo.data.property;

import com.lowereast.guiceymongo.data.type.PrimitiveType;

public class PrimitiveProperty extends Property<PrimitiveType> {
	public PrimitiveProperty(String name, PrimitiveType type, boolean useCamelCaseKeys) {
		super(name, type, useCamelCaseKeys);
	}
}
