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

import com.lowereast.guiceymongo.data.FieldSet;
import com.lowereast.guiceymongo.data.IsData;
import com.lowereast.guiceymongo.data.PrimitiveProperty;
import com.lowereast.guiceymongo.query.ComparisonBuilder;
import com.lowereast.guiceymongo.query.ModifierBuilder;
import com.lowereast.guiceymongo.query.PrimitiveComparisonBuilder;

public class GuiceyQuery {
	private GuiceyQuery() {}
	
	public interface Builder<T extends IsData> extends ModifierBuilder<Builder<T>> {
		ComparisonBuilder<Object, Builder<T>> whereProperty(String property);
//		StringComparisonBuilder<Builder<T>> whereProperty(PrimitiveProperty<? extends T, String> property);
		<P> PrimitiveComparisonBuilder<P, Builder<T>> whereProperty(PrimitiveProperty<? extends T, P> property);
	}
	
	public interface ExecutableBuilder<T extends IsData> extends ModifierBuilder<ExecutableBuilder<T>> {
		ComparisonBuilder<Object, ExecutableBuilder<T>> whereProperty(String property);
//		StringComparisonBuilder<Builder<T>> whereProperty(PrimitiveProperty<? extends T, String> property);
		<P> PrimitiveComparisonBuilder<P, ExecutableBuilder<T>> whereProperty(PrimitiveProperty<? extends T, P> property);
		T execute();
	}
	
	public interface ExecutableCursorBuilder<T extends IsData> extends ModifierBuilder<ExecutableCursorBuilder<T>> {
		ComparisonBuilder<Object, ExecutableCursorBuilder<T>> whereProperty(String property);
//		StringComparisonBuilder<Builder<T>> whereProperty(PrimitiveProperty<? extends T, String> property);
		<P> PrimitiveComparisonBuilder<P, ExecutableCursorBuilder<T>> whereProperty(PrimitiveProperty<? extends T, P> property);
		GuiceyCursor<T> execute();
		GuiceyCursor<T> tail();
	}
	
	public static <T extends IsData> Builder<T> newBuilder() {
		return null;
	}
	public static <T extends IsData> ExecutableBuilder<T> newExecutableBuilder() {
		return null;
	}
	public static <T extends IsData> ExecutableBuilder<T> newExecutableBuilder(FieldSet fieldSet) {
		return null;
	}
	public static <T extends IsData> ExecutableCursorBuilder<T> newExecutableCursorBuilder() {
		return null;
	}
	public static <T extends IsData> ExecutableCursorBuilder<T> newExecutableCursorBuilder(FieldSet fieldSet) {
		return null;
	}
}
