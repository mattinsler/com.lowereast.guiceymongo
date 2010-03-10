package com.lowereast.guiceymongo.guice.internal;

import com.google.inject.internal.ImmutableMap;
import com.lowereast.guiceymongo.annotation.Annotations;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoCollection;

public final class GuiceyMongoCollections {
	private GuiceyMongoCollections() {}

	public static GuiceyMongoCollection collection(String databaseKey, String collectionKey) {
		return Annotations.proxy(GuiceyMongoCollection.class, ImmutableMap.<String, Object>of("database", databaseKey, "collection", collectionKey));
	}
}
