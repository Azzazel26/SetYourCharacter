package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SYC.modelo.entidad.Arma;
import com.SYC.modelo.entidad.Armadura;
import com.SYC.modelo.entidad.Atributo;
import com.SYC.modelo.entidad.Deidad;
import com.SYC.modelo.entidad.Habilidad;
import com.SYC.modelo.entidad.Item;
import com.SYC.modelo.entidad.Personaje;
import com.SYC.modelo.persistencia.PersonajeDao;

@Controller
@RequestMapping(value="/Personaje")
public class PersonajeRepositorio implements PersonajeDao{
	
	@Autowired MongoTemplate mongot;
	
	
	@RequestMapping(value="/insertar",method=RequestMethod.POST)
	@Override
	public void insertar(Personaje personaje) {
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/borrar",method=RequestMethod.DELETE)
	public void borrar(Personaje personaje) {
		mongot.remove(personaje, "Personaje");
	}
	
	@Override
	@RequestMapping(value="/listarPersonaje", method=RequestMethod.GET)
	public List<Personaje> listar() {
		List<Personaje> list = mongot.findAll(Personaje.class);
		return list;
	}

	@Override
	@RequestMapping(value="/modificarNombre", method=RequestMethod.PUT)
	public void modificarNombre(Personaje personaje, String nombre) {
		mongot.remove(personaje, "Personaje");
		personaje.setNombre(nombre);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/modificarVida", method=RequestMethod.PUT)
	public void modificarVida(Personaje personaje, Integer vida) {
		personaje.setVida(vida);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	@RequestMapping(value="/modificarMana", method=RequestMethod.PUT)
	public void modificarMana(Personaje personaje, Integer mana) {
		personaje.setMana(mana);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	@RequestMapping(value="/modificarRaza", method=RequestMethod.PUT)
	public void modificarRaza(Personaje personaje, String raza) {
		personaje.setRaza(raza);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	@RequestMapping(value="/modificarClase", method=RequestMethod.PUT)
	public void modificarClase(Personaje personaje, String clase) {
		personaje.setClase(clase);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	@RequestMapping(value="/modificarCultura", method=RequestMethod.PUT)
	public void modificarCultura(Personaje personaje, String cultura) {
		personaje.setCultura(cultura);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	@RequestMapping(value="/modificarReligion", method=RequestMethod.PUT)
	public void modificarReligion(Personaje personaje, Deidad deidad) {
		personaje.setReligion(deidad);
		mongot.save(personaje, "Personaje");		
	}
	
	@Override
	@RequestMapping(value="/modificarArmadura", method=RequestMethod.PUT)
	public void modificarArmadura(Personaje personaje, List<Armadura> armaduras) {
		personaje.setArmadura(armaduras);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	@RequestMapping(value="/modificarArma", method=RequestMethod.PUT)
	public void modificarArma(Personaje personaje, List<Arma> armas) {
		personaje.setArma(armas);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	@RequestMapping(value="/equiparArma", method=RequestMethod.PUT)
	public void equiparArma(Personaje personaje, Arma arma) {
		personaje.removeItem(arma);
		personaje.addArma(arma);
		mongot.save(personaje, "Personaje");
	}
	
	@Override
	@RequestMapping(value="/desequiparArma", method=RequestMethod.PUT)
	public void desequiparArma(Personaje personaje, Arma arma) {
		personaje.removeArma(arma);
		personaje.addItem(arma);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/modificarInventario", method=RequestMethod.PUT)
	public void modificarInventario(Personaje personaje, List<Item> inventario) {
		personaje.setInventario(inventario);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/eliminarItem", method=RequestMethod.PUT)
	public void eliminarItem(Personaje personaje, Item item) {
		personaje.removeItem(item);
		mongot.save(personaje, "personaje");
	}

	@Override
	@RequestMapping(value="/anyadirItem", method=RequestMethod.PUT)
	public void anyadirItem(Personaje personaje, Item item) {
		personaje.addItem(item);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/equiparArmadura", method=RequestMethod.PUT)
	public void equiparArmadura(Personaje personaje, Armadura armadura) {
		personaje.removeItem(armadura);
		personaje.addArmadura(armadura);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/desequiparArmadura", method=RequestMethod.PUT)
	public void desequiparArmadura(Personaje personaje, Armadura armadura) {
		personaje.removeArmadura(armadura);
		personaje.addItem(armadura);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/anyadirArma", method=RequestMethod.PUT)
	public void anyadirArma(Personaje personaje, Arma arma) {
		personaje.addArma(arma);
		mongot.save(personaje, "Personaje");
		
	}

	@Override
	@RequestMapping(value="/borrarArma", method=RequestMethod.PUT)
	public void borrarArma(Personaje personaje, Arma arma) {
		personaje.removeArma(arma);
		mongot.save(personaje, "Personaje");
		
	}

	@Override
	@RequestMapping(value="/listarArmas", method=RequestMethod.GET)
	public List<Arma> listarArmas(Personaje personaje) {
		return personaje.getArma();
	}

	@Override
	@RequestMapping(value="/anyadirArmadura", method=RequestMethod.PUT)
	public void anyadirArmadura(Personaje personaje, Armadura armadura) {
		personaje.addArmadura(armadura);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/borrarArmadura", method=RequestMethod.PUT)
	public void borrarArmadura(Personaje personaje, Armadura armadura) {
		personaje.removeArmadura(armadura);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/listarArmaduras", method=RequestMethod.GET)
	public List<Armadura> listarArmaduras(Personaje personaje) {
		return personaje.getArmadura();
	}

	@Override
	@RequestMapping(value="/anyadirAtributo", method=RequestMethod.PUT)
	public void anyadirAtributo(Personaje personaje, Atributo atributo) {
		personaje.addAtributo(atributo);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/borrarAtributo", method=RequestMethod.PUT)
	public void borrarAtributo(Personaje personaje, Atributo atributo) {
		personaje.removeAtributo(atributo);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/listarAtributos", method=RequestMethod.GET)
	public List<Atributo> listarAtributos(Personaje personaje) {
		return personaje.getAtributos();
	}

	@Override
	@RequestMapping(value="/anyadirHabilidad", method=RequestMethod.PUT)
	public void anyadirHabilidad(Personaje personaje, Habilidad habilidad) {
		personaje.addHabilidad(habilidad);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/borrarHabilidad", method=RequestMethod.PUT)
	public void borrarHabilidad(Personaje personaje, Habilidad habilidad) {
		personaje.removeHabilidad(habilidad);
		mongot.save(personaje, "Personaje");
	}

	@Override
	@RequestMapping(value="/listarHabilidades", method=RequestMethod.GET)
	public List<Habilidad> listarhabilidades(Personaje personaje) {
		return personaje.getHabilidades();	
	}

	@Override
	@RequestMapping(value="/listarItem", method=RequestMethod.GET)
	public List<Item> listarItem(Personaje personaje) {
		return personaje.getInventario();
	}
}