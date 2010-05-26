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

import java.util.Set;

import com.google.inject.internal.Sets;

public class UserEnumType extends UserType {	
	private final Set<String> _values = Sets.newHashSet();
	
	public UserEnumType(String guiceyType) {
		super(guiceyType);
	}
	
	public void addValue(String value) {
		_values.add(value);
	}
	
	public Set<String> getValues() {
		return _values;
	}
}
