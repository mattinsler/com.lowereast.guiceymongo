package com.lowereast.guiceymongo.data;

import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;

import com.lowereast.guiceymongo.data.generator.TypeGenerator;
import com.lowereast.guiceymongo.data.generator.TypeRegistry;
import com.lowereast.guiceymongo.data.parser.GuiceyDataLexer;
import com.lowereast.guiceymongo.data.parser.GuiceyDataParser;
import com.lowereast.guiceymongo.data.parser.TypeParser;
import com.lowereast.guiceymongo.data.type.UserType;

public class GuiceyDataGenerator {
	private void parseDirectory(File directory, TypeParser parser) {
		for (File file : directory.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				for (String extension : _fileExtensions)
					if (name.endsWith(extension))
						return true;
				return false;
			}
		}))
			parseFile(file, parser);
	}
	
	private void parseFile(File file, TypeParser typeParser) {
		if (!file.exists())
			System.err.println("File " + file.getPath() + " does not exist.");
		if (!file.canRead())
			System.err.println("File " + file.getPath() + " cannot be read.");
		if (file.isDirectory()) {
			parseDirectory(file, typeParser);
		} else {
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
	}
	
	private String _outputPackage;
	private String[] _fileExtensions;
	private File _sourceDirectory;
	
	public void setSourceDirectory(String sourceDirectory) {
		_sourceDirectory = new File(sourceDirectory);
	}
	
	public void setOutputPackage(String outputPackage) {
		_outputPackage = outputPackage;
	}
	
	public void setFileExtensions(String... fileExtensions) {
		_fileExtensions = fileExtensions;
	}
	
	public void generate(String... fileOrDirectoryNames) {
		generate(false, fileOrDirectoryNames);
	}
	
	public void generate(boolean useCamelCaseKeys, String... fileOrDirectoryNames) {
		TypeRegistry registry = new TypeRegistry();
		TypeParser parser = new TypeParser(registry, useCamelCaseKeys);
		TypeGenerator generator = new TypeGenerator(registry);
		
		for (String fileOrDirectory : fileOrDirectoryNames)
			parseFile(new File(fileOrDirectory), parser);
		
		File outputDirFile = new File(_sourceDirectory, _outputPackage.replace('.', '/'));
		
		outputDirFile.mkdirs();

		for (UserType type : registry.getTypes(UserType.class)) {
			if (type.getParentType() == null) {
				try {
					FileWriter writer = new FileWriter(new File(outputDirFile, type.getSimpleJavaType() + ".java"));
					writer.append("package ").append(_outputPackage).append(";\n\n");
					generator.generate(writer, type);
					writer.close();
				} catch (Exception e) {
					System.err.println("Error in writing type " + type.getGuiceyType());
					System.err.println(e);
				}
			}
		}
	}
}
