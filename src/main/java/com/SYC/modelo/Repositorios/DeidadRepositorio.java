package com.SYC.modelo.Repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.SYC.modelo.entidad.Deidad;
import com.SYC.modelo.persistencia.DeidadDao;

public class DeidadRepositorio implements DeidadDao{
	
	@Autowired MongoTemplate mongot;
	@Override
	public void insertar(Deidad deidad) {
		mongot.save(deidad, "Deidad");
		
	}

	@Override
	public void borrar(Deidad deidad) {
		mongot.remove(deidad, "Deidad");
		
	}

	@Override
	public void modificarNombre(Deidad deidad, String nombre) {
		deidad.setNombre(nombre);
		mongot.save(deidad, "Deidad");
		
	}

	@Override
	public void modificarDescripcion(Deidad deidad, String descripcion) {
		deidad.setDescripcion(descripcion);
		mongot.save(deidad, "Deidad");
		
	}

	
}
