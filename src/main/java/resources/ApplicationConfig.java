package resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import com.SYC.modelo.Repositorios.PersonajeRepositorio;
import com.mongodb.MongoClient;

@Configuration
@ComponentScan(basePackages = {"com.SYC.modelo.persistencia", "com.SYC.modelo.Repositorios"})
public class ApplicationConfig {

	@Bean
	 public MongoDbFactory mongoDbFactory(){
	    MongoClient mongoClient = new MongoClient("localhost", 27017);
	    return new SimpleMongoDbFactory(mongoClient, "admin");
	}
	
	@Bean
    public MongoTemplate mongoTemplate(){
        return new MongoTemplate(mongoDbFactory());
    }
	
	@Bean
	public PersonajeRepositorio personajeRepositorio(){
		return new PersonajeRepositorio();
		
	}
}
	