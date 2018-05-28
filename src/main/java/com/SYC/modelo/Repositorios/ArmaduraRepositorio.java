package com.SYC.modelo.Repositorios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.SYC.modelo.entidad.Armadura;
import com.SYC.modelo.entidad.Item;
import com.SYC.modelo.persistencia.ArmaduraDao;

@RequestMapping(value="/Armadura")
public class ArmaduraRepositorio implements ArmaduraDao {
	
	@Autowired MongoTemplate mongot;
	
	@RequestMapping(value="/insertar",method=RequestMethod.POST)
	@Override
	public void insertar(Armadura armadura) {
		mongot.save(armadura, "Armadura");
		
	}

	@Override
	@RequestMapping(value="/borrar",method=RequestMethod.DELETE)
	public void borrar(Armadura armadura) {
		mongot.remove(armadura, "Armadura");
		
	}

	@Override
	@RequestMapping(value="/listarArmadura",method=RequestMethod.GET)
	public List<Armadura> listar() {
		return mongot.findAll(Armadura.class, "Armadura");
	}

	@Override
	@RequestMapping(value="/modificarAbsorcion",method=RequestMethod.PUT)
	public void modificarAbsorcion(Armadura armadura, String absorcion) {
		armadura.setAbsorcion(absorcion);
		mongot.save(armadura, "Armadura");
		
	}

	@Override
	@RequestMapping(value="/modificarNombre",method=RequestMethod.PUT)
	public void modificarNombre(Armadura armadura, String nombre) {
		armadura.setNombre(nombre);
		mongot.save(armadura, "Armadura");
	}

	@Override
	@RequestMapping(value="/modificarPeso",method=RequestMethod.PUT)
	public void modificarPeso(Armadura armadura, Integer peso) {
		armadura.setPeso(peso);
		mongot.save(armadura, "Armadura");
	}

	@Override
	@RequestMapping(value="/crear",method=RequestMethod.POST)
	public void crear() {
		Armadura armadura=(Armadura) new Item();
		this.insertar(armadura);
	}

}
