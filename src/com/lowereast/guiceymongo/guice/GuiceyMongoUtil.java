package com.lowereast.guiceymongo.guice;

import com.google.inject.Binder;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.lowereast.guiceymongo.guice.spi.Configuration;

public final class GuiceyMongoUtil {
	private GuiceyMongoUtil() {}
	
	public static String getCurrentConfiguration(Injector injector) {
		return injector.getInstance(Key.get(String.class, Configuration.class));
	}
	
	public static void setCurrentConfiguration(Binder binder, String configuration) {
		binder.bindConstant().annotatedWith(Configuration.class).to(configuration);
	}
}
