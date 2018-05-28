package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.SYC.modelo.entidad.Habilidad;
import com.SYC.modelo.persistencia.HabilidadDao;

public class HabilidadRepositorio implements HabilidadDao{

	@Autowired MongoTemplate mongot;
	
	@Override
	public void insertar(Habilidad habilidad) {
		mongot.save(habilidad, "Habilidad");
		
	}

	@Override
	public void borrar(Habilidad habilidad) {
		mongot.remove(habilidad, "Habilidad");
		
	}

	@Override
	public List<Habilidad> listar() {
		return mongot.findAll(Habilidad.class, "Habilidad");
	}

	@Override
	public void modificarNombre(Habilidad habilidad, String nombre) {
		habilidad.setNombre(nombre);
		mongot.save(habilidad, "Habilidad");
		
	}

	@Override
	public void modificarNivel(Habilidad habilidad, Integer nivel) {
		habilidad.setNivel(nivel);
		mongot.save(habilidad, "Habilidad");
		
	}

}
