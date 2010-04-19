package com.lowereast.guiceymongo.data.type;

import java.util.Arrays;

public class SetType extends Type {
	private Type _itemType;
	
	public SetType(Type itemType) {
		super("set", "Set<" + itemType.getSimpleJavaType() + ">", Arrays.asList("java.util.Set", "java.util.HashSet", "java.util.List", "java.util.Collections"));
		_itemType = itemType;
	}

	public Type getItemType() {
		return _itemType;
	}
	
	@Override
	public String toString() {
		return getSimpleJavaType();
	}
}
