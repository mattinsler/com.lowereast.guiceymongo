package com.lowereast.guiceymongo.data.type;

public class PrimitiveType extends Type {
	private final String _javaBoxedType;

	public PrimitiveType(String guiceyType, String simpleJavaType, String canonicalJavaType, String javaBoxedType) {
		super(guiceyType, simpleJavaType, canonicalJavaType);
		_javaBoxedType = javaBoxedType;
	}
	
	public String getJavaBoxedType() {
		return _javaBoxedType;
	}
	
	public static PrimitiveType DoubleType = new PrimitiveType("double", "double", "double", "Double");
	public static PrimitiveType FloatType = new PrimitiveType("float", "float", "float", "Float");
	public static PrimitiveType Int32Type = new PrimitiveType("int32", "int", "int", "Integer");
	public static PrimitiveType Int64Type = new PrimitiveType("int64", "long", "long", "Long");
	public static PrimitiveType BoolType = new PrimitiveType("bool", "boolean", "boolean", "Boolean");
	public static PrimitiveType StringType = new PrimitiveType("string", "String", "String", "String");
//	public static PrimitiveType BytesType = new PrimitiveType("bytes", "", ""); // byte[]??
	public static PrimitiveType DateType = new PrimitiveType("date", "Date", "java.util.Date", "java.util.Date");
	
	public static PrimitiveType ObjectIdType = new PrimitiveType("object_id", "ObjectId", "com.mongodb.ObjectId", "com.mongodb.ObjectId");
	
	// DBTimestamp??
	
//	public static PrimitiveType FloatType = new PrimitiveType("", "", "");
//	public static PrimitiveType FloatType = new PrimitiveType("", "", "");
}
