import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.lowereast.guiceymongo.guice.GuiceyMongo;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoCollection;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoDatabase;
import com.mongodb.DB;
import com.mongodb.DBCollection;

public class JsonConfigurationExample {
	@Inject
	JsonConfigurationExample(@GuiceyMongoDatabase(Databases.Main) DB mainDatabase, @GuiceyMongoDatabase(Databases.Search) DB searchDatabase, @GuiceyMongoCollection(Collections.Data) DBCollection dataCollection) {
		System.out.println(mainDatabase);
		System.out.println(searchDatabase);
		System.out.println(dataCollection.getDB() + ": " + dataCollection);
	}

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(
				GuiceyMongo.configureFromFile("exampleConfiguration.json"),
				GuiceyMongo.chooseConfiguration("Test")
		);
		injector.getInstance(JsonConfigurationExample.class);
	}
}
