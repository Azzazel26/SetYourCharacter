package com.SYC.modelo.entidad;

import org.springframework.data.annotation.Id;

public class Atributo {
	@Id
	private String nombre;
	private Integer valor;
	
	
	public Atributo(){
		
	}
	public Atributo(String nombre, Integer valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Atributo [nombre=" + nombre + ", valor=" + valor + "]";
	}
	
}
