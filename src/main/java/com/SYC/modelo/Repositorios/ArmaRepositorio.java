package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SYC.modelo.entidad.Arma;
import com.SYC.modelo.entidad.Item;
import com.SYC.modelo.persistencia.ArmaDao;

@Controller
@RequestMapping(value="/Arma")
public class ArmaRepositorio implements ArmaDao {

	@Autowired MongoTemplate mongot;
	
	@Override
	@RequestMapping(value="/insertar", method=RequestMethod.POST)
	public void insertar(Arma arma) {
		mongot.save(arma, "Arma");
		
	}

	@Override
	@RequestMapping(value="/borrar", method=RequestMethod.DELETE)
	public void borrar(Arma arma) {
		mongot.remove(arma, "Arma");
	}

	@Override
	@RequestMapping(value="/listarArma", method=RequestMethod.GET)
	public List<Arma> listar() {
		List<Arma> list = mongot.findAll(Arma.class, "Arma");
		return list;
	}

	@Override
	@RequestMapping(value="/modificarNombre", method=RequestMethod.PUT)
	public void modificarNombre(Arma arma, String nombre) {
		mongot.remove(arma, "Arma");
		arma.setNombre(nombre);
		insertar(arma);
	}

	@Override
	@RequestMapping(value="/modificarDaño", method=RequestMethod.PUT)
	public void modificarDaño(Arma arma, String daño) {
		arma.setDaño(daño);
		mongot.save(arma, "Arma");
	}

	@Override
	@RequestMapping(value="/modificarPeso", method=RequestMethod.PUT)
	public void modificarPeso(Arma arma, Integer peso) {
		arma.setPeso(peso);
		mongot.save(arma, "Arma");
	}

	@Override
	@RequestMapping(value="/modificarTipo", method=RequestMethod.PUT)
	public void modificarTipo(Arma arma, String tipo) {
		arma.setTipo(tipo);
		mongot.save(arma, "Arma");
	}

	@Override
	@RequestMapping(value="/crear", method=RequestMethod.POST)
	public void crear(String nombre, Integer peso, String tipo, String daño) {
		Arma arma = new Arma(nombre, peso, tipo, daño);
		this.insertar(arma);
	}

}
