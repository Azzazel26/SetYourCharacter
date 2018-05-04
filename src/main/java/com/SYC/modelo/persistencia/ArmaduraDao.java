package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.Entidad.Armadura;

public interface ArmaduraDao {
	
	void insertar(Armadura armadura);
	void modificar(Armadura armadura);
	void borrar(Armadura armadura);
	Armadura buscar(Armadura armadura);
	List<Armadura> listar();
}
