package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;

import com.SYC.modelo.entidad.Atributo;
import com.SYC.modelo.persistencia.AtributoDao;

@Controller
public class AtributoRepositorio implements AtributoDao{
	@Autowired MongoTemplate mongot;

	@Override
	public void insertar(Atributo atributo) {
		mongot.save(atributo, "Atributo");
		
	}

	@Override
	public void borrar(Atributo atributo) {
		mongot.remove(atributo, "Atributo");
		
	}

	@Override
	public List<Atributo> listar() {
		return mongot.findAll(Atributo.class, "Atributo") ;
	}

	@Override
	public void modificarNombre(Atributo atributo, String nombre) {
		atributo.setNombre(nombre);
		mongot.save(atributo, "Atributo");
	}

	@Override
	public void modificarValor(Atributo atributo, Integer valor) {
		atributo.setValor(valor);
		mongot.save(atributo, "Atributo");
	}

}
