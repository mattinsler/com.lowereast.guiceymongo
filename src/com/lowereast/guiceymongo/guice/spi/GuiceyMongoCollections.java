package com.lowereast.guiceymongo.guice.spi;

import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoCollection;

public final class GuiceyMongoCollections {
	private GuiceyMongoCollections() {}
	
	public static GuiceyMongoCollection collection(String collectionKey) {
		return AnnotationUtil.guiceyMongoCollection(collectionKey);
	}
}
