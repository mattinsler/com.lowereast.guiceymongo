package com.lowereast.mongoose.guice.internal;

import com.google.inject.Binder;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.lowereast.mongoose.guice.Mongoose;
import com.mongodb.DB;
import com.mongodb.Mongo;

public class DatabaseMapper extends SingletonModule<Key<DB>> implements Provider<DB> {
	private final String _database;
	public DatabaseMapper(String databaseKey, String database) {
		super(Key.get(DB.class, MongooseDatabases.database(databaseKey)));
		_database = database;
	}
	public void configure(Binder binder) {
		binder.skipSources(DatabaseMapper.class, Mongoose.class).bind(key).toProvider(this);
	}
	public DB get() {
		try {
			return new Mongo().getDB(_database);
		} catch (Exception e) {
			return null;
		}
	}
}
