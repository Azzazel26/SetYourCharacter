package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.entidad.Atributo;

public interface AtributoDao{
	public void insertar(Atributo atributo);
	public void borrar(Atributo atributo);
	public List<Atributo> listar();
	public void modificarNombre(Atributo atributo, String nombre);
	public void modificarValor(Atributo atributo, Integer valor);
}
