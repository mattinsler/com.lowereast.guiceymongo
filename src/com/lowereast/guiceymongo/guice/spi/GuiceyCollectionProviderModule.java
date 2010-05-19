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

import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.util.Types;
import com.lowereast.guiceymongo.GuiceyCollection;
import com.lowereast.guiceymongo.data.DataWrapper;
import com.lowereast.guiceymongo.data.IsData;
import com.mongodb.DBCollection;

public class GuiceyCollectionProviderModule<T extends IsData> extends SingletonModule<Key> implements Provider<GuiceyCollection<T>> {
	private final String _collectionKey;
	private final Class<T> _dataClass;

	private Provider<DBCollection> _collectionProvider;

	public GuiceyCollectionProviderModule(String collectionKey, Class<T> dataClass) {
//		super(Key.get(GuiceyCollection.class, AnnotationUtil.guiceyMongoCollection(collectionKey)));
//		super(Key.get(Types.newParameterizedType(GuiceyCollection.class, dataClass), AnnotationUtil.guiceyMongoCollection(collectionKey));
		super(Key.get(Types.newParameterizedType(GuiceyCollection.class, dataClass), AnnotationUtil.guiceyMongoCollection(collectionKey)));
		_collectionKey = collectionKey;
		_dataClass = dataClass;
	}

	@Inject
	void initialize(Injector injector, @Configuration String configuration) {
		_collectionProvider = injector.getProvider(Key.get(DBCollection.class, AnnotationUtil.guiceyMongoCollection(_collectionKey)));
	}

	public void configure(Binder binder) {
		binder.skipSources(GuiceyCollectionProviderModule.class).bind(key).toProvider(this);
	}
	
	private void cacheDBCollection() throws Exception {
		DataWrapper<T> wrapper = (DataWrapper<T>)_dataClass.getDeclaredField("DataWrapper").get(null);
		_cachedGuiceyCollection = new GuiceyCollection<T>(_collectionProvider.get(), wrapper);
	}
	
	private GuiceyCollection<T> _cachedGuiceyCollection;
	
	public GuiceyCollection<T> get() {
		try {
			if (_cachedGuiceyCollection == null)
				cacheDBCollection();
			return _cachedGuiceyCollection;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
