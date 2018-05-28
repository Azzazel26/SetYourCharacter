package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.entidad.Item;

public interface ItemDao {
	public void insertar(Item item);
	public void borrar(Item item);
	public void modificarNombre(Item item, String nombre);
	public void modificarPeso(Item item, Integer peso);
	public List<Item> listar();
}
