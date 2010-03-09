package com.lowereast.mongoose.guice.internal;

import com.google.inject.internal.ImmutableMap;
import com.lowereast.mongoose.annotation.Annotations;
import com.lowereast.mongoose.guice.annotation.MongooseDatabase;

public final class MongooseDatabases {
	private MongooseDatabases() {}
	
	public static MongooseDatabase database(String databaseKey) {
		return Annotations.proxy(MongooseDatabase.class, ImmutableMap.<String, Object>of("value", databaseKey));
	}
}
