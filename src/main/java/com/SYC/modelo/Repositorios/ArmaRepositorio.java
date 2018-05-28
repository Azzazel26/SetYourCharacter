package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;

import com.SYC.modelo.entidad.Arma;
import com.SYC.modelo.persistencia.ArmaDao;

@Controller
public class ArmaRepositorio implements ArmaDao {

	@Autowired MongoTemplate mongot;
	@Override
	public void insertar(Arma arma) {
		mongot.save(arma, "Arma");
		
	}

	@Override
	public void borrar(Arma arma) {
		mongot.remove(arma, "Arma");
	}

	@Override
	public List<Arma> listar() {
		List<Arma> list = mongot.findAll(Arma.class, "Arma");
		return list;
	}

	@Override
	public void modificarNombre(Arma arma, String nombre) {
		mongot.remove(arma, "Arma");
		arma.setNombre(nombre);
		insertar(arma);
	}

	@Override
	public void modificarDaño(Arma arma, String daño) {
		arma.setDaño(daño);
		mongot.save(arma, "Arma");
	}

	@Override
	public void modificarPeso(Arma arma, Integer peso) {
		arma.setPeso(peso);
		mongot.save(arma, "Arma");
	}

	@Override
	public void modificarTipo(Arma arma, String tipo) {
		arma.setTipo(tipo);
		mongot.save(arma, "Arma");
	}

}
