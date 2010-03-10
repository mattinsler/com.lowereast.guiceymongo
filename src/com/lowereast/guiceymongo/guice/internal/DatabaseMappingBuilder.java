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

import com.google.inject.Binder;
import com.google.inject.Module;

public class DatabaseMappingBuilder implements Module {
	private final String _databaseKey;
	private final String _configurationName;
	private final ConfigurationBuilder _configurationBuilder;
	
	private String _database;

	public DatabaseMappingBuilder(ConfigurationBuilder configurationBuilder, String configurationName, String databaseKey) {
		_configurationName = configurationName;
		_databaseKey = databaseKey;
		_configurationBuilder = configurationBuilder;
	}
	
	public void configure(Binder binder) {
		Binder skippedBinder = binder.skipSources(DatabaseMappingBuilder.class);
		skippedBinder.install(new DBProviderModule(_databaseKey));
		skippedBinder.bindConstant().annotatedWith(ConfiguredDatabases.database(_configurationName, _databaseKey)).to(_database);
	}

	public ConfigurationBuilder to(String database) {
		_database = database;
		_configurationBuilder.addModule(this);
		return _configurationBuilder;
	}
}
