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

package com.lowereast.guiceymongo.guice.internal;

import com.google.inject.Module;

public interface Builders {
	public interface Configuration {
		DatabaseConfiguration mapDatabase(String databaseKey);
		CollectionConfiguration mapCollection(String collectionKey);
	}
	public interface FinishableConfiguration extends Configuration, Module {
	}
	
	public interface DatabaseConfiguration {
		DatabaseOptionConfiguration to(String database);
	}
	public interface DatabaseOptionConfiguration extends Configuration, Module {
		FinishableConfiguration overConnection(String connectionKey);
	}
	
	public interface CollectionConfiguration {
		CollectionOptionConfiguration to(String collection);
	}
	public interface CollectionOptionConfiguration {
		FinishableConfiguration inDatabase(String databaseKey);
	}
	
	public interface Connection {
		ConnectionWithHost host(String hostname);
		ConnectionWithPort port(int port);
	}
	public interface ConnectionWithHost extends Module {
		Module port(int port);
	}
	public interface ConnectionWithPort extends Module {
		Module host(String hostname);
	}
}
