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

package com.lowereast.guiceymongo.query;

public interface ComparisonBuilder<Type, ReturnType> {
	ReturnType isEqualTo(Type value);
	ReturnType isNotEqualTo(Type value);
	
	ReturnType isGreaterThan(Type value);
	ReturnType isGreaterThanEqualTo(Type value);
	ReturnType isLessThan(Type value);
	ReturnType isLessThanEqualTo(Type value);
	
	ReturnType exists();
	ReturnType doesNotExist();
	
	ReturnType isLike(String value);
	ReturnType isLikeIgnoreCase(String value);
	
	ReturnType containsAny(Type... value);
	ReturnType containsAny(Iterable<? extends Type> value);
	
	ReturnType doesNotContain(Type... value);
	ReturnType doesNotContain(Iterable<? extends Type> value);
	
	ReturnType containsAll(Type... value);
	ReturnType containsAll(Iterable<? extends Type> value);
	
	// slice
	// mod
	// size
	// type
	// elemMatch
	// not
	// where
}
