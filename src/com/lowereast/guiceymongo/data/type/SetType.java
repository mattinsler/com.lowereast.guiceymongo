package com.lowereast.guiceymongo.data.type;

public class SetType extends Type {
	private Type _itemType;
	
	public SetType(Type itemType) {
		super("set", "Set<" + itemType.getSimpleJavaType() + ">", "java.util.Set<" + itemType.getCanonicalJavaType() + ">");
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
