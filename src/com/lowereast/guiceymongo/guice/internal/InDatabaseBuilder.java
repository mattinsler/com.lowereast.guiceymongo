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

public class InDatabaseBuilder implements Module {
	private final String _collection;
	private final String _collectionKey;
	private final String _configurationName;
	private final ConfigurationBuilder _configurationBuilder;
	
	private String _databaseKey;

	public InDatabaseBuilder(ConfigurationBuilder configurationBuilder, String configurationName, String collectionKey, String collection) {
		_configurationName = configurationName;
		_collection = collection;
		_collectionKey = collectionKey;
		_configurationBuilder = configurationBuilder;
	}
	
	public void configure(Binder binder) {
		Binder skippedBinder = binder.skipSources(InDatabaseBuilder.class);
		skippedBinder.install(new CollectionProviderModule(_databaseKey, _collectionKey));
		skippedBinder.bindConstant().annotatedWith(ConfiguredCollections.collection(_configurationName, _collectionKey)).to(_collection);
	}
	
	public ConfigurationBuilder inDatabase(String databaseKey) {
		_databaseKey = databaseKey;
		_configurationBuilder.addModule(this);
		return _configurationBuilder;
	}
}
