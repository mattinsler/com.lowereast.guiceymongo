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
	
	public abstract void createKey(Appendable builder, P property, int indentCount) throws IOException;
	public abstract void createReadable(Appendable builder, P property, int indentCount) throws IOException;
	public abstract void createBuilder(Appendable builder, P property, int indentCount) throws IOException;
}
