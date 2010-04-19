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

package com.lowereast.guiceymongo.data;

import java.util.List;
import java.util.Set;

import com.mongodb.DBObject;

public abstract class GuiceyDBObject {
	private final DBObject _backing;
	
	protected GuiceyDBObject(DBObject backing) {
		_backing = backing;
	}
	
	public Set<String> keySet() {
		return _backing.keySet();
	}
	
	public boolean hasField(String fieldKey) {
		return _backing.containsField(fieldKey);
	}
	
	public Object getField(String fieldKey) {
		return _getField(fieldKey);
	}
	
	@SuppressWarnings("unchecked")
	protected <T> T _getField(String fieldKey) {
		return (T)_backing.get(fieldKey);
	}
	
	protected <E extends Enum<E>> E _getEnumField(String fieldKey) {
		return null;
	}
	
	@SuppressWarnings("unchecked")
	protected <T> List<T> getList(String fieldKey) {
		Object o = getField(fieldKey);
		if (o != null && o instanceof List<?>)
			return (List<T>)o;
		return null;
	}

	protected void setField(String fieldKey, Object value) {
		if (value instanceof GuiceyDBObject)
			_backing.put(fieldKey, ((GuiceyDBObject)value)._backing);
		else if (value instanceof Enum<?>)
			_backing.put(fieldKey, ((Enum<?>)value).name());
		else
			_backing.put(fieldKey, value);
	}
	
	protected void clearField(String fieldKey) {
		_backing.removeField(fieldKey);
	}
	
	public DBObject getBacking() {
		return _backing;
	}
	
	@Override
	public String toString() {
		return _backing.toString();
	}
}
