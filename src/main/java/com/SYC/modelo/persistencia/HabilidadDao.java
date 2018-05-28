package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.entidad.Habilidad;

public interface HabilidadDao {
	
	public void crear(String nombre, Integer nivel);
	public void insertar(Habilidad habilidad);
	public void borrar(Habilidad habilidad);
	public void modificarNombre(Habilidad habilidad, String nombre);
	public void modificarNivel(Habilidad habilidad, Integer nivel);
	public List<Habilidad> listar();
}
