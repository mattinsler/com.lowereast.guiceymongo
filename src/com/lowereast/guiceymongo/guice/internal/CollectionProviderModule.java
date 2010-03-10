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
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoCollection;
import com.mongodb.DB;
import com.mongodb.DBCollection;

class CollectionProviderModule extends SingletonModule<Key<DBCollection>> implements Provider<DBCollection> {
	private final String _databaseKey;
	
	private Injector _injector;
	private String _configuration;
	private Provider<DB> _databaseProvider;

	public CollectionProviderModule(String databaseKey, String collectionKey) {
		super(Key.get(DBCollection.class, GuiceyMongoCollections.collection(collectionKey)));
		_databaseKey = databaseKey;
	}

	@Inject
	void initialize(Injector injector, @Configuration String configuration) {
		_injector = injector;
		_configuration = configuration;
		_databaseProvider = injector.getProvider(Key.get(DB.class, GuiceyMongoDatabases.database(_databaseKey)));
	}

	public void configure(Binder binder) {
		binder.skipSources(CollectionProviderModule.class).bind(key).toProvider(this);
	}

	public DBCollection get() {
		try {
			String collectionKey = ((GuiceyMongoCollection) ((Key<?>) key).getAnnotation()).value();
			String collection = _injector.getInstance(Key.get(String.class, ConfiguredCollections.collection(_configuration, collectionKey)));
			return _databaseProvider.get().getCollection(collection);
		} catch (Exception e) {
			return null;
		}
	}
}
