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

package com.lowereast.guiceymongo.data.generator.property;

import java.util.Map;

import com.lowereast.guiceymongo.data.generator.option.Option;
import com.lowereast.guiceymongo.data.generator.type.PrimitiveType;
import com.lowereast.guiceymongo.data.generator.type.UserDataType;

public class PrimitiveProperty extends Property<PrimitiveType> {
	public PrimitiveProperty(UserDataType enclosingType, String name, PrimitiveType type, String comment, boolean useCamelCaseKeys) {
		super(enclosingType, name, type, comment, useCamelCaseKeys);
	}
	
	@Override
	public String getKeyValue() {
		if (super.hasOption("identity")) {
			Option option = super.getOption("identity");
			if (option.getParameters().isEmpty())
				return "_id";
			String value = null;
			for (Map.Entry<String, Object> e : option.getParameters().entrySet()) {
				if ("value".equals(e.getKey()))
					value = e.getValue().toString();
			}
			if (value == null)
				throw new RuntimeException("Problems with the identity option... Can only be [identity] or [identity('key')] or [identity(value='key')]");
			return value;
		}
		return super.getKeyValue();
	}
	
	public String getPrimitiveType() {
		return super.getType().getJavaType();
	}
	
	public String getPrimitiveBoxedType() {
		return super.getType().getJavaBoxedType();
	}
}
