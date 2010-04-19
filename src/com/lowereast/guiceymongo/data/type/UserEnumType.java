package com.lowereast.guiceymongo.data.type;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.google.inject.internal.Sets;

public class UserEnumType extends UserType {
	private final Set<String> _values = Sets.newHashSet();
	
	public UserEnumType(String guiceyType) {
		super(guiceyType);
	}
	
	public void addValue(String value) {
		_values.add(value);
	}
	
	public Set<String> getValues() {
		return _values;
	}
	
	public List<String> getUserTypeFileImports() {
		return Collections.EMPTY_LIST;
	}
}
