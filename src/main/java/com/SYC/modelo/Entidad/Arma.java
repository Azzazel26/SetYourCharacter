package com.SYC.modelo.Entidad;

public class Arma extends Item {
	private String nombre;
	private String tipo;
	private String daño;
	
	
	public Arma(String nombre, Integer peso) {
		super(nombre, peso);
		// TODO Auto-generated constructor stub
	}


	public Arma(String nombre, Integer peso, String nombre2, String tipo, String daño) {
		super(nombre, peso);
		nombre = nombre2;
		this.tipo = tipo;
		this.daño = daño;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDaño() {
		return daño;
	}


	public void setDaño(String daño) {
		this.daño = daño;
	}

	
}
