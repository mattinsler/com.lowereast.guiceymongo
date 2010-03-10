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

public class CollectionMappingBuilder {
	private final String _collectionKey;
	private final String _configurationName;
	private final ConfigurationBuilder _configurationBuilder;

	public CollectionMappingBuilder(ConfigurationBuilder configurationBuilder, String configurationName, String collectionKey) {
		_configurationName = configurationName;
		_collectionKey = collectionKey;
		_configurationBuilder = configurationBuilder;
	}

	public InDatabaseBuilder to(String collection) {
		return new InDatabaseBuilder(_configurationBuilder, _configurationName, _collectionKey, collection);
	}
}
