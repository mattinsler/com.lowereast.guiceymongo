package com.lowereast.guiceymongo.data.type;

import java.util.List;
import java.util.Set;

import com.google.inject.internal.Lists;
import com.google.inject.internal.Sets;
import com.lowereast.guiceymongo.data.property.Property;

public class UserType extends Type {
	private final List<Property<?>> _properties = Lists.newArrayList();
	private final List<UserType> _childTypes = Lists.newArrayList();
	
	private UserType _parentType;
	
	public UserType(String guiceyType) {
		super(guiceyType, guiceyType);
	}

	public List<Property<?>> getProperties() {
		return _properties;
	}
	
	public void addProperty(Property<?> property) {
		_properties.add(property);
	}
	
	public List<UserType> getChildTypes() {
		return _childTypes;
	}
	
	public void addChildType(UserType childType) {
		if (_childTypes.indexOf(childType) == -1) {
			_childTypes.add(childType);
			childType.setParentType(this);
		}
	}
	
	public UserType getParentType() {
		return _parentType;
	}
	
	public void setParentType(UserType parentType) {
		if (_parentType != parentType) {
			_parentType = parentType;
			_parentType.addChildType(this);
			_canonicalJavaType = (_parentType == null ? "" : _parentType.getSimpleJavaType() + ".") + super.getSimpleJavaType();
			_guiceyType = (_parentType == null ? "" : _parentType.getGuiceyType() + ".") + super.getGuiceyType();
		}
	}
	
	public List<String> getUserTypeFileImports() {
		Set<String> imports = Sets.newHashSet();
		imports.add("com.mongodb.DBObject");
		imports.add("com.lowereast.guiceymongo.IsReadable");
		imports.add("com.lowereast.guiceymongo.IsBuildable");
		imports.add("com.lowereast.guiceymongo.data.GuiceyDBObject");

		for (Property<?> property : _properties) {
			imports.addAll(property.getReadableImports());
		}
		for (UserType child : _childTypes) {
			imports.addAll(child.getUserTypeFileImports());
		}
		return Lists.newArrayList(imports);
	}
}
