package com.SYC.modelo.persistencia;

import com.SYC.modelo.entidad.Deidad;

public interface DeidadDao{
	
	public void crear();
	public void insertar(Deidad deidad);
	public void borrar(Deidad deidad);
	public void modificarNombre(Deidad deidad, String nombre);
	public void modificarDescripcion(Deidad deidad, String descripcion);
}
