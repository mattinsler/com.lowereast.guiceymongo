package com.lowereast.mongoose.guice;

import com.google.inject.Module;
import com.lowereast.mongoose.guice.internal.CollectionMapper;
import com.lowereast.mongoose.guice.internal.DatabaseMapper;
import com.lowereast.mongoose.guice.internal.JavascriptProxy;

public class Mongoose {
	private Mongoose() {}

	public static Module mapDatabase(String databaseKey, String database) {
		return new DatabaseMapper(databaseKey, database);
	}
	
	public static Module mapCollection(String databaseKey, String collectionKey, String collection) {
		return new CollectionMapper(databaseKey, collectionKey, collection);
	}
	
	@SuppressWarnings("unchecked")
	public static Module javascriptProxy(Class<?> proxyInterface, String databaseKey) {
		return new JavascriptProxy(proxyInterface, databaseKey);
	}
}
