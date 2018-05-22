import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.SYC.modelo.Repositorios.PersonajeRepositorio;
import com.SYC.modelo.entidad.Personaje;

import resources.ApplicationConfig;

@SpringBootApplication(scanBasePackages={"resources"})
@ComponentScan("resources")
public class Prueba {
	
	ApplicationConfig aC = new ApplicationConfig();
	@Autowired
	private PersonajeRepositorio pjRep;
	


	public static void main(String[] args) {
		
		SpringApplication.run(Prueba.class, args);
	}
	
	public void run(String... args){
		pjRep.insertar(new Personaje("Manuel"));
	}

}
