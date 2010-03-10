package com.lowereast.guiceymongo;

import com.mongodb.MongoException;

@SuppressWarnings("serial")
public class GuiceyMongoEvalException extends MongoException {
	private static String _errorPrefix = "eval failed: { \"errno\" : -3.0 , \"errmsg\" : \"invoke failed: JS Error: uncaught exception: ";
	
	public GuiceyMongoEvalException(String exceptionMessage) {
		super(exceptionMessage);
	}
	
	/**
	 * Will create a MongoEvalException if the exception passed in was created from an eval command.  Otherwise the exception passed in will be returned.
	 * @param e
	 * @return MongoEvalException if applicable, otherwise the exception passed in
	 */
	public static MongoException create(MongoException e) {
		String errorString = e.getMessage();
		if (errorString.startsWith(_errorPrefix)) {
			int length = _errorPrefix.length();
			return new GuiceyMongoEvalException(errorString.substring(length, errorString.indexOf('"', length)).trim());
		}
		return e;
	}
}
