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

package com.lowereast.guiceymongo.wrapper.generator;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.eclipse.jetty.util.ajax.JSON;

public final class GuiceyDBObjectGenerator {
	private GuiceyDBObjectGenerator() {}
	
	private static void parseDirectory(File directory, TypeRegistry registry) {
		for (File file : directory.listFiles())
			parseFile(file, registry);
	}
	
	private static void parseFile(File file, TypeRegistry registry) {
		if (!file.exists())
			System.err.println("File " + file.getPath() + " does not exist.");
		if (!file.canRead())
			System.err.println("File " + file.getPath() + " cannot be read.");
		if (file.isDirectory()) {
			parseDirectory(file, registry);
		} else {
			try {
				Object json = JSON.parse(new FileReader(file));
				TypeParser.parseJSON(json, registry);
			} catch (Exception e) {
				System.err.println("File " + file.getPath() + " has errors:");
				System.err.print(e);
			}
		}
	}
	
	public static void generate(String sourceDirectory, String outputPackage, String... fileOrDirectoryNames) {
		TypeRegistry registry = new TypeRegistry();
		for (String fileOrDirectory : fileOrDirectoryNames)
			parseFile(new File(fileOrDirectory), registry);
		
		File sourceDirFile = new File(sourceDirectory);
		File outputDirFile = new File(sourceDirFile, outputPackage.replace('.', '/'));
		
		outputDirFile.mkdirs();

		for (Type type : registry.types.values()) {
			try {
				FileWriter writer = new FileWriter(new File(outputDirFile, TypeGenerator.toCamelCase(type.name) + ".java"));
				writer.append("package ").append(outputPackage).append(";\n");
				writer.append(TypeGenerator.generate(type, registry));
				writer.close();
			} catch (Exception e) {
				System.err.println("Error in writing type " + type.name);
				System.err.println(e);
			}
		}
	}
}
