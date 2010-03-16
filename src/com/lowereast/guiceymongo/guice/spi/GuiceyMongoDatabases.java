package com.lowereast.guiceymongo.guice.spi;

import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoDatabase;

public final class GuiceyMongoDatabases {
	private GuiceyMongoDatabases() {}
	
	public static GuiceyMongoDatabase database(String databaseKey) {
		return AnnotationUtil.guiceyMongoDatabase(databaseKey);
	}
}
