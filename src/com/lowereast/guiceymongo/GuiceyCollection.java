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

package com.lowereast.guiceymongo;

import com.lowereast.guiceymongo.data.DataWrapper;
import com.lowereast.guiceymongo.data.FieldSet;
import com.lowereast.guiceymongo.data.IsBuildable;
import com.lowereast.guiceymongo.data.IsData;
import com.mongodb.DB;
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
	
	public DBCollection getDBCollection() {
		return _collection;
	}
	
	public DB getDB() {
		return _collection.getDB();
	}
	
//	@SuppressWarnings("unchecked")
//	public Item findOne() {
//		return (Item)_wrapper.wrap(_collection.findOne());
//	}
	
	@SuppressWarnings("unchecked")
	public Item findOne(DBObject query) {
		return (Item)_wrapper.wrap(_collection.findOne(query));
	}
	
//	public Item findOne(GuiceyQuery.Builder<Item> query) {
//		return null;
//	}
	
	public GuiceyQuery.ExecutableBuilder<Item> findOne() {
		return GuiceyQuery.newExecutableBuilder();
	}
	
//	public GuiceyCursor<Item> find() {
//		DBCursor cursor = _collection.find();
//		if (cursor == null)
//			return null;
//		return new GuiceyCursor<Item>(cursor, _wrapper);
//	}
	
	public GuiceyQuery.ExecutableCursorBuilder<Item> find() {
		return GuiceyQuery.newExecutableCursorBuilder();
	}
	
	public GuiceyQuery.ExecutableCursorBuilder<Item> select(FieldSet fieldSet) {
		return GuiceyQuery.newExecutableCursorBuilder(fieldSet);
	}
	
	public GuiceyCursor<Item> find(DBObject query) {
		DBCursor cursor = _collection.find(query);
		if (cursor == null)
			return null;
		return new GuiceyCursor<Item>(cursor, _wrapper);
	}
	
	public GuiceyCursor<Item> find(DBObject query, FieldSet fieldSet) {
		DBCursor cursor = _collection.find(query, fieldSet.build());
		if (cursor == null)
			return null;
		return new GuiceyCursor<Item>(cursor, _wrapper);
	}
	
	public void save(IsBuildable<Item> item) {
		_collection.save(item.build());
	}
}
