package com.lowereast.guiceymongo;

import com.mongodb.DBObject;

public interface IsUpdatable {
	DBObject buildUpdate();
	void update();
}
