/**
 *      Copyright (C) 2010 Lowereast Software
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.lowereast.guiceymongo.data.generator.type;

public class PrimitiveType extends Type {
	private final String _javaBoxedType;

	public PrimitiveType(String guiceyType, String javaType, String javaBoxedType) {
		super(guiceyType, javaType);
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
	public static PrimitiveType DateType = new PrimitiveType("date", "java.util.Date", "java.util.Date");
	
	public static PrimitiveType ObjectIdType = new PrimitiveType("object_id", "com.mongodb.ObjectId", "com.mongodb.ObjectId");
	public static PrimitiveType DBObjectType = new PrimitiveType("db_object", "com.mongodb.DBObject", "com.mongodb.DBObject");
	public static PrimitiveType DBTimestampType = new PrimitiveType("db_timestamp", "com.mongodb.DBTimestamp", "com.mongodb.DBTimestamp");
}
