package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.entidad.Habilidad;

public interface HabilidadDao {
	void insertar(Habilidad habilidad);
	void modificar(Habilidad habilidad);
	void borrar(Habilidad habilidad);
	Habilidad buscar(Habilidad habilidad);
	List<Habilidad> listar();
}
