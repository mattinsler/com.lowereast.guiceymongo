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

import com.lowereast.guiceymongo.data.generator.property.MapProperty;
import com.lowereast.guiceymongo.data.generator.type.*;
import org.antlr.stringtemplate.StringTemplate;

import java.io.IOException;

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
			s +=	"if (this.get$p.camelCaseName$(key) != other.get$p.camelCaseName$(key))\n" +
						"return false;\n";
		} else if (valueType instanceof ListType) {
			Type itemType = ((ListType)valueType).getItemType();
			
			s +=	"$p.mapValueType$ thisList = this.get$p.camelCaseName$(key);\n" +
					"$p.mapValueType$ otherList = other.get$p.camelCaseName$(key);\n" +
					"if (thisList.size() != otherList.size())\n" +
						"return false;\n" +
					"for (int index = 0; index < thisList.size(); ++index) {\n";
			if (itemType instanceof PrimitiveType) {
				if (PrimitiveType.BoolType.equals(itemType) ||
						PrimitiveType.DoubleType.equals(itemType) ||
						PrimitiveType.FloatType.equals(itemType) ||
						PrimitiveType.Int32Type.equals(itemType) ||
						PrimitiveType.Int64Type.equals(itemType))
					s +=
						"if (thisList.get(index) != otherList.get(index))\n" +
							"return false;\n";
				else
					s +=
						"if (!thisList.get(index).equals(otherList.get(index)))\n";
				s +=		"return false;\n" +
					"}\n";
			}
		} else if (valueType instanceof SetType) {
			s +=	"$p.mapValueType$ thisSet = this.get$p.camelCaseName$(key);\n" +
					"$p.mapValueType$ otherSet = other.get$p.camelCaseName$(key);\n" +
					"if (thisSet.size() != otherSet.size())\n" +
						"return false;\n" +
					"for ($p.type.valueType.itemType.javaType$ item : thisSet) {\n" +
						"if (!otherSet.contains(item))\n" +
							"return false;\n" +
					"}\n";
		} else
			s +=	"if (!this.get$p.camelCaseName$(key).equals(other.get$p.camelCaseName$(key)))\n" +
						"return false;";
		s +=	"}\n" +
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
                "public abstract $p.mapType$ get$p.camelCaseName$Map();\n" +
				"public abstract boolean contains$p.camelCaseName$($p.keyType$ key);\n" +
				"public abstract int get$p.camelCaseName$Count();\n" +
				"public abstract $p.mapValueType$ get$p.camelCaseName$($p.keyType$ key);\n" +
				"public abstract java.util.Set<$p.mapKeyType$> get$p.camelCaseName$Keys();\n"
		);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}

	@Override
	public void createWrapperMethod(Appendable builder, MapProperty property, int indentCount) throws IOException {
		Type keyType = property.getType().getKeyType();
		Type valueType = property.getType().getValueType();
		
		StringTemplate template = new StringTemplate();

		String s =
				// member variable
				"protected $p.mapType$ $p.memberVariableName$ = null;\n" +
				// getMap
				"public $p.mapType$ get$p.camelCaseName$Map() {\n" +
					"if ($p.memberVariableName$ == null) {\n" +
						"Object value = _backing.get($p.keyName$);\n" +
						"if (value != null && value instanceof com.mongodb.DBObject) {\n" +
							"$p.mapType$ map = new $p.newMapType$();\n" +
							"com.mongodb.DBObject obj = (com.mongodb.DBObject)value;\n" +
							"for (String key : obj.keySet()) {\n";

		if (keyType instanceof UserEnumType) {
			s += 				"try {\n";
			if (valueType instanceof UserEnumType)
				s +=				"map.put($p.mapKeyType$.valueOf(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key)), $p.mapValueType$.valueOf((String)obj.get(key)));\n";
			else if (valueType instanceof UserDataType)
				s +=				"map.put($p.mapKeyType$.valueOf(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key)), $p.mapValueType$.wrap((com.mongodb.DBObject)obj.get(key)));\n";
			else if (valueType instanceof ListType) {
				Type itemType = ((ListType)valueType).getItemType();
				template.setAttribute("i", itemType);
				if (itemType instanceof PrimitiveType) {
					s +=
										"Object l = obj.get(key);\n" +
										"if (l != null && l instanceof java.util.List<?>) {\n" +
											"$p.mapValueType$ list = new $p.newMapValueType$();\n" +
											"for ($i.javaType$ listValue : (java.util.List<$i.javaBoxedType$>)l)\n" +
												"list.add(listValue);\n" +
											"map.put($p.mapKeyType$.valueOf(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key)), list);\n" +
										"}";
				}
			} else if (valueType instanceof SetType) {
				Type itemType = ((SetType)valueType).getItemType();
				template.setAttribute("i", itemType);
				if (itemType instanceof PrimitiveType) {
					s +=
										"Object l = obj.get(key);\n" +
										"if (l != null && l instanceof java.util.List<?>) {\n" +
											"$p.mapValueType$ set = new $p.newMapValueType$();\n" +
											"for ($i.javaType$ listValue : (java.util.List<$i.javaBoxedType$>)l)\n" +
												"set.add(listValue);\n" +
											"map.put($p.mapKeyType$.valueOf(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key)), set);\n" +
										"}";
				}
			} else
				s +=				"map.put($p.mapKeyType$.valueOf(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key)), ($p.mapValueType$)obj.get(key));\n";
			s +=				"} catch (Exception e) {\n" +
								"}\n";
		} else if (PrimitiveType.StringType.equals(keyType)) {
			if (valueType instanceof UserEnumType) {
				s += 			"try {\n" +
									"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key), $p.mapValueType$.valueOf((String)obj.get(key)));\n" +
								"} catch (Exception e) {\n" +
								"}\n";
			} else if (valueType instanceof UserDataType)
				s += 			"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key), $p.mapValueType$.wrap((com.mongodb.DBObject)obj.get(key)));\n";
			else if (valueType instanceof ListType) {
				Type itemType = ((ListType)valueType).getItemType();
				template.setAttribute("i", itemType);
				if (itemType instanceof PrimitiveType) {
					s +=
								"Object l = obj.get(key);\n" +
								"if (l != null && l instanceof java.util.List<?>) {\n" +
									"$p.mapValueType$ list = new $p.newMapValueType$();\n" +
									"for ($i.javaType$ listValue : (java.util.List<$i.javaBoxedType$>)l)\n" +
										"list.add(listValue);\n" +
									"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key), list);\n" +
								"}\n";
				}
			} else if (valueType instanceof SetType) {
				Type itemType = ((SetType)valueType).getItemType();
				template.setAttribute("i", itemType);
				if (itemType instanceof PrimitiveType) {
					s +=
								"Object l = obj.get(key);\n" +
								"if (l != null && l instanceof java.util.List<?>) {\n" +
									"$p.mapValueType$ set = new $p.newMapValueType$();\n" +
									"for ($i.javaType$ listValue : (java.util.List<$i.javaBoxedType$>)l)\n" +
										"set.add(listValue);\n" +
									"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.decodeKey(key), set);\n" +
								"}\n";
				}
			} else
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
				// contains
				"@Override\n" +
				"public boolean contains$p.camelCaseName$($p.keyType$ key) {\n" +
					"$p.mapType$ map = get$p.camelCaseName$Map();\n" +
					"return map == null ? false : map.containsKey(key);\n" +
				"}\n" +
				// getCount
				"@Override\n" +
				"public int get$p.camelCaseName$Count() {\n" +
					"$p.mapType$ map = get$p.camelCaseName$Map();\n" +
					"return map == null ? 0 : map.size();\n" +
				"}\n" +
				// get
				"@Override\n" +
				"public $p.mapValueType$ get$p.camelCaseName$($p.keyType$ key) {\n" +
					"$p.mapType$ map = get$p.camelCaseName$Map();\n" +
					"return map == null ? null : map.get(key);\n" +
				"}\n" +
				// getKeys
				"@Override\n" +
				"public java.util.Set<$p.mapKeyType$> get$p.camelCaseName$Keys() {\n" +
					"$p.mapType$ map = get$p.camelCaseName$Map();\n" +
					"return map == null ? null : map.keySet();\n" +
				"}\n";

		template.setTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderMethod(Appendable builder, MapProperty property, int indentCount) throws IOException {
		Type valueType = property.getType().getValueType();
		
		String s =
				// member variable
				"protected $p.mapType$ $p.memberVariableName$ = null;\n" +
				// getMap
				"public $p.mapType$ get$p.camelCaseName$Map() {\n" +
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
				"public $p.builderMapValueType$ get$p.camelCaseName$($p.keyType$ key) {\n" +
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
				// put
				"public Builder put$p.camelCaseName$($p.keyType$ key, $p.builderValueType$ value) {\n" +
					"get$p.camelCaseName$Map().put(key, value);\n" +
					"return this;\n" +
				"}\n" +
				// clear
				"public Builder clear$p.camelCaseName$() {\n" +
					"$p.memberVariableName$ = null;\n" +
					"return this;\n" +
				"}\n";

		// getOrCreate
		if (valueType instanceof UserDataType) {
			s +=
				"public $p.builderValueType$ getOrCreate$p.camelCaseName$($p.builderKeyType$ key) {\n" +
					"$p.mapType$ map = get$p.camelCaseName$Map();\n" +
					"$p.builderValueType$ value = ($p.builderValueType$)map.get(key);\n" +
					"if (value == null) {\n" +
						"value = $p.newMapValueType$();\n" +
						"map.put(key, value);\n" +
					"}\n" +
					"return value;\n" +
				"}\n";
		} else if (valueType instanceof SetType) {
			Type itemType = ((SetType)valueType).getItemType();
			
//			public java.util.Set<String> getOrCreateTag(String key) {
//	        	java.util.Map<String, java.util.Set<String>> map = getTagMap();
//	        	java.util.Set<String> value = map.get(key);
//	        	if (value == null) {
//	        		value = new java.util.HashSet<String>();
//	        		map.put(key, value);
//	        	}
//	        	return value;
//	        }
//			
			if (itemType instanceof PrimitiveType) {
				s +=
				"public $p.builderValueType$ getOrCreate$p.camelCaseName$($p.builderKeyType$ key) {\n" +
					"$p.mapType$ map = get$p.camelCaseName$Map();\n" +
					"$p.builderValueType$ value = ($p.builderValueType$)map.get(key);\n" +
					"if (value == null) {\n" +
						"value = new $p.newMapValueType$();\n" +
						"map.put(key, value);\n" +
					"}\n" +
					"return value;\n" +
				"}\n";
			}
		}
//		} else if (valueType instanceof ListType) {
//			
//		}
		
		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderNewBuilder(Appendable builder, MapProperty property, int indentCount) throws IOException {
//		builder.putView(key, MailMessageEntity.View.newBuilder(value.getView(key)));
		Type valueType = property.getType().getValueType();
		
		String s =
			"if (value.get$p.camelCaseName$Count() > 0) {\n" +
				"for ($p.keyType$ key : value.get$p.camelCaseName$Keys())\n";
		
		if (valueType instanceof UserDataType)
			s +=	"builder.put$p.camelCaseName$(key, $p.valueType$.newBuilder(value.get$p.camelCaseName$(key)));\n";
		else if (valueType instanceof SetType) {
			s +=	"builder.getOrCreate$p.camelCaseName$(key).addAll(value.get$p.camelCaseName$(key));\n";
		} else
			s +=	"builder.put$p.camelCaseName$(key, value.get$p.camelCaseName$(key));\n";
		s +=
			"}\n";

		StringTemplate template = new StringTemplate(s);
		template.setAttribute("p", property);
		builder.append(template.toString());
	}
	
	@Override
	public void createBuilderBuild(Appendable builder, MapProperty property, int indentCount) throws IOException {
		Type keyType = property.getType().getKeyType();
		Type valueType = property.getType().getValueType();
		StringTemplate template = new StringTemplate();
		
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
		} else if (valueType instanceof UserDataType) {
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
			Type itemType = ((SetType)valueType).getItemType();
			template.setAttribute("i", itemType);
			
			if (itemType instanceof PrimitiveType) {
				s =
				"if ($p.memberVariableName$ != null) {\n" +
					"java.util.Map<String, java.util.List<$i.javaBoxedType$>> map = new java.util.HashMap<String, java.util.List<$i.javaBoxedType$>>();\n" +
					"for (java.util.Map.Entry<$p.builderKeyType$, $p.mapValueType$> value : $p.memberVariableName$.entrySet()) {\n" +
						"java.util.List<$i.javaBoxedType$> list = new java.util.ArrayList<$i.javaBoxedType$>();\n" +
						"for ($i.javaType$ listValue : value.getValue())\n" +
							"list.add(listValue);\n";
				if (keyType instanceof UserEnumType)
					s +=
						"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.encodeKey(value.getKey().name()), list);\n";
				else
					s +=
						"map.put(com.lowereast.guiceymongo.util.DBObjectUtil.encodeKey(value.getKey()), list);\n";
				s +=
					"}\n" +
					"dbObject.put($p.keyName$, map);\n" +
				"}\n";
			}
		} else if (valueType instanceof ListType) {
		} else {
			s =
				"if ($p.memberVariableName$ != null)\n" +
					"dbObject.put($p.keyName$, $p.memberVariableName$);\n";
		}

		template.setTemplate(s);
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
