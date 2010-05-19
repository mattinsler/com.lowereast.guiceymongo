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

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.lowereast.guiceymongo.guice.GuiceyMongo;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoCollection;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoDatabase;
import com.mongodb.DB;
import com.mongodb.DBCollection;

public class JsonConfigurationExample {
	@Inject
	JsonConfigurationExample(@GuiceyMongoDatabase(Databases.Main) DB mainDatabase, @GuiceyMongoDatabase(Databases.Search) DB searchDatabase, @GuiceyMongoCollection(Collections.Data) DBCollection dataCollection) {
		System.out.println(mainDatabase);
		System.out.println(searchDatabase);
		System.out.println(dataCollection.getDB() + ": " + dataCollection);
	}

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(
				GuiceyMongo.configureFromFile("exampleConfiguration.json"),
				GuiceyMongo.chooseConfiguration("Test")
		);
		injector.getInstance(JsonConfigurationExample.class);
	}
}
