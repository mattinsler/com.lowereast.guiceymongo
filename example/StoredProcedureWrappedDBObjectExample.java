import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.lowereast.guiceymongo.ReadableDBObject;
import com.lowereast.guiceymongo.guice.GuiceyMongo;
import com.lowereast.guiceymongo.guice.spi.GuiceyMongoDatabases;
import com.lowereast.guiceymongo.wrapper.generator.GuiceyDBObjectGenerator;
import com.mongodb.DB;

import example.mongo.Foo;

public class StoredProcedureWrappedDBObjectExample {
	public interface FooQuery {
		Foo get();
	}
	
	private void printReadableDBObject(ReadableDBObject object) {
		for (String key : object.keySet()) {
			if (object.hasField(key))
				System.out.println(key + ": " + object.getField(key));
		}
	}
	
	@Test
	public void test() {
		Injector injector = Guice.createInjector(
				GuiceyMongo.configure("Test")
					.mapDatabase("Main").to("foo_db"),
				GuiceyMongo.javascriptProxy(FooQuery.class, "Main"),
				GuiceyMongo.chooseConfiguration("Test")
		);
		
		DB db = injector.getInstance(Key.get(DB.class, GuiceyMongoDatabases.database("Main")));
		db.eval("db.system.js.save({_id: 'get', value: function() {return {foo: 'baz', bar: 4, baz: ['foo', 'bar']}}})");
		
		FooQuery query = injector.getInstance(FooQuery.class);
		
		Foo foo = query.get();
		printReadableDBObject(foo);
	}
	
	@Test
	public void generateFoo() {
		GuiceyDBObjectGenerator.generate("example", "example.mongo", "foo.json");
	}
}
