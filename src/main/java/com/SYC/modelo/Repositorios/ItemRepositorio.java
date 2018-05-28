package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.SYC.modelo.entidad.Item;
import com.SYC.modelo.persistencia.ItemDao;

public class ItemRepositorio implements ItemDao{

	@Autowired MongoTemplate mongot;
	
	@Override
	public void insertar(Item item) {
		mongot.save(item, "Item");
		
	}

	@Override
	public void borrar(Item item) {
		mongot.remove(item, "Item");
		
	}

	@Override
	public List<Item> listar() {
		return mongot.findAll(Item.class, "Item") ;
	}

	@Override
	public void modificarNombre(Item item, String nombre) {
		item.setNombre(nombre);
		mongot.save(item, "Item");
		
	}

	@Override
	public void modificarPeso(Item item, Integer peso) {
		item.setPeso(peso);
		mongot.save(item, "Item");
		
	}

}
