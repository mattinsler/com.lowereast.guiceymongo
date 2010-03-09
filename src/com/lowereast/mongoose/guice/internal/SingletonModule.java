package com.lowereast.mongoose.guice.internal;

import com.google.inject.Module;

public abstract class SingletonModule<T> implements Module {
	protected T key;
	
	public SingletonModule(T key) {
		this.key = key;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof SingletonModule<?> && ((SingletonModule<?>)obj).key.equals(key);
	}
	
	@Override
	public int hashCode() {
		return key.hashCode();
	}
	
	@Override
	public String toString() {
		return getClass().getName() + "(key=" + key.toString() + ")";
	}
}
