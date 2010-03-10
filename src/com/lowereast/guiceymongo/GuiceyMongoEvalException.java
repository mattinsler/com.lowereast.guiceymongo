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
