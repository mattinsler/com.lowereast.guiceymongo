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

import com.lowereast.guiceymongo.data.generator.property.MapProperty;
import com.lowereast.guiceymongo.data.generator.type.ListType;
import com.lowereast.guiceymongo.data.generator.type.MapType;
import com.lowereast.guiceymongo.data.generator.type.PrimitiveType;
import com.lowereast.guiceymongo.data.generator.type.SetType;
import com.lowereast.guiceymongo.data.generator.type.Type;
import com.lowereast.guiceymongo.data.generator.type.UserEnumType;
import com.lowereast.guiceymongo.data.generator.type.UserType;

public class MapPropertyGenerator extends PropertyGenerator<MapType, MapProperty> {
	public MapPropertyGenerator(TypeRegistry typeRegistry) {
		super(MapType.class, typeRegistry);
	}

	@Override
	public void createEquals(Appendable builder, MapProperty property, int indentCount) throws IOException {
		Type valueType = property.getType().getValueType();
		
		String s =
			"if (this.get$p.camelCaseName$Count() != other.get$p.camelCaseName$Count())\n" +
        		"return false;\n" +
        	"if (this.get$p.camelCaseName$Count() > 0) {\n" +
        		"for ($p.keyType$ key : this.get$p.camelCaseName$Keys()) {\n" +
        			"if (!other.contains$p.camelCaseName$(key))\n" +
        				"return false;\n";
		if (PrimitiveType.BoolType.equals(valueType) ||
				PrimitiveType.DoubleType.equals(valueType) ||
				PrimitiveType.FloatType.equals(valueType) ||
				PrimitiveType.Int32Type.equals(valueType) ||
				PrimitiveType.Int64Type.equals(valueType)) {
			s +=
				"if (this.get$p.camelCaseName$(key) != other.get$p.camelCaseName$(key))";
		} else
			s +=
				"if (!this.get$p.camelCaseName$(key).equals(other.get$p.camelCaseName$(key)))";
		s +=
						"return false;\n" +
				"}\n" +
			"}\n";
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}

	@Override
	public void createKey(Appendable builder, MapProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"public static final String $p.keyName$ = \"$p.keyValue$\";\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createReadableMethod(Appendable builder, MapProperty property, int indentCount) throws IOException {
		StringTemplate template = new StringTemplate(
				"public abstract boolean contains$p.camelCaseName$($p.keyType$ key);\n" +
				"public abstract int get$p.camelCaseName$Count();\n" +
				"public abstract $p.valueType$ get$p.camelCaseName$($p.keyType$ key);\n" +
				"public abstract java.util.Set<$p.mapKeyType$> get$p.camelCaseName$Keys();\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}

	@Override
	public void createWrapperMethod(Appendable builder, MapProperty property, int indentCount) throws IOException {
		MapType type = property.getType();

		String s =
				"protected $p.mapType$ $p.memberVariableName$ = null;\n" +
				"protected $p.mapType$ get$p.camelCaseName$Map() {\n" +
					"if ($p.memberVariableName$ == null) {\n" +
						"Object value = _backing.get($p.keyName$);\n" +
						"if (value != null && value instanceof com.mongodb.DBObject) {\n" +
							"$p.mapType$ map = new $p.newMapType$();\n" +
							"com.mongodb.DBObject obj = (com.mongodb.DBObject)value;\n" +
							"for (String key : obj.keySet()) {\n";

		if (type.getKeyType() instanceof UserEnumType) {
			s += 				"try {\n";
			if (type.getValueType() instanceof UserEnumType)
				s +=				"map.put($p.mapKeyType$.valueOf(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key)), $p.mapValueType$.valueOf((String)obj.get(key)));\n";
			else if (type.getValueType() instanceof UserType)
				s +=				"map.put($p.mapKeyType$.valueOf(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key)), $p.mapValueType$.wrap((com.mongodb.DBObject)obj.get(key)));\n";
			else
				s +=				"map.put($p.mapKeyType$.valueOf(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key)), ($p.mapValueType$)obj.get(key));\n";
			s +=				"} catch (Exception e) {\n" +
								"}\n";
		} else if (PrimitiveType.StringType.equals(type.getKeyType())) {
			if (type.getValueType() instanceof UserEnumType) {
				s += 			"try {\n" +
									"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key), $p.mapValueType$.valueOf((String)obj.get(key)));\n" +
								"} catch (Exception e) {\n" +
								"}\n";
			} else if (type.getValueType() instanceof UserType)
				s += 			"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key), $p.mapValueType$.wrap((com.mongodb.DBObject)obj.get(key)));\n";
			else
				s += 			"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key), ($p.mapValueType$)obj.get(key));\n";
		} else
			throw new RuntimeException("Map types can only have a string or enum as a key");
		
		s +=
							"}\n" +
							"$p.memberVariableName$ = java.util.Collections.unmodifiableMap(map);\n" +
						"}\n" +
					"}\n" +
					"return $p.memberVariableName$;\n" +
				"}\n" +
				"@Override\n" +
				"public boolean contains$p.camelCaseName$($p.keyType$ key) {\n" +
					"$p.mapType$ map = get$p.camelCaseName$Map();\n" +
					"return map == null ? false : map.containsKey(key);\n" +
				"}\n" +
				"@Override\n" +
				"public int get$p.camelCaseName$Count() {\n" +
					"$p.mapType$ map = get$p.camelCaseName$Map();\n" +
					"return map == null ? 0 : map.size();\n" +
				"}\n" +
				"@Override\n" +
				"public $p.valueType$ get$p.camelCaseName$($p.keyType$ key) {\n" +
					"$p.mapType$ map = get$p.camelCaseName$Map();\n" +
					"return map == null ? null : map.get(key);\n" +
				"}\n" +
				"@Override\n" +
				"public java.util.Set<$p.mapKeyType$> get$p.camelCaseName$Keys() {\n" +
					"$p.mapType$ map = get$p.camelCaseName$Map();\n" +
					"return map == null ? null : map.keySet();\n" +
				"}\n";
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, MapProperty property, int indentCount) throws IOException {
		String s =
				// member variable
				"protected $p.mapType$ $p.memberVariableName$ = null;\n" +
				// getMap
				"protected $p.mapType$ get$p.camelCaseName$Map() {\n" +
					"if ($p.memberVariableName$ == null)\n" +
						"$p.memberVariableName$ = new $p.newMapType$();\n" +
					"return $p.memberVariableName$;\n" +
				"}\n" +
				// contains
				"@Override\n" +
				"public boolean contains$p.camelCaseName$($p.keyType$ key) {\n" +
					"return $p.memberVariableName$ == null ? false : $p.memberVariableName$.containsKey(key);\n" +
				"}\n" +
				// get
				"@Override\n" +
				"public $p.builderValueType$ get$p.camelCaseName$($p.keyType$ key) {\n" +
					"return $p.memberVariableName$ == null ? null : ($p.builderMapValueType$)$p.memberVariableName$.get(key);\n" +
				"}\n" +
				// getCount
				"@Override\n" +
				"public int get$p.camelCaseName$Count() {\n" +
					"return $p.memberVariableName$ == null ? 0 : $p.memberVariableName$.size();\n" +
				"}\n" +
				// keys
				"@Override\n" +
				"public java.util.Set<$p.mapKeyType$> get$p.camelCaseName$Keys() {\n" +
					"return $p.memberVariableName$ == null ? null : $p.memberVariableName$.keySet();\n" +
				"}\n" +
				// add
				"public Builder add$p.camelCaseName$($p.keyType$ key, $p.builderValueType$ value) {\n" +
					"get$p.camelCaseName$Map().put(key, value);\n" +
					"return this;\n" +
				"}\n" +
				// clear
				"public Builder clear$p.camelCaseName$() {\n" +
					"$p.memberVariableName$ = null;\n" +
					"return this;\n" +
				"}\n";

//		// getOrCreate
//		if (valueType instanceof UserType) {
//			appendIndent(builder, indentCount).append("public ").append(valueType.getJavaType()).append(".Builder getOrCreate").append(property.getCamelCaseName()).append("(").append(keyType.getJavaType()).append(" key) {\n");
//			appendIndent(builder, indentCount + 1).append("java.util.Map<").append(keyType.getJavaType()).append(", ").append(valueType.getJavaType()).append(".Builder> map = get").append(property.getCamelCaseName()).append("Map();\n");
//			appendIndent(builder, indentCount + 1).append(valueType.getJavaType()).append(".Builder value = map.get(key);\n");
//			appendIndent(builder, indentCount + 1).append("if (value == null) {\n");
//			appendIndent(builder, indentCount + 2).append("value = ").append(type.getValueType().getJavaType()).append(".newBuilder();\n");
//			appendIndent(builder, indentCount + 2).append("map.put(key, value);\n");
//			appendIndent(builder, indentCount + 1).append("}\n");
//			appendIndent(builder, indentCount + 1).append("return value;\n");
//			appendIndent(builder, indentCount).append("}\n");
//		} else if (valueType instanceof SetType) {
//			Type itemType = ((SetType)valueType).getItemType();
//			if (itemType instanceof UserType) {
//				
//			} else {
//				appendIndent(builder, indentCount).append("public ").append(valueType.getJavaType()).append(" getOrCreate").append(property.getCamelCaseName()).append("(").append(keyType.getJavaType()).append(" key) {\n");
//				appendIndent(builder, indentCount + 1).append("java.util.Map<").append(keyType.getJavaType()).append(", ").append(valueType.getJavaType()).append("> map = get").append(property.getCamelCaseName()).append("Map();\n");
//				appendIndent(builder, indentCount + 1).append(valueType.getJavaType()).append(" value = map.get(key);\n");
//				appendIndent(builder, indentCount + 1).append("if (value == null) {\n");
//				appendIndent(builder, indentCount + 2).append("value = new java.util.HashSet<").append(itemType.getJavaType()).append(">();\n");
//				appendIndent(builder, indentCount + 2).append("map.put(key, value);\n");
//				appendIndent(builder, indentCount + 1).append("}\n");
//				appendIndent(builder, indentCount + 1).append("return value;\n");
//				appendIndent(builder, indentCount).append("}\n");
//			}
//		} else if (valueType instanceof ListType) {
//			
//		}
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderNewBuilder(Appendable builder, MapProperty property, int indentCount) throws IOException {
//		appendIndent(builder, indentCount).append("if (value.has").append(property.getCamelCaseName()).append("())\n");
//		appendIndent(builder, indentCount + 1).append("builder.set").append(property.getCamelCaseName()).append("(value.get").append(property.getCamelCaseName()).append("());\n");
	}
	
	@Override
	public void createBuilderBuild(Appendable builder, MapProperty property, int indentCount) throws IOException {
		Type keyType = property.getType().getKeyType();
		Type valueType = property.getType().getValueType();
		
		String s = "";
		if (valueType instanceof UserEnumType) {
			s =
				"if ($p.memberVariableName$ != null) {\n" +
					"java.util.Map<String, String> map = new java.util.HashMap<String, String>();\n" +
					"for (java.util.Map.Entry<$p.mapKeyType$, $p.mapValueType$> value : $p.memberVariableName$.entrySet())\n";
			if (keyType instanceof UserEnumType)
				s +=	"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.encodeKey(value.getKey().name()), value.getValue().name());\n";
			else
				s +=	"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.encodeKey(value.getKey()), value.getValue().name());\n";
			s +=
					"dbObject.put($p.keyName$, map);\n" +
				"}\n";
		} else if (valueType instanceof UserType) {
			s =
				"if ($p.memberVariableName$ != null) {\n" +
					"java.util.Map<String, com.mongodb.DBObject> map = new java.util.HashMap<String, com.mongodb.DBObject>();\n" +
					"for (java.util.Map.Entry<$p.builderKeyType$, $p.mapValueType$> value : $p.memberVariableName$.entrySet())\n";
			if (keyType instanceof UserEnumType)
				s +=	"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.encodeKey(value.getKey().name()), (($p.builderMapValueType$)value.getValue()).build());\n";
			else
				s +=	"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.encodeKey(value.getKey()), (($p.builderMapValueType$)value.getValue()).build());\n";
			s +=
					"dbObject.put($p.keyName$, map);\n" +
				"}\n";
		} else if (valueType instanceof SetType) {
//			Type itemType = ((SetType)valueType).getItemType();
//			appendIndent(builder, indentCount).append("if (").append(property.getMemberVariableName()).append(" != null) {\n");
//			if (itemType instanceof UserEnumType) {
//				
//			} else if (itemType instanceof UserType) {
//
//			} else {
//				appendIndent(builder, indentCount + 1).append("java.util.Map<String, java.util.List<").append(itemType.getJavaType()).append(">> map = new java.util.HashMap<String, java.util.List<").append(itemType.getJavaType()).append(">>();\n");
//				appendIndent(builder, indentCount + 1).append("for (java.util.Map.Entry<").append(keyType.getJavaType()).append(", ").append(valueType.getJavaType()).append("> value : ").append(property.getMemberVariableName()).append(".entrySet())\n");
//				appendIndent(builder, indentCount + 2).append("map.put(com.lowereast.guiceymongo.util.DBObjectUtil.encodeKey(value.getKey()), new java.util.ArrayList<").append(itemType.getJavaType()).append(">(value.getValue()));\n");
//				appendIndent(builder, indentCount + 1).append("dbObject.put(").append(property.getKeyName()).append(", map);\n");
//			}
//			appendIndent(builder, indentCount).append("}\n");
		} else if (valueType instanceof ListType) {
		} else {
			s =
				"if ($p.memberVariableName$ != null)\n" +
					"dbObject.put($p.keyName$, $p.memberVariableName$);\n";
		}
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createUpdaterMethod(Appendable builder, MapProperty property, int indentCount) throws IOException {
	}
	
	@Override
	public void createUpdaterBuildUpdate(Appendable builder, MapProperty property, int indentCount) throws IOException {
	}
}
