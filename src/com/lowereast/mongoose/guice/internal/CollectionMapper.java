package com.lowereast.mongoose.guice.internal;

import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.lowereast.mongoose.guice.Mongoose;
import com.lowereast.mongoose.guice.annotation.MongooseCollection;
import com.mongodb.DB;
import com.mongodb.DBCollection;

public class CollectionMapper extends SingletonModule<Key<DBCollection>> implements Provider<DBCollection> {
	private final String _collection;
	
	private Provider<DB> _databaseProvider;
	
	public CollectionMapper(String databaseKey, String collectionKey, String collection) {
		super(Key.get(DBCollection.class, MongooseCollections.collection(databaseKey, collectionKey)));
		_collection = collection;
	}
	
	public void configure(Binder binder) {
		binder.skipSources(CollectionMapper.class, Mongoose.class).bind(key).toProvider(this);
	}
	
	@Inject
	void initialize(Injector injector) {
		_databaseProvider = injector.getProvider(Key.get(DB.class, MongooseDatabases.database(((MongooseCollection)key.getAnnotation()).database())));
	}
	
	public DBCollection get() {
		try {
			return _databaseProvider.get().getCollection(_collection);
		} catch (Exception e) {
			return null;
		}
	}
}
