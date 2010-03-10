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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

import com.google.inject.Binder;
import com.google.inject.BindingAnnotation;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Module;
import com.google.inject.Provider;
import com.google.inject.internal.ImmutableMap;
import com.google.inject.internal.Maps;
import com.lowereast.guiceymongo.annotation.Annotations;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoCollection;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoDatabase;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;

public class ConfigurationBuilder {
	@BindingAnnotation
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
	public @interface ConfiguredDatabase {
		String configuration();
		String database();
	}
	
	private static ConfiguredDatabase configuredDatabase(String configuration, String databaseKey) {
		return Annotations.proxy(ConfiguredDatabase.class, ImmutableMap.<String, Object>of("configuration", configuration, "database", databaseKey));
	}

	@BindingAnnotation
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
	public @interface ConfiguredCollection {
		String configuration();
		String database();
		String collection();
	}
	
	private static ConfiguredCollection configuredCollection(String configuration, String databaseKey, String collectionKey) {
		return Annotations.proxy(ConfiguredCollection.class, ImmutableMap.<String, Object>of("configuration", configuration, "database", databaseKey, "collection", collectionKey));
	}

	@BindingAnnotation
	@Retention(RetentionPolicy.RUNTIME)
	@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
	public @interface Configuration {
	}
	
	private final String _name;
	public ConfigurationBuilder(String name) {
		_name = name;
	}
	
	public DatabaseMappingBuilder mapDatabase(String key) {
		return new DatabaseMappingBuilder(_name, key);
	}
	
	public static class DatabaseMappingBuilder {
		private final String _databaseKey;
		private final String _configurationName;
		public DatabaseMappingBuilder(String configurationName, String databaseKey) {
			_configurationName = configurationName;
			_databaseKey = databaseKey;
		}
		public DatabaseBuilder to(String database) {
			return new DatabaseBuilder(_configurationName, _databaseKey, database);
		}
	}
	
	private static class DBProviderModule extends SingletonModule<Key<DB>> implements Provider<DB> {
		private Injector _injector;
		private String _configuration;
		public DBProviderModule(String databaseKey) {
			super(Key.get(DB.class, GuiceyMongoDatabases.database(databaseKey)));
		}
		@Inject
		@SuppressWarnings("unused")
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
				String database = _injector.getInstance(Key.get(String.class, configuredDatabase(_configuration, databaseKey)));
				return new Mongo().getDB(database);
			} catch (Exception e) {
				return null;
			}
		}
	}
	
	private static class CollectionProviderModule extends SingletonModule<Key<DBCollection>> implements Provider<DBCollection> {
		private Injector _injector;
		private String _configuration;
		private Provider<DB> _databaseProvider;
		public CollectionProviderModule(String databaseKey, String collectionKey) {
			super(Key.get(DBCollection.class, GuiceyMongoCollections.collection(databaseKey, collectionKey)));
		}
		@Inject
		@SuppressWarnings("unused")
		void initialize(Injector injector, @Configuration String configuration) {
			_injector = injector;
			_configuration = configuration;
			_databaseProvider = injector.getProvider(Key.get(DB.class, GuiceyMongoDatabases.database(((GuiceyMongoCollection)key.getAnnotation()).database())));
		}
		public void configure(Binder binder) {
			binder.skipSources(CollectionProviderModule.class).bind(key).toProvider(this);
		}
		public DBCollection get() {
			try {
				String databaseKey = ((GuiceyMongoCollection)((Key<?>)key).getAnnotation()).database();
				String collectionKey = ((GuiceyMongoCollection)((Key<?>)key).getAnnotation()).collection();
				String collection = _injector.getInstance(Key.get(String.class, configuredCollection(_configuration, databaseKey, collectionKey)));
				return _databaseProvider.get().getCollection(collection);
			} catch (Exception e) {
				return null;
			}
		}
	}
	
	public static class DatabaseBuilder implements Module {
		private final String _database;
		private final String _databaseKey;
		private final String _configurationName;
		private final Map<String, String> _collections = Maps.newHashMap();
		public DatabaseBuilder(String configurationName, String databaseKey, String database) {
			_configurationName = configurationName;
			_databaseKey = databaseKey;
			_database = database;
		}
		public CollectionMappingBuilder mapCollection(String key) {
			return new CollectionMappingBuilder(this, key);
		}
		public void configure(Binder binder) {
			Binder skippedBinder = binder.skipSources(DatabaseBuilder.class);
			skippedBinder.install(new DBProviderModule(_databaseKey));
			skippedBinder.bindConstant().annotatedWith(configuredDatabase(_configurationName, _databaseKey)).to(_database);
			for (Map.Entry<String, String> entry : _collections.entrySet()) {
				skippedBinder.install(new CollectionProviderModule(_databaseKey, entry.getKey()));
				skippedBinder.bindConstant().annotatedWith(configuredCollection(_configurationName, _databaseKey, entry.getKey())).to(entry.getValue());
			}
		}
		void addCollectionMapping(String collectionKey, String collection) {
			_collections.put(collectionKey, collection);
		}
	}
	
	public static class CollectionMappingBuilder {
		private final String _collectionKey;
		private final DatabaseBuilder _databaseBuilder;
		public CollectionMappingBuilder(DatabaseBuilder databaseBuilder, String collectionKey) {
			_databaseBuilder = databaseBuilder;
			_collectionKey = collectionKey;
		}
		public DatabaseBuilder to(String collection) {
			_databaseBuilder.addCollectionMapping(_collectionKey, collection);
			return _databaseBuilder;
		}
	}
}
