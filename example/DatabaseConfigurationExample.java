import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.matcher.Matchers;
import com.lowereast.guiceymongo.guice.GuiceyMongo;
import com.lowereast.guiceymongo.guice.annotation.GuiceyMongoDatabase;
import com.mongodb.DB;

public class DatabaseConfigurationExample {
	@Inject
	DatabaseConfigurationExample(@GuiceyMongoDatabase(Databases.Main) DB mainDatabase, @GuiceyMongoDatabase(Databases.Search) DB searchDatabase) {
		System.out.println(mainDatabase);
		System.out.println(searchDatabase);
	}
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(
				// create the production configuration
				GuiceyMongo.configure(Configurations.Production)
					.mapDatabase(Databases.Main).to("prod_db")
					.mapDatabase(Databases.Search).to("prod_search_db"),
					
				// create the test configuration
				GuiceyMongo.configure(Configurations.Test)
					.mapDatabase(Databases.Main).to("test_db"),
				
				// configurations can be augmented in separate modules
				GuiceyMongo.configure(Configurations.Test)
					.mapDatabase(Databases.Search).to("test_search_db"),
				
				// choose the configuration to use
				GuiceyMongo.chooseConfiguration(Configurations.Test),
				
				new AbstractModule() {
					@Override
					protected void configure() {
						bindInterceptor(Matchers.any(), Matchers.any(), new MethodInterceptor() {
							public Object invoke(MethodInvocation invocation) throws Throwable {
								System.out.println("Before: " + invocation.getMethod());
								Object result = invocation.proceed();
								System.out.println("After: " + invocation.getMethod());
								return result;
							}
						});
					}
				}
		);
		
		injector.getInstance(DatabaseConfigurationExample.class);
	}
}
