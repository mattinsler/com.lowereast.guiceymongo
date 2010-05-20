/**
 *      Copyright (C) 2010 Lowereast Software
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.lowereast.guiceymongo.guice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.lowereast.guiceymongo.guice.spi.BuilderImpls;
import com.lowereast.guiceymongo.guice.spi.Builders;
import com.lowereast.guiceymongo.guice.spi.JavascriptProxy;

public final class GuiceyMongo {
	private GuiceyMongo() {}

	public static Builders.Configuration configure(String configurationName) {
		return new BuilderImpls.Configuration(configurationName);
	}
	
	public static Builders.Connection configureConnection(String connectionName) {
		return new BuilderImpls.Connection(connectionName);
	}
	
//	public static Module configureFromFile(String filename) {
//		String extension = filename.substring(filename.lastIndexOf('.') + 1);
//		FileType type = FileType.byFileExtension(extension);
//		if (type == null)
//			throw new RuntimeException("Unknown file extension");
//		return configureFromFile(filename, type);
//	}
	
//	public static Module configureFromFile(String filename, FileType fileType) {
//		switch (fileType) {
//		case JSON:
//			return new JsonConfigurationFileModule(filename);
//		}
//		throw new RuntimeException("Unknown FileType");
//	}
	
	public static Module chooseConfiguration(final String configurationName) {
		return new Module() {
			public void configure(Binder binder) {
				GuiceyMongoUtil.setCurrentConfiguration(binder.skipSources(GuiceyMongo.class), configurationName);
			}
		};
	}
	
	@SuppressWarnings("unchecked")
	public static Module javascriptProxy(Class<?> proxyInterface, String databaseKey) {
		return new JavascriptProxy(proxyInterface, databaseKey);
	}
}
