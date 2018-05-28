import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.SYC.modelo.Repositorios.ArmaRepositorio;
import com.SYC.modelo.Repositorios.PersonajeRepositorio;
import com.SYC.modelo.entidad.Arma;
import com.SYC.modelo.entidad.Armadura;
import com.SYC.modelo.entidad.Deidad;
import com.SYC.modelo.entidad.Item;
import com.SYC.modelo.entidad.Personaje;

import resources.ApplicationConfig;

@SpringBootApplication(scanBasePackages={"resources"})
@ComponentScan("resources")
public class Prueba implements CommandLineRunner{
	
	ApplicationConfig aC = new ApplicationConfig();
	@Autowired
	private PersonajeRepositorio pjRep;
	
	@Autowired
	private ArmaRepositorio armaRep;
	


	public static void main(String[] args) {
		SpringApplication.run(Prueba.class, args);
	}
	
	public void run(String... args) throws Exception{
		Personaje kleenex = new Personaje("kleenex");
		Arma daga = new Arma("daga", 1, "1 mano", "1D4");
		Arma daga2 = new Arma("cuchillo", 1, "1 mano", "1D4");
		Deidad deidad= new Deidad("Belenus", "Dios del fuego y la celebración. +1 carisma");
		List<Arma> lt =new ArrayList();
		List<Item>inventario = new ArrayList();
		
		Armadura pechera = new Armadura("pechera de placas", 10, "1D6");
		Armadura casco = new Armadura("casco de hierro", 6, "1D4");
		List<Armadura> lt2=new ArrayList();
		inventario.add(daga);
		inventario.add(daga2);
		lt2.add(pechera);
		lt2.add(casco);
		
		//armaRep.borrar(daga);
	}

}
