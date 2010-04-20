package com.lowereast.guiceymongo.data.type;


public class ListType extends Type {
	private Type _itemType;
	
	public ListType(Type itemType) {
		super("list", "List<" + itemType.getSimpleJavaType() + ">", "java.util.List<" + itemType.getCanonicalJavaType() + ">");
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
