import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.SYC.modelo.Repositorios.PersonajeRepositorio;
import com.SYC.modelo.entidad.Arma;
import com.SYC.modelo.entidad.Personaje;

public class PersonajeTest {
	private PersonajeRepositorio pjRep;

	@Test
	public void test() {
		Personaje kleenex = new Personaje("kleenex");
		pjRep.insertar(kleenex);
		
		Arma daga = new Arma("daga", 1, "1 mano", "1D4");
		Arma daga2 = new Arma("daga2", 1, "1 mano", "1D4");
		
		List<Arma> lt =new ArrayList();
		lt.add(daga);
		lt.add(daga2);
		pjRep.modificarArma(kleenex,lt);
		assertTrue("Llega al final", true);
	}

}
