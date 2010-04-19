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

package com.lowereast.guiceymongo.data.type;

import java.util.List;

import com.google.inject.internal.Lists;

public class Type {
	protected String _guiceyType;
	protected final String _simpleJavaType;
	protected String _canonicalJavaType;
	protected final List<String> _includes;
	
	protected Type(String guiceyType, String simpleJavaType) {
		this(guiceyType, simpleJavaType, simpleJavaType, Lists.<String>newArrayList());
	}
	
	protected Type(String guiceyType, String simpleJavaType, List<String> includes) {
		this(guiceyType, simpleJavaType, simpleJavaType, includes);
	}
	
	protected Type(String guiceyType, String simpleJavaType, String canonicalJavaType) {
		this(guiceyType, simpleJavaType, canonicalJavaType, Lists.<String>newArrayList());
	}
	
	protected Type(String guiceyType, String simpleJavaType, String canonicalJavaType, List<String> includes) {
		_guiceyType = guiceyType;
		_simpleJavaType = simpleJavaType;
		_canonicalJavaType = canonicalJavaType;
		_includes = includes;
	}
	
	public String getGuiceyType() {
		return _guiceyType;
	}
	
	public String getSimpleJavaType() {
		return _simpleJavaType;
	}
	
	public String getCanonicalJavaType() {
		return _canonicalJavaType;
	}
	
	public List<String> getReadableImports() {
		return _includes;
	}
	
	@Override
	public String toString() {
		return _simpleJavaType;
	}
}
