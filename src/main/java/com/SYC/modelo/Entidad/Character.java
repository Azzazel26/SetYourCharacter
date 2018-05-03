package com.SYC.modelo.Entidad;


import java.util.List;

public class Character {
	private Integer vida;
	private Integer mana;
	private String nombre;
	private String raza;
	private String clase;
	private String cultura;
	private Deidad religion;
	private List<Atributo> atributos;
	private List<Habilidad> habilidades;
	private List<Armadura> armadura;
	private List<Arma> arma;
	private List<Item> inventario;
	
	
	
	
	public Character(Integer vida, Integer mana, String nombre, String raza, String clase, String cultura,
			Deidad religion, List<Atributo> atributos, List<Habilidad> habilidades, List<Armadura> armadura,
			List<Arma> arma, List<Item> inventario) {
		super();
		this.vida = vida;
		this.mana = mana;
		this.nombre = nombre;
		this.raza = raza;
		this.clase = clase;
		this.cultura = cultura;
		this.religion = religion;
		this.atributos = atributos;
		this.habilidades = habilidades;
		this.armadura = armadura;
		this.arma = arma;
		this.inventario = inventario;
	}
	public Integer getVida() {
		return vida;
	}
	public void setVida(Integer vida) {
		this.vida = vida;
	}
	public Integer getMana() {
		return mana;
	}
	public void setMana(Integer mana) {
		this.mana = mana;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getCultura() {
		return cultura;
	}
	public void setCultura(String cultura) {
		this.cultura = cultura;
	}
	public Deidad getReligion() {
		return religion;
	}
	public void setReligion(Deidad religion) {
		this.religion = religion;
	}
	public List<Atributo> getAtributos() {
		return atributos;
	}
	public void setAtributos(List<Atributo> atributos) {
		this.atributos = atributos;
	}
	public List<Habilidad> getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}
	public List<Armadura> getArmadura() {
		return armadura;
	}
	public void setArmadura(List<Armadura> armadura) {
		this.armadura = armadura;
	}
	public List<Arma> getArma() {
		return arma;
	}
	public void setArma(List<Arma> arma) {
		this.arma = arma;
	}
	public List<Item> getInventario() {
		return inventario;
	}
	public void setInventario(List<Item> inventario) {
		this.inventario = inventario;
	}
	
}
