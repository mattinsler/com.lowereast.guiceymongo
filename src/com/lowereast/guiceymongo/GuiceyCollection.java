package com.lowereast.guiceymongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

public class GuiceyCollection<Item extends IsData> {
	private final DBCollection _collection;
	private final DataWrapper<Item> _wrapper;
	
	public GuiceyCollection(DBCollection collection, DataWrapper<Item> wrapper) {
		_collection = collection;
		_wrapper = wrapper;
	}
	
	@SuppressWarnings("unchecked")
	public Item findOne() {
		return (Item)_wrapper.wrap(_collection.findOne());
	}
	
	@SuppressWarnings("unchecked")
	public Item findOne(DBObject query) {
		return (Item)_wrapper.wrap(query);
	}
	
	public GuiceyCursor<Item> find() {
		DBCursor cursor = _collection.find();
		if (cursor == null)
			return null;
		return new GuiceyCursor<Item>(cursor, _wrapper);
	}
	
	public GuiceyCursor<Item> find(DBObject query) {
		DBCursor cursor = _collection.find(query);
		if (cursor == null)
			return null;
		return new GuiceyCursor<Item>(cursor, _wrapper);
	}
	
	public GuiceyCursor<Item> find(DBObject query, Iterable<String> fieldSet) {
		DBObject fieldFilter = new BasicDBObject();
		for (String field : fieldSet)
			fieldFilter.put(field, 1);
		DBCursor cursor = _collection.find(query, fieldFilter);
		if (cursor == null)
			return null;
		return new GuiceyCursor<Item>(cursor, _wrapper);
	}
	
	public void save(IsBuildable<Item> item) {
		_collection.save(item.build());
	}
}
