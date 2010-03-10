package com.lowereast.guiceymongo.guice.internal;

import com.google.inject.internal.ImmutableMap;
import com.lowereast.guiceymongo.annotation.Annotations;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoDatabase;

public final class GuiceyMongoDatabases {
	private GuiceyMongoDatabases() {}
	
	public static GuiceyMongoDatabase database(String databaseKey) {
		return Annotations.proxy(GuiceyMongoDatabase.class, ImmutableMap.<String, Object>of("value", databaseKey));
	}
}
