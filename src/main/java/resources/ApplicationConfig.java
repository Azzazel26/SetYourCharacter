package resources;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.SYC.modelo.Repositorios.ArmaRepositorio;
import com.SYC.modelo.Repositorios.ArmaduraRepositorio;
import com.SYC.modelo.Repositorios.AtributoRepositorio;
import com.SYC.modelo.Repositorios.DeidadRepositorio;
import com.SYC.modelo.Repositorios.HabilidadRepositorio;
import com.SYC.modelo.Repositorios.ItemRepositorio;
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
	
	@Bean
	public ArmaRepositorio ArmaRepositorio(){
		return new ArmaRepositorio();
		
	}
	
	@Bean
	public ArmaduraRepositorio ArmaduraRepositorio(){
		return new ArmaduraRepositorio();
		
	}
	
	@Bean
	public AtributoRepositorio AtributoRepositorio(){
		return new AtributoRepositorio();
		
	}
	
	@Bean
	public DeidadRepositorio DeidadRepositorio(){
		return new DeidadRepositorio();
		
	}
	
	@Bean
	public HabilidadRepositorio HabilidadRepositorio(){
		return new HabilidadRepositorio();
		
	}
	
	@Bean
	public ItemRepositorio ItemRepositorio(){
		return new ItemRepositorio();
		
	}
}
	