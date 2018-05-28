package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SYC.modelo.entidad.Habilidad;
import com.SYC.modelo.persistencia.HabilidadDao;

@Controller
@RequestMapping(value="/Habilidad")
public class HabilidadRepositorio implements HabilidadDao{

	@Autowired MongoTemplate mongot;
	
	@Override
	@RequestMapping(value="/insertar",method=RequestMethod.POST)
	public void insertar(Habilidad habilidad) {
		mongot.save(habilidad, "Habilidad");
		
	}

	@Override
	@RequestMapping(value="/crear",method=RequestMethod.POST)
	public void crear(String nombre, Integer nivel){
		Habilidad habilidad= new Habilidad(nombre, nivel);
		this.insertar(habilidad);
	}
	
	@Override
	@RequestMapping(value="/borrar",method=RequestMethod.DELETE)
	public void borrar(Habilidad habilidad) {
		mongot.remove(habilidad, "Habilidad");
		
	}

	@Override
	@RequestMapping(value="/listarHabilidad",method=RequestMethod.GET)
	public List<Habilidad> listar() {
		return mongot.findAll(Habilidad.class, "Habilidad");
	}

	@Override
	@RequestMapping(value="/modificarNombre",method=RequestMethod.PUT)
	public void modificarNombre(Habilidad habilidad, String nombre) {
		habilidad.setNombre(nombre);
		mongot.save(habilidad, "Habilidad");
		
	}

	@Override
	@RequestMapping(value="/modificarNivel",method=RequestMethod.PUT)
	public void modificarNivel(Habilidad habilidad, Integer nivel) {
		habilidad.setNivel(nivel);
		mongot.save(habilidad, "Habilidad");
		
	}

}
