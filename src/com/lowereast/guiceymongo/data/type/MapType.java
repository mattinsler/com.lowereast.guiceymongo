package com.lowereast.guiceymongo.data.type;

import java.util.Arrays;

public class MapType extends Type {
	private Type _keyType;
	private Type _valueType;
	
	public MapType(Type keyType, Type valueType) {
		super("map", "Map<" + keyType.getSimpleJavaType() + ", " + valueType.getSimpleJavaType() + ">", Arrays.asList("java.util.Map", "java.util.HashMap", "java.util.Set", "java.util.Collections", "com.lowereast.guiceymongo.util.DBObjectUtil"));
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
