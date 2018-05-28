package com.SYC.modelo.entidad;

import org.springframework.data.annotation.Id;

public class Item {
	@Id
	private String nombre;
	private Integer peso;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getPeso() {
		return peso;
	}


	public void setPeso(Integer peso) {
		this.peso = peso;
	}


	public Item(String nombre, Integer peso) {
		this.nombre = nombre;
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Item [nombre=" + nombre + ", peso=" + peso + "]";
	}
	
}
