package com.lowereast.guiceymongo.data.generator.type;

public class UserType extends Type {
	private UserDataType _parentType;
	private String _comment;
	
	public UserType(String guiceyType) {
		super(guiceyType, guiceyType);
	}
	
	public UserDataType getParentType() {
		return _parentType;
	}
	
	public void setParentType(UserDataType parentType) {
		if (_parentType != parentType) {
			_parentType = parentType;
			_parentType.addChildType(this);
			_javaType = (_parentType == null ? "" : _parentType.getJavaType() + ".") + super.getJavaType();
			_guiceyType = (_parentType == null ? "" : _parentType.getGuiceyType() + ".") + super.getGuiceyType();
		}
	}

	public void setComment(String comment) {
		_comment = comment;
	}

	public String getComment() {
		return (_comment == null) ? "" : _comment;
	}
}
