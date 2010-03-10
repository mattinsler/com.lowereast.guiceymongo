import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.lowereast.guiceymongo.guice.GuiceyMongo;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoCollection;
import com.mongodb.DBCollection;

public class CollectionConfigurationExample {
	@Inject
	CollectionConfigurationExample(@GuiceyMongoCollection(Collections.Data) DBCollection collection) {
		System.out.println(collection.getDB() + " : " + collection);
	}
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(
				// create the test configuration
				GuiceyMongo.configure(Configurations.Test)
					.mapDatabase(Databases.Main).to("test_db")
					// collection names are global, you just need to assign the collection to a database
					.mapCollection(Collections.Data).to("data").inDatabase(Databases.Main),
				
				// choose the configuration to use
				GuiceyMongo.chooseConfiguration(Configurations.Test)
		);
		
		injector.getInstance(CollectionConfigurationExample.class);
	}
}
