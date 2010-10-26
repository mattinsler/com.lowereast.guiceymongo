package com.lowereast.guiceymongo.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;
import com.lowereast.guiceymongo.data.generator.GuiceyDataGenerator;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit tests for the generator.
 */
public class GeneratorTest extends TestCase {
	private static final GuiceyDataGenerator GENERATOR = new GuiceyDataGenerator();
	private static final String SCHEMA = "src/test/data";
	private static final String OUTPUT = "src/test/generated";
	private static final String PACKAGE = "com.example";
	private static final String PACKAGE_FOLDER = PACKAGE.replace('.', '/');
	private static final String FILE_EXTENSION = ".data";
	private static final String SCHEMA_PERSON = String.format("%s/person.data", SCHEMA);
	private static final String SCHEMA_VEHICLE = String.format("%s/subfolder/vehicle.data", SCHEMA);
	private static final String OUTPUT_PERSON = String.format("%s/%s/Person.java", OUTPUT, PACKAGE_FOLDER);
	private static final String OUTPUT_VEHICLE = String.format("%s/%s/Vehicle.java", OUTPUT, PACKAGE_FOLDER);
	private static final Pattern REGEX_JAVADOC_NAME = Pattern.compile("/\\*\\*\\s+\\* Full name\\s+ \\*/\\s+@Override\\s+public String getName()");
	
	
	static {
    	//Configure generator
        GENERATOR.setSourceDirectory(OUTPUT);
        GENERATOR.setOutputPackage(PACKAGE);
        GENERATOR.setFileExtensions(FILE_EXTENSION);
	}

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(GeneratorTest.class);
    }
	
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GeneratorTest(String testName) {
        super(testName);
        
        try {
        	//Delete anything in the output directory
			FileUtils.deleteDirectory(new File(OUTPUT));
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail(String.format("Could not clear output directory for test %s.", testName));
		}
    }

    
    /**
     * Test file generation properly recurses into subdirectories to look for
     * schema definition files.
     */
    public void testDirectoryRecursion() {
        //Generate source files
        GENERATOR.generate(SCHEMA);
        
        //Test for class in root of directory
    	final File person = new File(OUTPUT_PERSON);
        Assert.assertTrue(person.exists());
        
        //Test for class stored in subdirectory
    	final File vehicle = new File(OUTPUT_VEHICLE);
        Assert.assertTrue(vehicle.exists());
    }
    
    /**
     * Ensure every path to generate is being generated.
     */
    public void testMultiplePaths() {
        //Generate source files
        GENERATOR.generate(SCHEMA_PERSON, SCHEMA_VEHICLE);
        
        //Test for class in root of directory
    	final File person = new File(OUTPUT_PERSON);
        Assert.assertTrue(person.exists());
        
        //Test for class stored in subdirectory
    	final File vehicle = new File(OUTPUT_VEHICLE);
        Assert.assertTrue(vehicle.exists());
    }
    
    /**
     * Test that nothing is written to System.out when the isQuiet option is
     * specified.
     */
    public void testIsQuiet() {
    	//Keep the original System.out
    	final PrintStream oldSystemOut = System.out;
    	
    	//Configure generator
        GENERATOR.setIsQuiet(true);
        
        //Replace System.out with a stream we can measure
        final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        final PrintStream systemOut = new PrintStream(outStream);
        System.setOut(systemOut);
        
        //Generate source files
        GENERATOR.generate(SCHEMA_PERSON);
        
        //Flush any writes and close to prevent further ones
        systemOut.flush();
        systemOut.close();
        
        //Check to make sure nothing was written during execution
        Assert.assertEquals(outStream.size(), 0);
        
        //Restore System.out
        System.setOut(oldSystemOut);
    }
    
    /**
     * Make sure that the JavaDocs are being properly generated.
     */
    public void testJavaDoc() {
        //Generate source files
        GENERATOR.generate(SCHEMA_PERSON);
        
        //Test for class in root of directory
    	final File person = new File(OUTPUT_PERSON);
        Assert.assertTrue(person.exists());
        
        try {
			final String contents = FileUtils.readFileToString(person);
			Assert.assertTrue(GeneratorTest.REGEX_JAVADOC_NAME.matcher(contents).find());
		} catch (IOException e) {
			e.printStackTrace();
			Assert.fail("Could not read generated file.");
		}
    }
}