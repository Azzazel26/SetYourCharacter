package com.SYC.modelo.Repositorios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SYC.modelo.entidad.Deidad;
import com.SYC.modelo.persistencia.DeidadDao;

@Controller
@RequestMapping(value="/Deidad")
public class DeidadRepositorio implements DeidadDao{
	
	@Autowired MongoTemplate mongot;
	
	@Override
	@RequestMapping(value="/insertar",method=RequestMethod.POST)
	public void insertar(Deidad deidad) {
		mongot.save(deidad, "Deidad");
		
	}
	
	@Override
	@RequestMapping(value="/crear",method=RequestMethod.POST)
	public void crear(String nombre, String descripcion){
		Deidad deidad= new Deidad(nombre, descripcion);
		this.insertar(deidad);
	}
	
	@Override
	@RequestMapping(value="/borrar",method=RequestMethod.DELETE)
	public void borrar(Deidad deidad) {
		mongot.remove(deidad, "Deidad");
		
	}

	@Override
	@RequestMapping(value="/modificarNombre",method=RequestMethod.PUT)
	public void modificarNombre(Deidad deidad, String nombre) {
		deidad.setNombre(nombre);
		mongot.save(deidad, "Deidad");
		
	}

	@Override
	@RequestMapping(value="/modificarDescripcion",method=RequestMethod.PUT)
	public void modificarDescripcion(Deidad deidad, String descripcion) {
		deidad.setDescripcion(descripcion);
		mongot.save(deidad, "Deidad");
		
	}

	
}
