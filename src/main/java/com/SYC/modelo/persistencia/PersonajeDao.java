package com.SYC.modelo.persistencia;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SYC.modelo.entidad.Personaje;

public interface PersonajeDao extends MongoRepository<Personaje, String>{
	
	void insertar(Personaje personaje);
	void modificar(Personaje personaje);
	void borrar(Personaje personaje);
	Personaje buscar(Personaje personaje);
	List<Personaje> listar();
	
}
