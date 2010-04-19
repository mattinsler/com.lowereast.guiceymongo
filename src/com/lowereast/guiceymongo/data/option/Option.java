package com.lowereast.guiceymongo.data.option;

import java.util.Map;

import com.google.inject.internal.Maps;

public class Option {
	private final String _name;
	private final Map<String, Object> _parameters = Maps.newHashMap();
	
	public Option(String name) {
		_name = name;
	}
	
	public String getName() {
		return _name;
	}
	
	public void addParameter(String name, Object value) {
		_parameters.put(name, value);
	}
	
	public Map<String, Object> getParameters() {
		return _parameters;
	}
}
