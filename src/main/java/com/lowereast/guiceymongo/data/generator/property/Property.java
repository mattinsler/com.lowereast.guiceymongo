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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.google.inject.internal.Maps;
import com.lowereast.guiceymongo.data.generator.GeneratorUtil;
import com.lowereast.guiceymongo.data.generator.option.Option;
import com.lowereast.guiceymongo.data.generator.type.Type;
import com.lowereast.guiceymongo.data.generator.type.UserDataType;

public class Property<T extends Type> {
	private final UserDataType _enclosingType;
	
	private final String _name;
	private final String _keyName;
	private final String _camelCaseName;
	private final String _memberVariableName;
	
	private final String _keyValue;
	
	private final String _comment;
	private final T _type;
	private final Map<String, Option> _options = Maps.newHashMap();
	
	public Property(UserDataType enclosingType, String name, T type, String comment, boolean useCamelCaseKeys) {
		_enclosingType = enclosingType;
		_name = name;
		_camelCaseName = GeneratorUtil.toCamelCase(name);
		_memberVariableName = "_" + GeneratorUtil.toLowerCamelCase(name);
		_keyName = _camelCaseName + "Key";
		_keyValue = useCamelCaseKeys ? GeneratorUtil.toLowerCamelCase(name) : name;
		_type = type;
		_comment = comment;
	}
	
	public UserDataType getEnclosingType() {
		return _enclosingType;
	}
	
	public String getName() {
		return _name;
	}
	
	public String getKeyName() {
		return _keyName;
	}
	
	public String getCamelCaseName() {
		return _camelCaseName;
	}
	
	public String getMemberVariableName() {
		return _memberVariableName;
	}
	
	public String getKeyValue() {
		return _keyValue;
	}
	
	public T getType() {
		return _type;
	}
	
	public String getComment() {
		return (_comment == null) ? "" : _comment;
	}
	
	public void addOption(Option option) {
		_options.put(option.getName(), option);
	}
	
	public Option getOption(String name) {
		return _options.get(name);
	}
	
	public boolean hasOption(String name) {
		return _options.containsKey(name);
	}
	
	public List<Option> getOptions() {
		return Collections.unmodifiableList(new ArrayList<Option>(_options.values()));
	}

	@Override
	public String toString() {
		return getName() + ": " + getType();
	}
}
