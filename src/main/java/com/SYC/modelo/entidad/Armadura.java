package com.SYC.modelo.entidad;

public class Armadura extends Item {
	private String absorcion;
	
	
	
	public Armadura(String nombre, Integer peso, String absorcion) {
		super(nombre, peso);
		this.absorcion = absorcion;
	}
	public String getAbsorcion() {
		return absorcion;
	}
	public void setAbsorcion(String absorcion) {
		this.absorcion = absorcion;
	}
	

	@Override
	public String toString() {
		return "Armadura [nombre"+getNombre()+ "absorcion=" + absorcion + "]";
	}
	
}
