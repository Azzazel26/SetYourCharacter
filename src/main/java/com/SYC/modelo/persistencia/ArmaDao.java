package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.entidad.Arma;

public interface ArmaDao {
	
	void crear();
	void insertar(Arma arma);
	void modificarNombre(Arma arma, String nombre);
	void modificarDaño(Arma arma, String daño);
	void modificarPeso(Arma arma, Integer peso);
	void modificarTipo(Arma arma, String tipo);
	void borrar(Arma arma);
	List<Arma> listar();
	
}
