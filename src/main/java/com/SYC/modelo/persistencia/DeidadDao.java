package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.entidad.Deidad;

public interface DeidadDao {
	void insertar(Deidad deidad);
	void modificar(Deidad deidad);
	void borrar(Deidad deidad);
	Deidad buscar(Deidad deidad);
	List<Deidad> listar();
}
