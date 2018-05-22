package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.SYC.modelo.entidad.Personaje;
import com.SYC.modelo.persistencia.PersonajeDao;

@Service
public class PersonajeRepositorio implements PersonajeDao{
	
	@Autowired MongoTemplate mongot;
	@Override
	public void insertar(Personaje personaje) {
		//mongot.save(personaje);
		//mongot.insert(personaje, "Personaje");
		mongot.save(personaje, "Personaje");
	}

	@Override
	public void modificar(Personaje personaje) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Personaje personaje) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Personaje buscar(Personaje personaje) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Personaje> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}
	