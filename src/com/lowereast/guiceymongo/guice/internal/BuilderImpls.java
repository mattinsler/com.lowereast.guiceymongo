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
import com.lowereast.guiceymongo.guice.internal.Builders.CollectionConfiguration;
import com.lowereast.guiceymongo.guice.internal.Builders.DatabaseConfiguration;
import com.lowereast.guiceymongo.guice.internal.Builders.DatabaseOptionConfiguration;
import com.lowereast.guiceymongo.guice.internal.Builders.FinishableConfiguration;
import com.lowereast.guiceymongo.guice.spi.GuiceyMongoBinder;
import com.lowereast.guiceymongo.guice.spi.GuiceyMongoBindingCollector;

public final class BuilderImpls {
	public static class Configuration implements Builders.Configuration, Builders.FinishableConfiguration {
		private final String _name;
		private final GuiceyMongoBindingCollector _collector = new GuiceyMongoBindingCollector();
		
		public Configuration(String name) {
			_name = name;
		}
		public Builders.CollectionConfiguration mapCollection(String collectionKey) {
			return new Collection(this, collectionKey);
		}
		public Builders.DatabaseConfiguration mapDatabase(String databaseKey) {
			return new Database(this, databaseKey);
		}
		
		public void configure(Binder binder) {
			new GuiceyMongoBinder(binder.skipSources(Configuration.class)).bind(_collector);
		}
		
		String getName() {
			return _name;
		}
		GuiceyMongoBindingCollector getCollector() {
			return _collector;
		}
	}
	
	private static class Database implements Builders.DatabaseConfiguration, Builders.DatabaseOptionConfiguration {
		private final Configuration _configuration;
		private final String _databaseKey;
		public Database(Configuration configuration, String databaseKey) {
			_configuration = configuration;
			_databaseKey = databaseKey;
		}
		public void configure(Binder binder) {
			_configuration.configure(binder);
		}
		public CollectionConfiguration mapCollection(String collectionKey) {
			return _configuration.mapCollection(collectionKey);
		}
		public DatabaseConfiguration mapDatabase(String databaseKey) {
			return _configuration.mapDatabase(databaseKey);
		}
		public FinishableConfiguration overConnection(String connectionKey) {
			_configuration.getCollector().bindConfiguredDatabaseConnection(_configuration.getName(), _databaseKey, connectionKey);
			return _configuration;
		}
		public DatabaseOptionConfiguration to(String database) {
			_configuration.getCollector().bindConfiguredDatabase(_configuration.getName(), _databaseKey, database);
			return this;
		}
	}
	
	private static class Collection implements Builders.CollectionConfiguration, Builders.CollectionOptionConfiguration {
		private final Configuration _configuration;
		private final String _collectionKey;
		private String _collection;
		public Collection(Configuration configuration, String collectionKey) {
			_configuration = configuration;
			_collectionKey = collectionKey;
		}
		public Builders.CollectionOptionConfiguration to(String collection) {
			_collection = collection;
			return this;
		}
		public Builders.FinishableConfiguration inDatabase(String databaseKey) {
			_configuration.getCollector().bindConfiguredCollection(_configuration.getName(), databaseKey, _collectionKey, _collection);
			return _configuration;
		}
	}
	
	public static class Connection implements Builders.Connection, Builders.ConnectionWithHost, Builders.ConnectionWithPort {
		private final String _name;
		private String _hostname;
		private int _port = -1;
		public Connection(String name) {
			_name = name;
		}
		public Builders.ConnectionWithHost host(String hostname) {
			_hostname = hostname;
			return this;
		}
		public Builders.ConnectionWithPort port(int port) {
			_port = port;
			return this;
		}
		public void configure(Binder binder) {
			GuiceyMongoBinder guiceyBinder = new GuiceyMongoBinder(binder.skipSources(Connection.class));
			if (_hostname != null)
				guiceyBinder.bindConnectionHostname(_name, _hostname);
			if (_port != -1)
				guiceyBinder.bindConnectionPort(_name, _port);
		}
	}
}
