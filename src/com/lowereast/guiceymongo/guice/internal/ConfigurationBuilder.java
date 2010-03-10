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

package com.lowereast.guiceymongo.guice.internal;

import java.util.List;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.internal.Lists;

public class ConfigurationBuilder implements Module {
	private final String _name;
	private final List<Module> _moduleCollector = Lists.newArrayList();

	public ConfigurationBuilder(String name) {
		_name = name;
	}
	
	void addModule(Module module) {
		_moduleCollector.add(module);
	}

	public void configure(Binder binder) {
		for (Module module : _moduleCollector)
			binder.install(module);
	}

	public DatabaseMappingBuilder mapDatabase(String key) {
		return new DatabaseMappingBuilder(this, _name, key);
	}

	public CollectionMappingBuilder mapCollection(String key) {
		return new CollectionMappingBuilder(this, _name, key);
	}
}
