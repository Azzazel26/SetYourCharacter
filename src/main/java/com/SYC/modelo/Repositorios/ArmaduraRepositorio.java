package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.SYC.modelo.entidad.Armadura;
import com.SYC.modelo.persistencia.ArmaduraDao;

public class ArmaduraRepositorio implements ArmaduraDao {
	
	@Autowired MongoTemplate mongot;
	@Override
	public void insertar(Armadura armadura) {
		mongot.save(armadura, "Armadura");
		
	}

	@Override
	public void borrar(Armadura armadura) {
		mongot.remove(armadura, "Armadura");
		
	}

	

	@Override
	public List<Armadura> listar() {
		return mongot.findAll(Armadura.class, "Armadura");
	}

	@Override
	public void modificarAbsorcion(Armadura armadura, String absorcion) {
		armadura.setAbsorcion(absorcion);
		mongot.save(armadura, "Armadura");
		
	}

	@Override
	public void modificarNombre(Armadura armadura, String nombre) {
		armadura.setNombre(nombre);
		mongot.save(armadura, "Armadura");
	}

	@Override
	public void modificarPeso(Armadura armadura, Integer peso) {
		armadura.setPeso(peso);
		mongot.save(armadura, "Armadura");
	}

}
