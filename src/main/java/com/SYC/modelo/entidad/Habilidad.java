package com.SYC.modelo.entidad;

import org.springframework.data.annotation.Id;

public class Habilidad {
	@Id
	private String nombre;
	private Integer nivel;
	
	public Habilidad(String nombre, Integer nivel) {
		this.nombre = nombre;
		this.nivel = nivel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	@Override
	public String toString() {
		return "Habilidad [nombre=" + nombre + ", nivel=" + nivel + "]";
	}
	
	
}
