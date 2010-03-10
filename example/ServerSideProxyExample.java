import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.lowereast.guiceymongo.guice.GuiceyMongo;
import com.mongodb.DBObject;

public class ServerSideProxyExample {
	public interface PrintQuery {
		void print(String message);
	}
	
	/*
	 * You can create server side methods and then use a javascript proxy to call them:
	 * db.system.js.save({
	 * 		_id: 'getData',
	 * 		value: function(count) {
	 * 			return db.foo.find().limit(count).toArray();
	 * 		}
	 * })
	 * 
	 * db.system.js.save({
	 * 		_id: 'getCount',
	 * 		value: function() {
	 * 			return db.foo.count();
	 * 		}
	 * })
	 * 
	 * WARNING: You cannot return a cursor from a server side method
	 */
	public interface TestQuery {
		// this will execute "db.eval(function(count){return getData(count)}, count)"
		List<DBObject> getData(int count);
		// this will execute "db.eval(function(){return getCount()})"
		int getCount();
	}
	
	@Inject
	ServerSideProxyExample(PrintQuery printQuery) {
		// will print Hello world on the server
		printQuery.print("Hello world");
	}
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(
				// create the test configuration
				GuiceyMongo.configure(Configurations.Test)
					.mapDatabase(Databases.Main).to("test_db"),
				
				// generate a proxy class that calls db.eval using the method
				// names and arguments in the proxy interface, using the database
				GuiceyMongo.javascriptProxy(PrintQuery.class, Databases.Main),
				
				// choose the configuration to use
				GuiceyMongo.chooseConfiguration(Configurations.Test)
		);
		
		injector.getInstance(CollectionConfigurationExample.class);
	}
}
