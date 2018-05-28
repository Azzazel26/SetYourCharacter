package com.SYC.modelo.entidad;

import org.springframework.data.annotation.Id;

public class Deidad {
	@Id
	private String nombre;
	private String descripcion;
	
	public Deidad(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Deidad(){
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Deidad [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
}
