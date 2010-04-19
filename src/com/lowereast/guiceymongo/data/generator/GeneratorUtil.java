package com.lowereast.guiceymongo.data.generator;

public final class GeneratorUtil {
	private GeneratorUtil() {}
	
	public static String toUpperFirstLetter(String value) {
		if (value.length() == 1)
			return value.toUpperCase();
		return value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
	}
	
	public static String toCamelCase(String value) {
		String[] pieces = value.split("_");
		if (pieces.length == 1)
			return toUpperFirstLetter(value);
		
		StringBuilder builder = new StringBuilder();
		for (int x = 0; x < pieces.length; ++x)
			builder.append(toUpperFirstLetter(pieces[x]));
		return builder.toString();
	}
	
	public static String toLowerCamelCase(String value) {
		String[] pieces = value.split("_");
		if (pieces.length == 1)
			return value.toLowerCase();
		
		StringBuilder builder = new StringBuilder(pieces[0].toLowerCase());
		for (int x = 1; x < pieces.length; ++x)
			builder.append(toUpperFirstLetter(pieces[x]));
		return builder.toString();
	}
}
