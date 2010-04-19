package com.lowereast.guiceymongo.data.type;

import java.util.Arrays;
import java.util.List;

public class PrimitiveType extends Type {
	private final String _javaBoxedType;

	public PrimitiveType(String guiceyType, String javaType, String javaBoxedType) {
		super(guiceyType, javaType, javaBoxedType);
		_javaBoxedType = javaBoxedType;
	}
	
	public PrimitiveType(String guiceyType, String javaType, String javaBoxedType, List<String> imports) {
		super(guiceyType, javaType, imports);
		_javaBoxedType = javaBoxedType;
	}
	
	public String getJavaBoxedType() {
		return _javaBoxedType;
	}
	
	public static PrimitiveType DoubleType = new PrimitiveType("double", "double", "Double");
	public static PrimitiveType FloatType = new PrimitiveType("float", "float", "Float");
	public static PrimitiveType Int32Type = new PrimitiveType("int32", "int", "Integer");
	public static PrimitiveType Int64Type = new PrimitiveType("int64", "long", "Long");
	public static PrimitiveType BoolType = new PrimitiveType("bool", "boolean", "Boolean");
	public static PrimitiveType StringType = new PrimitiveType("string", "String", "String");
//	public static PrimitiveType BytesType = new PrimitiveType("bytes", "", ""); // byte[]??
	public static PrimitiveType DateType = new PrimitiveType("date", "Date", "Date", Arrays.asList("java.util.Date"));
	
	public static PrimitiveType ObjectIdType = new PrimitiveType("object_id", "ObjectId", "ObjectId", Arrays.asList("com.mongodb.ObjectId"));
	
	// DBTimestamp??
	
//	public static PrimitiveType FloatType = new PrimitiveType("", "", "");
//	public static PrimitiveType FloatType = new PrimitiveType("", "", "");
}
