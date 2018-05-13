package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.entidad.Atributo;

public interface AtributoDao {
	void insertar(Atributo atributo);
	void modificar(Atributo atributo);
	void borrar(Atributo atributo);
	Atributo buscar(Atributo atributo);
	List<Atributo> listar();
}
