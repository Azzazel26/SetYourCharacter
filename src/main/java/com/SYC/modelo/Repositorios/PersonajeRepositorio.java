package com.SYC.modelo.Repositorios;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import org.springframework.stereotype.Repository;

import com.SYC.modelo.entidad.Personaje;
import com.SYC.modelo.persistencia.PersonajeDao;

@Repository
public class PersonajeRepositorio implements PersonajeDao {

	@Autowired private MongoTemplate mongoTemplate;

	@Override
	public void insertar(Personaje personaje) {
		mongoTemplate.save(personaje);
	}

	@Override
	public void modificar(Personaje personaje) {
		Query query= new Query(Criteria.where("nombre").is(personaje.getNombre()));
		Update update = new Update().set("name", personaje);
		mongoTemplate.upsert(query, update, "Personajes");
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
