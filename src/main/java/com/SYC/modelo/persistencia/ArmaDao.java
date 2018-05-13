package com.SYC.modelo.persistencia;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.SYC.modelo.entidad.Arma;

public interface ArmaDao extends MongoRepository<Arma, String> {
	void insertar(Arma arma);
	void modificar(Arma arma);
	void borrar(Arma arma);
	Arma buscar(Arma arma);
	List<Arma> listar();
}
