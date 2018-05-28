package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.entidad.Armadura;

public interface ArmaduraDao {
	void crear(String nombre, Integer peso, String absorcion);
	void insertar(Armadura armadura);
	void borrar(Armadura armadura);
	void modificarAbsorcion(Armadura armadura, String absorcion);
	void modificarNombre(Armadura armadura, String nombre);
	void modificarPeso(Armadura armadura, Integer peso);
	List<Armadura> listar();
	
}
