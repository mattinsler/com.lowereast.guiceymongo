package com.lowereast.guiceymongo.data.type;

public class MapType extends Type {
	private Type _keyType;
	private Type _valueType;
	
	public MapType(Type keyType, Type valueType) {
		super("map", "Map<" + keyType.getSimpleJavaType() + ", " + valueType.getSimpleJavaType() + ">", "java.util.Map<" + keyType.getCanonicalJavaType() + ", " + valueType.getCanonicalJavaType() + ">");
		_keyType = keyType;
		_valueType = valueType;
	}

	public Type getKeyType() {
		return _keyType;
	}
	
	public Type getValueType() {
		return _valueType;
	}
	
	@Override
	public String toString() {
		return getSimpleJavaType();
	}
}
