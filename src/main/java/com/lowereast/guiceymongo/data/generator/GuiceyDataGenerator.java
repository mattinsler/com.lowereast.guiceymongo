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

import java.io.File;
import java.io.FileWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;

import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.lowereast.guiceymongo.data.generator.parser.GuiceyDataLexer;
import com.lowereast.guiceymongo.data.generator.parser.GuiceyDataParser;
import com.lowereast.guiceymongo.data.generator.parser.TypeParser;
import com.lowereast.guiceymongo.data.generator.type.UserType;

import de.hunsicker.jalopy.Jalopy;

public class GuiceyDataGenerator {
	private void parseDirectory(File directory, TypeParser parser) {
		for (File file : directory.listFiles()) {
			if (file.isFile()) {
				for (String extension : _fileExtensions) {
					if (file.getName().endsWith(extension)) {
						parseFile(file, parser);
					}
				}
			} else {
				parseDirectory(file, parser);
			}
		}
	}
	
	private void parseFile(File file, TypeParser typeParser) {
		if (!file.exists()) {
			System.err.println("File " + file.getPath() + " does not exist.");
			return;
		}
		if (!file.canRead()) {
			System.err.println("File " + file.getPath() + " cannot be read.");
			return;
		}
		
		try {
			GuiceyDataLexer lexer = new GuiceyDataLexer(new ANTLRFileStream(file.getAbsolutePath()));
		    CommonTokenStream tokens = new CommonTokenStream(lexer);

		    GuiceyDataParser parser = new GuiceyDataParser(tokens);
		    GuiceyDataParser.start_return ret = parser.start();
		    CommonTree tree = (CommonTree)ret.getTree();
		    
		    typeParser.parse(tree);
		} catch (Exception e) {
			System.err.println("File " + file.getPath() + " has errors:");
			System.err.print(e);
		}
	}
	
	private String _outputPackage;
	private String[] _fileExtensions;
	private File _sourceDirectory;
	private boolean _isQuiet;
	private boolean _useCamelCaseKeys;
	
	public void setSourceDirectory(String sourceDirectory) {
		_sourceDirectory = new File(sourceDirectory);
	}
	
	public void setOutputPackage(String outputPackage) {
		_outputPackage = outputPackage;
	}
	
	public void setFileExtensions(String... fileExtensions) {
		_fileExtensions = fileExtensions;
	}
	
	public void setIsQuiet(boolean isQuiet) {
		this._isQuiet = isQuiet;
	}
	
	public void setUseCamelCaseKeys(boolean useCamelCaseKeys) {
		this._useCamelCaseKeys = useCamelCaseKeys;
	}
	
	public void generate(String... fileOrDirectoryNames) {
		generate(Arrays.asList(fileOrDirectoryNames));
	}
	
	public void generate(List<String> pathNames) {
		// just in case ...
		Logger rootLogger = Logger.getRootLogger();
		if (!rootLogger.getAllAppenders().hasMoreElements())
			rootLogger.setLevel(Level.OFF);
		
		TypeRegistry registry = new TypeRegistry();
		TypeParser parser = new TypeParser(registry, _useCamelCaseKeys, _isQuiet);
		TypeGenerator generator = new TypeGenerator(registry);
		
		for (String pathName : pathNames) {
			File path = new File(pathName);
			if (path.isFile()) {
				parseFile(path, parser);
			} else {
				parseDirectory(path, parser);
			}
		}
		
		File outputDirFile = new File(_sourceDirectory, _outputPackage.replace('.', '/'));
		
		outputDirFile.mkdirs();

		Jalopy jalopy = new Jalopy();
		
		for (UserType type : registry.getTypes(UserType.class)) {
			if (type.getParentType() == null) {
				File file = new File(outputDirFile, type.getJavaType() + ".java");
				StringWriter stringWriter = new StringWriter();
				
				try {
					stringWriter.append("package ").append(_outputPackage).append(";\n\n");
					generator.generate(stringWriter, type);
					stringWriter.flush();

					StringBuffer buffer = new StringBuffer();
					
					jalopy.setInput(stringWriter.toString(), file.getPath());
					jalopy.setOutput(buffer);
					
					FileWriter writer = new FileWriter(file);
					if (jalopy.format() && Jalopy.State.PARSED == jalopy.getState()) {
						writer.write(buffer.toString());
					} else {
						writer.write(stringWriter.toString());
					}
					writer.close();
				} catch (Exception e) {
					System.err.println("Error in writing type " + type.getGuiceyType());
					System.err.println(e);
					
					try {
						FileWriter writer = new FileWriter(file);
						writer.write(stringWriter.toString());
						writer.close();
					} catch (Exception f) {
						System.err.println("Yet another error in writing type " + type.getGuiceyType());
						System.err.println(f);
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		OptionParser parser = new OptionParser();
		OptionSpec<String> sourceDirectory = parser.acceptsAll(Arrays.asList("s", "src")).withRequiredArg().ofType(String.class).defaultsTo("src").describedAs("Output source directory");
		OptionSpec<String> packageName = parser.acceptsAll(Arrays.asList("p", "package")).withRequiredArg().ofType(String.class).defaultsTo("data").describedAs("Package to put all generated classes into");
		OptionSpec<Void> useCamelCase = parser.acceptsAll(Arrays.asList("c", "useCamelCase"), "Use camel case for mongo field names.  By convention field names are specified as field_name, which will generate an object as {'field_name': true}.  Using this option, {'fieldName': true} will be generated.");
		parser.acceptsAll(Arrays.asList("h", "help"), "Show help");
		OptionSpec<Void> isQuiet = parser.acceptsAll(Arrays.asList("q", "quiet"), "Do not print informational messages");
		
		OptionSet options = parser.parse(args);
		
		if (options.has("h") || options.nonOptionArguments().size() == 0) {
			try {
				System.out.println("Usage: [how you ran this] [options] file ...");
				parser.printHelpOn(System.out);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return;
		}

		GuiceyDataGenerator generator = new GuiceyDataGenerator();
		generator.setOutputPackage(packageName.value(options));
		generator.setSourceDirectory(sourceDirectory.value(options));
		generator.setIsQuiet(options.has(isQuiet));
		generator.setUseCamelCaseKeys(options.has(useCamelCase));
		
		generator.generate(options.nonOptionArguments());
	}
}
