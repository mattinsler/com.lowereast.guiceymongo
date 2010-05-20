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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.internal.Lists;
import com.lowereast.guiceymongo.data.generator.type.BlobType;
import com.lowereast.guiceymongo.data.generator.type.PrimitiveType;
import com.lowereast.guiceymongo.data.generator.type.Type;
import com.lowereast.guiceymongo.data.generator.type.UserDataType;

public class TypeRegistry {
	public final Map<String, Type> _types = new HashMap<String, Type>();

	public TypeRegistry() {
		addType(PrimitiveType.BoolType);
		addType(PrimitiveType.DBObjectType);
		addType(PrimitiveType.DBTimestampType);
		addType(PrimitiveType.DateType);
		addType(PrimitiveType.DoubleType);
		addType(PrimitiveType.FloatType);
		addType(PrimitiveType.Int32Type);
		addType(PrimitiveType.Int64Type);
		addType(PrimitiveType.ObjectIdType);
		addType(PrimitiveType.StringType);
		addType(BlobType.BlobType);
	}
	
	public void addType(Type type) {
		_types.put(type.getGuiceyType(), type);
	}
	
	public <T extends Type> T getGuiceyType(String guiceyType) {
		return (T)_types.get(guiceyType);
	}
	
	public <T extends Type> T getScopedGuiceyType(UserDataType scopingType, String guiceyType) {
		T type = (T)_types.get(guiceyType);
		while (type == null && scopingType != null) {
			type = (T)_types.get(scopingType.getGuiceyType() + "." + guiceyType);
			if (type != null)
				break;
			scopingType = scopingType.getParentType();
		}
		return type;
	}
	
	public <T extends Type> List<T> getTypes(Class<T> typeClass) {
		List<T> list = Lists.newArrayList();
		
		for (Type type : _types.values()) {
			if (typeClass.isAssignableFrom(type.getClass()))
				list.add((T)type);
		}
		
		return list;
	}
}
