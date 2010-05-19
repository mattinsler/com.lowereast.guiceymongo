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

package com.lowereast.guiceymongo.guice.spi;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.mongodb.DBObject;
import com.mongodb.util.JSON;

public class JsonConfigurationFileModule implements Module {
	private final String _filename;
	
	public JsonConfigurationFileModule(String filename) {
		_filename = filename;
	}
	
	private DBObject parseFile(String filename) {
		File file = new File(_filename);
		if (!file.exists())
			throw new RuntimeException();
		if (!file.isFile())
			throw new RuntimeException();
		if (!file.canRead())
			throw new RuntimeException();
		
		try {
			StringBuilder builder = new StringBuilder();
			InputStreamReader reader = new InputStreamReader(new FileInputStream(file), "UTF-8");
			
			final int length = 10 * 1024;
			char[] buffer = new char[length];
			int read;
			while ((read = reader.read(buffer, 0, length)) != -1)
				builder.append(buffer, 0, read);
			
			reader.close();
			return (DBObject)JSON.parse(builder.toString());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private void bindConnection(GuiceyMongoBinder binder, String connectionKey, DBObject connection) {
		for (String key : connection.keySet()) {
			if ("hostname".equals(key)) {
				binder.bindConnectionHostname(connectionKey, (String)connection.get(key));
			} else if ("port".equals(key)) {
				binder.bindConnectionPort(connectionKey, (Integer)connection.get(key));
			} else {
				binder.addError("Unknown key [" + key + "] in the " + connectionKey + " connection element");
			}
		}
	}
	
	private void bindConnections(GuiceyMongoBinder binder, DBObject connections) {
		for (String key : connections.keySet()) {
			bindConnection(binder, key, (DBObject)connections.get(key));
		}
	}
	
	private void bindConfigurationCollections(GuiceyMongoBinder binder, String configurationName, String databaseKey, DBObject collections) {
		for (String key : collections.keySet()) {
			binder.bindConfiguredCollection(configurationName, databaseKey, key, (String)collections.get(key));
		}
	}
	
	private void bindConfigurationDatabase(GuiceyMongoBinder binder, String configurationName, String databaseKey, DBObject database) {
		for (String key : database.keySet()) {
			if ("connection".equals(key)) {
				binder.bindConfiguredDatabaseConnection(configurationName, databaseKey, (String)database.get(key));
			} else if ("collections".equals(key)) {
				bindConfigurationCollections(binder, configurationName, databaseKey, (DBObject)database.get(key));
			} else if ("database".equals(key)) {
				binder.bindConfiguredDatabase(configurationName, databaseKey, (String)database.get(key));
			}
		}
	}
	
	private void bindConfigurationDatabases(GuiceyMongoBinder binder, String configurationName, DBObject databases) {
		for (String key : databases.keySet()) {
			bindConfigurationDatabase(binder, configurationName, key, (DBObject)databases.get(key));
		}
	}
	
	private void bindConfiguration(GuiceyMongoBinder binder, String configurationName, DBObject configuration) {
		for (String key : configuration.keySet()) {
			if ("databases".equals(key)) {
				bindConfigurationDatabases(binder, configurationName, (DBObject)configuration.get(key));
			} else if ("connections".equals(key)) {
				binder.addError("connections key not yet supported");
			}
		}
	}
	
	private void bindConfigurations(GuiceyMongoBinder binder, DBObject configurations) {
		for (String key : configurations.keySet()) {
			bindConfiguration(binder, key, (DBObject)configurations.get(key));
		}
	}
	
	public void configure(Binder binder) {
		DBObject json = parseFile(_filename);
		GuiceyMongoBinder guiceyBinder = new GuiceyMongoBinder(binder);
		
		for (String key : json.keySet()) {
			if ("connections".equals(key)) {
				bindConnections(guiceyBinder, (DBObject)json.get(key));
			} else if ("configurations".equals(key)) {
				bindConfigurations(guiceyBinder, (DBObject)json.get(key));
			} else {
				binder.addError("Unknown key [" + key + "] at the root level of configuration file");
			}
		}
	}
}
