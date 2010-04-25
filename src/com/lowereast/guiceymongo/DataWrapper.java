package com.lowereast.guiceymongo;

import com.mongodb.DBObject;

public interface DataWrapper<T extends IsData> {
	IsWrapped<T> wrap(DBObject backing);
}
