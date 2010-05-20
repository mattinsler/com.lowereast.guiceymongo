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

package com.lowereast.guiceymongo.data.generator;

import java.io.IOException;

import org.antlr.stringtemplate.StringTemplate;

import com.lowereast.guiceymongo.data.generator.property.BlobProperty;
import com.lowereast.guiceymongo.data.generator.type.BlobType;

public class BlobPropertyGenerator extends PropertyGenerator<BlobType, BlobProperty> {
	public BlobPropertyGenerator(TypeRegistry typeRegistry) {
		super(BlobType.class, typeRegistry);
	}
	
	@Override
	public void createEquals(Appendable builder, BlobProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if (this.has$p.camelCaseName$Bucket() != other.has$p.camelCaseName$Bucket() || (this.has$p.camelCaseName$Bucket() && !this.get$p.camelCaseName$Bucket().equals(other.get$p.camelCaseName$Bucket())))\n" +
					"return false;\n" +
				"if (this.has$p.camelCaseName$Identity() != other.has$p.camelCaseName$Identity() || (this.has$p.camelCaseName$Identity() && !this.get$p.camelCaseName$Identity().equals(other.get$p.camelCaseName$Identity())))\n" +
					"return false;\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createKey(Appendable builder, BlobProperty property, int indentCount) throws IOException {
//		appendIndent(builder, indentCount).append("public static final com.lowereast.guiceymongo.data.BlobProperty<").append(property.getEnclosingType().getCanonicalJavaType()).append(", ").append(property.getType().getCanonicalJavaType()).append("> ").append(property.getKeyName()).append(" = com.lowereast.guiceymongo.data.BlobProperty.create(\"").append(keyValue).append("\");\n");
		
		StringTemplate template = new StringTemplate(
				"public static final String $p.keyName$ = \"$p.keyValue$\";\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createReadableMethod(Appendable builder, BlobProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				// has
				"public abstract boolean has$p.camelCaseName$();\n" +
				// hasBucket
				"public abstract boolean has$p.camelCaseName$Bucket();\n" +
				// hasIdentity
				"public abstract boolean has$p.camelCaseName$Identity();\n" +
				// getInputStream
				"public abstract java.io.InputStream get$p.camelCaseName$InputStream();\n" +
				// getBucket
				"public abstract String get$p.camelCaseName$Bucket();\n" +
				// getIdentity
				"public abstract com.mongodb.ObjectId get$p.camelCaseName$Identity();\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createWrapperMethod(Appendable builder, BlobProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				// member variable
				"protected com.mongodb.gridfs.GridFSDBFile $p.memberVariableName$ = null;\n" +
				// has
				"@Override\n" +
				"public boolean has$p.camelCaseName$() {\n" +
					"Object o = _backing.containsField($p.keyName$);" +
					"if (o == null || !(o instanceof com.mongodb.DBObject))\n" +
						"return false;" +
					"return ((com.mongodb.DBObject)o).containsField(\"bucket\") && ((com.mongodb.DBObject)o).containsField(\"identity\");" +
				"}\n" +
				// hasBucket
				"@Override\n" +
				"public boolean has$p.camelCaseName$Bucket() {\n" +
					"return _backing.containsField($p.keyName$) && ((com.mongodb.DBObject)_backing.get($p.keyName$)).containsField(\"bucket\");\n" +
				"}\n" +
				// hasIdentity
				"@Override\n" +
				"public boolean has$p.camelCaseName$Identity() {\n" +
					"return _backing.containsField($p.keyName$) && ((com.mongodb.DBObject)_backing.get($p.keyName$)).containsField(\"identity\");\n" +
				"}\n" +
				// getInputStream
				"@Override\n" +
				"public java.io.InputStream get$p.camelCaseName$InputStream() {\n" +
					"if ($p.memberVariableName$ == null) {\n" +
						"Object o = _backing.get($p.keyName$);\n" +
						"if (o != null && o instanceof com.mongodb.DBObject) {\n" +
							"String bucket = (String)((com.mongodb.DBObject)o).get(\"bucket\");\n" +
							"com.mongodb.ObjectId identity = (com.mongodb.ObjectId)((com.mongodb.DBObject)o).get(\"identity\");\n" +
							"if (bucket == null || identity == null)\n" +
								"return null;" +
							"com.lowereast.guiceymongo.GuiceyBucket guiceyBucket = com.lowereast.guiceymongo.guice.GuiceyMongoUtil.getGuiceyBucket(bucket);\n" +
							"if (guiceyBucket == null)\n" +
								"throw new RuntimeException(\"No bucket with key '\" + bucket + \"' is defined\");\n" +
							"$p.memberVariableName$ = guiceyBucket.findOne(identity);\n" +
						"}\n" +
					"}\n" +
					"return $p.memberVariableName$ == null ? null : $p.memberVariableName$.getInputStream();\n" +
				"}\n" +
				// getBucket
				"@Override\n" +
				"public String get$p.camelCaseName$Bucket() {\n" +
					"return !_backing.containsField($p.keyName$) ? null : (String)((com.mongodb.DBObject)_backing.get($p.keyName$)).get(\"bucket\");\n" +
				"}\n" +
				// getIdentity
				"@Override\n" +
				"public com.mongodb.ObjectId get$p.camelCaseName$Identity() {\n" +
					"return !_backing.containsField($p.keyName$) ? null : (com.mongodb.ObjectId)((com.mongodb.DBObject)_backing.get($p.keyName$)).get(\"identity\");\n" +
				"}\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, BlobProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				// member variable
				"protected java.io.ByteArrayOutputStream $p.memberVariableName$ = null;\n" +
				"protected String $p.memberVariableName$Bucket = null;\n" +
				"protected com.mongodb.ObjectId $p.memberVariableName$Identity = null;\n" +
				// has
				"@Override\n" +
				"public boolean has$p.camelCaseName$() {\n" +
					"return $p.memberVariableName$ != null || ($p.memberVariableName$Bucket != null && $p.memberVariableName$Identity != null);" +
				"}\n" +
				// hasBucket
				"@Override\n" +
				"public boolean has$p.camelCaseName$Bucket() {\n" +
					"return $p.memberVariableName$Bucket != null;\n" +
				"}\n" +
				// hasIdentity
				"@Override\n" +
				"public boolean has$p.camelCaseName$Identity() {\n" +
					"return $p.memberVariableName$Identity != null;\n" +
				"}\n" +
				// load
				"private boolean load$p.camelCaseName$() {\n" +
					"if ($p.memberVariableName$ == null && $p.memberVariableName$Bucket != null && $p.memberVariableName$Identity != null) {\n" +
		        		"com.lowereast.guiceymongo.GuiceyBucket guiceyBucket = com.lowereast.guiceymongo.guice.GuiceyMongoUtil.getGuiceyBucket($p.memberVariableName$Bucket);\n" +
		                "if (guiceyBucket == null)\n" +
		                	"throw new RuntimeException(\"No bucket with key '\" + $p.memberVariableName$Bucket + \"' is defined\");\n" +
		                "com.mongodb.gridfs.GridFSDBFile file = guiceyBucket.findOne($p.memberVariableName$Identity);\n" +
		                "if (file != null) {\n" +
		                	"java.io.InputStream input = file.getInputStream();\n" +
		                	"try {\n" +
		                		"$p.memberVariableName$ = new java.io.ByteArrayOutputStream();\n" +
		                		"byte[] buffer = new byte[1024];\n" +
		                		"while (true) {\n" +
		                			"int count = input.read(buffer);\n" +
		                			"if (count <= 0)\n" +
		                				"break;\n" +
		                			"$p.memberVariableName$.write(buffer, 0, count);\n" +
		                		"}\n" +
		                	"} catch (Exception e) {\n" +
		                	"}\n" +
		                "}\n" +
		            "}\n" +
	                "return $p.memberVariableName$ != null;\n" +
				"}\n" +
				// getInputStream
				"@Override\n" +
				"public java.io.InputStream get$p.camelCaseName$InputStream() {\n" +
					"return load$p.camelCaseName$() ? new java.io.ByteArrayInputStream($p.memberVariableName$.toByteArray()) : null;\n" +
				"}\n" +
				// getBucket
				"@Override\n" +
				"public String get$p.camelCaseName$Bucket() {\n" +
					"return $p.memberVariableName$Bucket;\n" +
				"}\n" +
				// getIdentity
				"@Override\n" +
				"public com.mongodb.ObjectId get$p.camelCaseName$Identity() {\n" +
					"return $p.memberVariableName$Identity;\n" +
				"}\n" +
				// getOutputStream
				"public java.io.OutputStream get$p.camelCaseName$OutputStream() {\n" +
					"if (!load$p.camelCaseName$()) {\n" +
						"$p.memberVariableName$Identity = null;\n" +
						"$p.memberVariableName$ = new java.io.ByteArrayOutputStream();\n" +
					"}\n" +
					"return $p.memberVariableName$;\n" +
				"}\n" +
				// setBucket
				"public Builder set$p.camelCaseName$Bucket(String bucketKey) {\n" +
					"$p.memberVariableName$Bucket = bucketKey;\n" +
					"return this;\n" +
				"}\n" +
				// clear
				"public Builder clear$p.camelCaseName$() {\n" +
					"$p.memberVariableName$ = null;\n" +
					"$p.memberVariableName$Bucket = null;\n" +
					"$p.memberVariableName$Identity = null;\n" +
					"return this;\n" +
				"}\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderNewBuilder(Appendable builder, BlobProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if (value.has$p.camelCaseName$Bucket())\n" +
					"builder.set$p.camelCaseName$Bucket(value.get$p.camelCaseName$Bucket());\n" +
				"if (value.has$p.camelCaseName$Identity())\n" +
					"builder.$p.memberVariableName$Identity = value.get$p.camelCaseName$Identity();\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderBuild(Appendable builder, BlobProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"if ($p.memberVariableName$ != null && $p.memberVariableName$.size() > 0 && $p.memberVariableName$Identity == null) {\n" +
					"if ($p.memberVariableName$Bucket == null)\n" +
						"throw new RuntimeException(\"Trying to save $p.camelCaseName$ but no bucket was specified\");\n" +
					"com.lowereast.guiceymongo.GuiceyBucket guicey$p.camelCaseName$Bucket = com.lowereast.guiceymongo.guice.GuiceyMongoUtil.getGuiceyBucket($p.memberVariableName$Bucket);\n" +
	                "if (guicey$p.camelCaseName$Bucket == null)\n" +
	                	"throw new RuntimeException(\"No bucket with key '\" + $p.memberVariableName$Bucket + \"' is defined\");\n" +
					"com.mongodb.gridfs.GridFSInputFile file$p.camelCaseName$ = guicey$p.camelCaseName$Bucket.createFile(get$p.camelCaseName$InputStream());\n" +
					"file$p.camelCaseName$.save();\n" +
					"$p.memberVariableName$Identity = (com.mongodb.ObjectId)file$p.camelCaseName$.getId()\n;" +
					"dbObject.put($p.keyName$, new com.mongodb.BasicDBObject(\"bucket\", $p.memberVariableName$Bucket).append(\"identity\", $p.memberVariableName$Identity));\n" +
				"}\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createUpdaterMethod(Appendable builder, BlobProperty property, int indentCount) throws IOException {
//		PrimitiveType type = property.getType();
//		
//		// has
//		appendIndent(builder, indentCount).append("@Override public boolean has").append(property.getCamelCaseName()).append("() {\n");
//		appendIndent(builder, indentCount + 1).append("return _wrapper.has").append(property.getCamelCaseName()).append("() || _builder.has").append(property.getCamelCaseName()).append("();\n");
//		appendIndent(builder, indentCount).append("}\n");
//		
//		// get
//		appendIndent(builder, indentCount).append("@Override public ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("() {\n");
//		appendIndent(builder, indentCount + 1).append("return _builder.has").append(property.getCamelCaseName()).append("() ? _builder.get").append(property.getCamelCaseName()).append("() : _wrapper.get").append(property.getCamelCaseName()).append("();\n");
//		appendIndent(builder, indentCount).append("}\n");
//		
//		// set
//		appendIndent(builder, indentCount).append("public Updater set").append(property.getCamelCaseName()).append("(").append(type.getCanonicalJavaType()).append(" value) {\n");
//		appendIndent(builder, indentCount + 1).append("_builder.set").append(property.getCamelCaseName()).append("(value);\n");
//		appendIndent(builder, indentCount + 1).append("return this;\n");
//		appendIndent(builder, indentCount).append("}\n");
//		
//		// clear
//		appendIndent(builder, indentCount).append("public Updater clear").append(property.getCamelCaseName()).append("() {\n");
//		appendIndent(builder, indentCount + 1).append("_builder.clear").append(property.getCamelCaseName()).append("();\n");
//		appendIndent(builder, indentCount + 1).append("return this;\n");
//		appendIndent(builder, indentCount).append("}\n");
	}
	
	@Override
	public void createUpdaterBuildUpdate(Appendable builder, BlobProperty property, int indentCount) throws IOException {
//		if (property.getOption("identity") == null) {
//			appendIndent(builder, indentCount).append("if (_builder.has").append(property.getCamelCaseName()).append("())\n");
//			appendIndent(builder, indentCount + 1).append("dbObject.put(path + ").append(property.getKeyName()).append(", _builder.get").append(property.getCamelCaseName()).append("());\n");
//		}
	}
}
