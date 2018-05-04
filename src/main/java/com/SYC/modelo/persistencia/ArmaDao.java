package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.Entidad.Arma;

public interface ArmaDao {
	void insertar(Arma arma);
	void modificar(Arma arma);
	void borrar(Arma arma);
	Arma buscar(Arma arma);
	List<Arma> listar();
}
