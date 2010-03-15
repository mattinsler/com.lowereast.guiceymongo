import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.lowereast.guiceymongo.guice.GuiceyMongo;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoDatabase;
import com.mongodb.DB;

public class RemoteDatabaseConfigurationExample {
	@Inject
	RemoteDatabaseConfigurationExample(@GuiceyMongoDatabase(Databases.Main) DB mainDatabase, @GuiceyMongoDatabase(Databases.Search) DB searchDatabase) {
		System.out.println(mainDatabase);
		System.out.println(searchDatabase);
	}
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(
				// create a connection to localhost:13731 that can be used by databases
				GuiceyMongo.configureConnection(Connections.Primary)
					.port(13731),
					
				// create the production configuration
				GuiceyMongo.configure(Configurations.Production)
					// configure the Main database to use the Primary connection (localhost:13731)
					.mapDatabase(Databases.Main).to("prod_db").overConnection(Connections.Primary)
					.mapDatabase(Databases.Search).to("prod_search_db"),
					
				// create the test configuration
				GuiceyMongo.configure(Configurations.Test)
					// configure the Main database to use the Primary connection (localhost:13731)
					.mapDatabase(Databases.Main).to("test_db").overConnection(Connections.Primary),
				
				// configurations can be augmented in separate modules
				GuiceyMongo.configure(Configurations.Test)
					.mapDatabase(Databases.Search).to("test_search_db"),
				
				// choose the configuration to use
				GuiceyMongo.chooseConfiguration(Configurations.Test)
		);
		
		injector.getInstance(RemoteDatabaseConfigurationExample.class);
	}
}
