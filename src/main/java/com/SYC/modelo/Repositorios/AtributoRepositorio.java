package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SYC.modelo.entidad.Atributo;
import com.SYC.modelo.persistencia.AtributoDao;

@Controller
@RequestMapping(value="/Atributo")
public class AtributoRepositorio implements AtributoDao{
	@Autowired MongoTemplate mongot;

	
	@Override
	@RequestMapping(value="/insertar",method=RequestMethod.POST)
	public void insertar(Atributo atributo) {
		mongot.save(atributo, "Atributo");
		
	}

	@Override
	@RequestMapping(value="/borrar",method=RequestMethod.PUT)
	public void borrar(Atributo atributo) {
		mongot.remove(atributo, "Atributo");
		
	}

	@Override
	@RequestMapping(value="/listar",method=RequestMethod.GET)
	public List<Atributo> listar() {
		return mongot.findAll(Atributo.class, "Atributo") ;
	}

	@Override
	@RequestMapping(value="/modificarNombre",method=RequestMethod.PUT)
	public void modificarNombre(Atributo atributo, String nombre) {
		atributo.setNombre(nombre);
		mongot.save(atributo, "Atributo");
	}

	@Override
	@RequestMapping(value="/modificarValor",method=RequestMethod.PUT)
	public void modificarValor(Atributo atributo, Integer valor) {
		atributo.setValor(valor);
		mongot.save(atributo, "Atributo");
	}

	@Override
	@RequestMapping(value="/crear",method=RequestMethod.POST)
	public void crear(String nombre, Integer valor) {
		Atributo atributo = new Atributo(nombre, valor);
		this.insertar(atributo);
	}

}
