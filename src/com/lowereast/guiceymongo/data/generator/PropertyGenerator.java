package com.lowereast.guiceymongo.data.generator;

import java.io.IOException;

import com.lowereast.guiceymongo.data.property.Property;
import com.lowereast.guiceymongo.data.type.Type;

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
	
	protected void createStandardReadableMethod(Appendable builder, P property, int indentCount) throws IOException {
		Type type = property.getType();
		
		// has
		appendIndent(builder, indentCount).append("public abstract boolean has").append(property.getCamelCaseName()).append("();\n");
		// get
		appendIndent(builder, indentCount).append("public abstract ").append(type.getCanonicalJavaType()).append(" get").append(property.getCamelCaseName()).append("();\n");
	}
	
	public abstract void createKey(Appendable builder, P property, int indentCount) throws IOException;
	public abstract void createReadableMethod(Appendable builder, P property, int indentCount) throws IOException;
	
	public abstract void createWrapperMethod(Appendable builder, P property, int indentCount) throws IOException;
	
	public abstract void createBuilderMethod(Appendable builder, P property, int indentCount) throws IOException;
	public abstract void createBuilderBuild(Appendable builder, P property, int indentCount) throws IOException;
	
	public abstract void createUpdaterMethod(Appendable builder, P property, int indentCount) throws IOException;
	public abstract void createUpdaterBuildUpdate(Appendable builder, P property, int indentCount) throws IOException;
}
