package com.SYC.modelo.Repositorios;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.SYC.modelo.entidad.Arma;
import com.SYC.modelo.entidad.Armadura;
import com.SYC.modelo.entidad.Atributo;
import com.SYC.modelo.entidad.Deidad;
import com.SYC.modelo.entidad.Habilidad;
import com.SYC.modelo.entidad.Item;
import com.SYC.modelo.entidad.Personaje;
import com.SYC.modelo.persistencia.PersonajeDao;

@Service
public class PersonajeRepositorio implements PersonajeDao{
	
	@Autowired MongoTemplate mongot;
	@Override
	public void insertar(Personaje personaje) {
		mongot.save(personaje, "Personaje");
	}

	@Override
	public void borrar(Personaje personaje) {
		mongot.remove(personaje, "Personaje");
	}
	
	@Override
	public List<Personaje> listar() {
		List<Personaje> list = mongot.findAll(Personaje.class);
		return list;
	}

	@Override
	public void modificarNombre(Personaje personaje, String nombre) {
		mongot.remove(personaje, "Personaje");
		personaje.setNombre(nombre);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public void modificarVida(Personaje personaje, Integer vida) {
		personaje.setVida(vida);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	public void modificarMana(Personaje personaje, Integer mana) {
		personaje.setMana(mana);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	public void modificarRaza(Personaje personaje, String raza) {
		personaje.setRaza(raza);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	public void modificarClase(Personaje personaje, String clase) {
		personaje.setClase(clase);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	public void modificarCultura(Personaje personaje, String cultura) {
		personaje.setCultura(cultura);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	public void modificarReligion(Personaje personaje, Deidad deidad) {
		personaje.setReligion(deidad);
		mongot.save(personaje, "Personaje");		
	}
	
	@Override
	
	public void modificarArmadura(Personaje personaje, List<Armadura> armaduras) {
		personaje.setArmadura(armaduras);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	public void modificarArma(Personaje personaje, List<Arma> armas) {
		personaje.setArma(armas);
		mongot.save(personaje, "Personaje");		
	}

	@Override
	public void equiparArma(Personaje personaje, Arma arma) {
		personaje.removeItem(arma);
		personaje.addArma(arma);
		mongot.save(personaje, "Personaje");
	}
	
	@Override
	public void desequiparArma(Personaje personaje, Arma arma) {
		personaje.removeArma(arma);
		personaje.addItem(arma);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public void modificarInventario(Personaje personaje, List<Item> inventario) {
		personaje.setInventario(inventario);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public void eliminarItem(Personaje personaje, Item item) {
		personaje.removeItem(item);
		mongot.save(personaje, "personaje");
	}

	@Override
	public void añadirItem(Personaje personaje, Item item) {
		personaje.addItem(item);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public void equiparArmadura(Personaje personaje, Armadura armadura) {
		personaje.removeItem(armadura);
		personaje.addArmadura(armadura);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public void desequiparArmadura(Personaje personaje, Armadura armadura) {
		personaje.removeArmadura(armadura);
		personaje.addItem(armadura);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public void añadirArma(Personaje personaje, Arma arma) {
		personaje.addArma(arma);
		mongot.save(personaje, "Personaje");
		
	}

	@Override
	public void borrarArma(Personaje personaje, Arma arma) {
		personaje.removeArma(arma);
		mongot.save(personaje, "Personaje");
		
	}

	@Override
	public List<Arma> listarArmas(Personaje personaje) {
		return personaje.getArma();
	}

	@Override
	public void añadirArmadura(Personaje personaje, Armadura armadura) {
		personaje.addArmadura(armadura);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public void borrarArmadura(Personaje personaje, Armadura armadura) {
		personaje.removeArmadura(armadura);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public List<Armadura> listarArmaduras(Personaje personaje) {
		return personaje.getArmadura();
	}

	@Override
	public void añadirAtributo(Personaje personaje, Atributo atributo) {
		personaje.addAtributo(atributo);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public void borrarAtributo(Personaje personaje, Atributo atributo) {
		personaje.removeAtributo(atributo);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public List<Atributo> listarAtributos(Personaje personaje) {
		return personaje.getAtributos();
	}

	@Override
	public void añadirHabilidad(Personaje personaje, Habilidad habilidad) {
		personaje.addHabilidad(habilidad);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public void borrarHabilidad(Personaje personaje, Habilidad habilidad) {
		personaje.removeHabilidad(habilidad);
		mongot.save(personaje, "Personaje");
	}

	@Override
	public List<Habilidad> listarhabilidades(Personaje personaje) {
		return personaje.getHabilidades();	
	}

	@Override
	public List<Item> listarItem(Personaje personaje) {
		return personaje.getInventario();
	}
}