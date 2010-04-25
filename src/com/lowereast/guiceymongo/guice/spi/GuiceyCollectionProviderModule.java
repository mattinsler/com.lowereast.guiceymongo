package com.lowereast.guiceymongo.guice.spi;

import com.google.inject.Binder;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.util.Types;
import com.lowereast.guiceymongo.DataWrapper;
import com.lowereast.guiceymongo.GuiceyCollection;
import com.lowereast.guiceymongo.IsData;
import com.lowereast.guiceymongo.guice.internal.SingletonModule;
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
