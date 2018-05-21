import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import com.SYC.modelo.entidad.Personaje;
import com.SYC.modelo.persistencia.PersonajeDao;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class Prueba {
	
	@Autowired
	private PersonajeDao pjDao;

	public static void main(String[] args) {
		SpringApplication.run(Prueba.class, args);
	}
	
	public void run(String... args) throws Exception {
		pjDao.deleteAll();
		pjDao.save(new Personaje("Vivi"));
	}

}
