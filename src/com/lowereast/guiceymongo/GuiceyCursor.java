package com.lowereast.guiceymongo;

import java.util.Iterator;

import com.mongodb.DBCursor;

public class GuiceyCursor<Item extends IsData> implements Iterator<Item>, Iterable<Item> {
	private final DBCursor _cursor;
	private final DataWrapper<Item> _wrapper;

	public GuiceyCursor(DBCursor cursor, DataWrapper<Item> wrapper) {
		_cursor = cursor;
		_wrapper = wrapper;
	}

	public Iterator<Item> iterator() {
		return this;
	}

	public boolean hasNext() {
		return _cursor.hasNext();
	}

	@SuppressWarnings("unchecked")
	public Item next() {
		return (Item) _wrapper.wrap(_cursor.next());
	}

	public void remove() {
		throw new UnsupportedOperationException("can't remove from a cursor");
	}
}
