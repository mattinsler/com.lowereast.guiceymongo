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

import java.util.Map;
import java.util.Set;

import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.internal.Maps;
import com.google.inject.internal.Sets;
import com.lowereast.guiceymongo.guice.internal.Builders.CollectionConfiguration;
import com.lowereast.guiceymongo.guice.internal.Builders.DatabaseConfiguration;
import com.lowereast.guiceymongo.guice.internal.Builders.DatabaseOptionConfiguration;
import com.lowereast.guiceymongo.guice.internal.Builders.FinishableConfiguration;

public final class BuilderImpls {
	public static class Configuration implements Builders.Configuration, Builders.FinishableConfiguration {
		private final String _name;
		private final Set<Module> _modules = Sets.newHashSet();
		private final Map<Key<?>, Object> _instanceBindings = Maps.newHashMap();
		
		public Configuration(String name) {
			_name = name;
		}
		public Builders.CollectionConfiguration mapCollection(String collectionKey) {
			return new Collection(this, collectionKey);
		}
		public Builders.DatabaseConfiguration mapDatabase(String databaseKey) {
			return new Database(this, databaseKey);
		}
		
		@SuppressWarnings("unchecked")
		public void configure(Binder binder) {
			Binder skippedBinder = binder.skipSources(Configuration.class);
			
			for (Module module : _modules)
				skippedBinder.install(module);
			
			for (Map.Entry<Key<?>, Object> binding : _instanceBindings.entrySet())
				skippedBinder.bind((Key)binding.getKey()).toInstance(binding.getValue());
		}
		
		String getName() {
			return _name;
		}
		<T> void addInstanceBinding(Key<T> key, T value) {
			_instanceBindings.put(key, value);
		}
		void addModule(Module module) {
			_modules.add(module);
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
			_configuration.addInstanceBinding(Key.get(String.class, AnnotationUtil.configuredDatabaseConnection(_configuration.getName(), _databaseKey)), connectionKey);
			return _configuration;
		}
		public DatabaseOptionConfiguration to(String database) {
			_configuration.addModule(new DBProviderModule(_databaseKey));
			_configuration.addInstanceBinding(Key.get(String.class, AnnotationUtil.configuredDatabase(_configuration.getName(), _databaseKey)), database);
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
			_configuration.addModule(new CollectionProviderModule(databaseKey, _collectionKey));
			_configuration.addInstanceBinding(Key.get(String.class, AnnotationUtil.configuredCollection(_configuration.getName(), _collectionKey)), _collection);
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
			Binder skippedBinder = binder.skipSources(Connection.class);
			if (_hostname != null)
				skippedBinder.bind(Key.get(String.class, AnnotationUtil.configuredConnectionHostname(_name))).toInstance(_hostname);
			if (_port != -1)
				skippedBinder.bind(Key.get(int.class, AnnotationUtil.configuredConnectionPort(_name))).toInstance(_port);
		}
	}
}
