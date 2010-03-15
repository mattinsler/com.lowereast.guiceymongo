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

package com.lowereast.guiceymongo.guice.spi;

import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoDatabase;
import com.lowereast.guiceymongo.guice.internal.SingletonModule;
import com.mongodb.DB;
import com.mongodb.Mongo;

class DBProviderModule extends SingletonModule<Key<DB>> implements Provider<DB> {
	private Injector _injector;
	private String _configuration;

	public DBProviderModule(String databaseKey) {
		super(Key.get(DB.class, AnnotationUtil.guiceyMongoDatabase(databaseKey)));
	}
	
	private <T> T getInstance(Injector injector, Key<T> key) {
		if (!injector.getBindings().containsKey(key))
			return null;
		return injector.getInstance(key);
	}

	@Inject
	void initialize(Injector injector, @Configuration String configuration) {
		_injector = injector;
		_configuration = configuration;
	}

	public void configure(Binder binder) {
		binder.skipSources(DBProviderModule.class).bind(key).toProvider(this);
	}

	public DB get() {
		try {
			String databaseKey = ((GuiceyMongoDatabase)key.getAnnotation()).value();
			String database = _injector.getInstance(Key.get(String.class, AnnotationUtil.configuredDatabase(_configuration, databaseKey)));
			
			Mongo mongo;
			
			String connectionKey = getInstance(_injector, Key.get(String.class, AnnotationUtil.configuredDatabaseConnection(_configuration, databaseKey)));
			if (connectionKey != null) {
				String hostname = getInstance(_injector, Key.get(String.class, AnnotationUtil.configuredConnectionHostname(connectionKey)));
				Integer port = getInstance(_injector, Key.get(int.class, AnnotationUtil.configuredConnectionPort(connectionKey)));
				
				if (hostname == null)
					hostname = "localhost";
				if (port == null)
					mongo = new Mongo(hostname);
				else
					mongo = new Mongo(hostname, port.intValue());
			} else {
				mongo = new Mongo();
			}
			return mongo.getDB(database);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
