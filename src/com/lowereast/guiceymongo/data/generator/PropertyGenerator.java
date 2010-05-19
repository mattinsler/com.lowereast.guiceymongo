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

import java.io.IOException;

import com.lowereast.guiceymongo.data.generator.property.Property;
import com.lowereast.guiceymongo.data.generator.type.Type;

public abstract class PropertyGenerator<T extends Type, P extends Property<T>> {
	protected final Class<T> typeClass;
	protected final TypeRegistry typeRegistry;
	
	protected PropertyGenerator(Class<T> typeClass, TypeRegistry typeRegistry) {
		this.typeClass = typeClass;
		this.typeRegistry = typeRegistry;
	}
	
	protected Appendable appendIndent(Appendable builder, int indentCount) throws IOException {
		for (int x = 0; x < indentCount; ++x)
			builder.append("\t");
		return builder;
	}
	
//	protected void createStandardReadableMethod(Appendable builder, P property, int indentCount) throws IOException {
//		Type type = property.getType();
//		
//		// has
//		appendIndent(builder, indentCount).append("public abstract boolean has").append(property.getCamelCaseName()).append("();\n");
//		// get
//		appendIndent(builder, indentCount).append("public abstract ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("();\n");
//	}
	
	public abstract void createEquals(Appendable builder, P property, int indentCount) throws IOException;
	
	public abstract void createKey(Appendable builder, P property, int indentCount) throws IOException;
	public abstract void createReadableMethod(Appendable builder, P property, int indentCount) throws IOException;
	
	public abstract void createWrapperMethod(Appendable builder, P property, int indentCount) throws IOException;
	
	public abstract void createBuilderMethod(Appendable builder, P property, int indentCount) throws IOException;
	public abstract void createBuilderNewBuilder(Appendable builder, P property, int indentCount) throws IOException;
	public abstract void createBuilderBuild(Appendable builder, P property, int indentCount) throws IOException;
	
	public abstract void createUpdaterMethod(Appendable builder, P property, int indentCount) throws IOException;
	public abstract void createUpdaterBuildUpdate(Appendable builder, P property, int indentCount) throws IOException;
}
