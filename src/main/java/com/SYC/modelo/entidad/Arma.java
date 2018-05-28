package com.SYC.modelo.entidad;

public class Arma extends Item {
	private String tipo;
	private String daño;
	

	
	
	public Arma(String nombre, Integer peso, String tipo, String daño) {
		super(nombre, peso);
		this.tipo = tipo;
		this.daño = daño;
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


	@Override
	public String toString() {
		return "Arma [nombre=" + super.getNombre() + ", tipo=" + tipo + ", daño=" + daño + "]";
	}

	
}
