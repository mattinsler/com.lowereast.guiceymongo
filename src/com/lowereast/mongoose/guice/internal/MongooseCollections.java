package com.lowereast.mongoose.guice.internal;

import com.google.inject.internal.ImmutableMap;
import com.lowereast.mongoose.annotation.Annotations;
import com.lowereast.mongoose.guice.annotation.MongooseCollection;

public final class MongooseCollections {
	private MongooseCollections() {}

	public static MongooseCollection collection(String databaseKey, String collectionKey) {
		return Annotations.proxy(MongooseCollection.class, ImmutableMap.<String, Object>of("database", databaseKey, "collection", collectionKey));
	}
}
