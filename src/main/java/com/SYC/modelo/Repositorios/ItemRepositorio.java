package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SYC.modelo.entidad.Item;
import com.SYC.modelo.persistencia.ItemDao;

@Controller
@RequestMapping(value="/Item")
public class ItemRepositorio implements ItemDao{

	@Autowired MongoTemplate mongot;
	
	@Override
	@RequestMapping(value="/insertar",method=RequestMethod.POST)
	public void insertar(Item item) {
		mongot.save(item, "Item");
		
	}
	
	@Override
	@RequestMapping(value="/crear",method=RequestMethod.POST)
	public void crear(String nombre, Integer peso){
		Item item= new Item(nombre, peso);
		this.insertar(item);
	}
	
	@Override
	@RequestMapping(value="/borrar",method=RequestMethod.DELETE)
	public void borrar(Item item) {
		mongot.remove(item, "Item");
		
	}

	@Override
	@RequestMapping(value="/listar",method=RequestMethod.GET)
	public List<Item> listar() {
		return mongot.findAll(Item.class, "Item") ;
	}

	@Override
	@RequestMapping(value="/modificarNombre",method=RequestMethod.PUT)
	public void modificarNombre(Item item, String nombre) {
		item.setNombre(nombre);
		mongot.save(item, "Item");
		
	}

	@Override
	@RequestMapping(value="/modificarPeso",method=RequestMethod.PUT)
	public void modificarPeso(Item item, Integer peso) {
		item.setPeso(peso);
		mongot.save(item, "Item");
		
	}

}
