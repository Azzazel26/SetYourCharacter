package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.Entidad.Personaje;

public interface PersonajeDao{
	
	void insertar(Personaje personaje);
	void modificar(Personaje personaje);
	void borrar(Personaje personaje);
	Personaje buscar(Personaje personaje);
	List<Personaje> listar();
	
}
