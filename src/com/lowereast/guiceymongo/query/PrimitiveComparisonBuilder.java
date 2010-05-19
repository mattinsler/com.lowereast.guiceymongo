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

public interface PrimitiveComparisonBuilder<Type, ReturnType> {
	ReturnType is(Type value);
//	ReturnType isNot(Type value);
	
	ReturnType isGreaterThan(Type value);
	ReturnType isGreaterThanEqualTo(Type value);
	ReturnType isLessThan(Type value);
	ReturnType isLessThanEqualTo(Type value);
	
	ReturnType exists();
	ReturnType doesNotExist();
	
	ReturnType isAnyOf(Type... value);
	ReturnType isAnyOf(Iterable<? extends Type> value);
	
	ReturnType isNot(Type... value);
	ReturnType isNot(Iterable<? extends Type> value);
}
