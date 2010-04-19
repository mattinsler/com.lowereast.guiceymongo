package com.lowereast.guiceymongo.data.type;

import java.util.Arrays;

public class ListType extends Type {
	private Type _itemType;
	
	public ListType(Type itemType) {
		super("list", "List<" + itemType.getSimpleJavaType() + ">", Arrays.asList("java.util.List", "java.util.Collections", "java.util.ArrayList"));
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
