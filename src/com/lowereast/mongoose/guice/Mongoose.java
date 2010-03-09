package com.lowereast.mongoose.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.lowereast.mongoose.guice.internal.ConfigurationBuilder;
import com.lowereast.mongoose.guice.internal.JavascriptProxy;
import com.lowereast.mongoose.guice.internal.ConfigurationBuilder.Configuration;

public class Mongoose {
	private Mongoose() {}

	public static ConfigurationBuilder configure(String configurationName) {
		return new ConfigurationBuilder(configurationName);
	}
	
	public static Module chooseConfiguration(final String configurationName) {
		return new Module() {
			public void configure(Binder binder) {
				binder.bindConstant().annotatedWith(Configuration.class).to(configurationName);
			}
		};
	}
	
	@SuppressWarnings("unchecked")
	public static Module javascriptProxy(Class<?> proxyInterface, String databaseKey) {
		return new JavascriptProxy(proxyInterface, databaseKey);
	}
}
