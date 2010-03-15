package com.lowereast.guiceymongo.guice;

import java.util.Set;

import com.google.inject.internal.ImmutableSet;

public enum FileType {
	JSON("js", "json");

	private final Set<String> _fileExtensions;
	
	FileType(String... fileExtensions) {
		_fileExtensions = ImmutableSet.of(fileExtensions);
	}
	
	Set<String> fileExtensions() {
		return _fileExtensions;
	}
	
	public static FileType byFileExtension(String fileExtension) {
		for (FileType type : FileType.values()) {
			if (type.fileExtensions().contains(fileExtension))
				return type;
		}
		return null;
	}
}
