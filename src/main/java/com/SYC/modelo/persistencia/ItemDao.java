package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.Entidad.Item;

public interface ItemDao {
	void insertar(Item item);
	void modificar(Item item);
	void borrar(Item item);
	Item buscar(Item item);
	List<Item> listar();
}
