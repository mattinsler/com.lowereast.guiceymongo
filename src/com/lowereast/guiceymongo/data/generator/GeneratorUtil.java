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

package com.lowereast.guiceymongo.data.generator;

import java.util.Map;

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

	private static String replaceAll(String source, String key, String value) {
		StringBuilder builder = new StringBuilder();
		int start;
		while ((start = source.indexOf(key)) != -1) {
			builder.append(source.substring(0, start));
			builder.append(value);
			builder.append(source.substring(start + key.length()));
		}
		return builder.toString();
	}
	
	public static String formatTemplate(String format, Map<String, String> values) {
		return formatTemplate(format, values, 0);
	}
	
	public static String formatTemplate(String format, Map<String, String> values, int indentCount) {
		String result = format;
		for (Map.Entry<String, String> entry : values.entrySet())
			result = replaceAll(result, "${" + entry.getKey() + "}", entry.getValue());
		if (indentCount > 0) {
			String tab = "\n";
			for (int x = 0; x < indentCount; ++x)
				tab += "\t";
			result = replaceAll(result, "\n", tab);
		}
		return result;
	}
}
