package com.SYC.modelo.persistencia;

import java.util.List;

import com.SYC.modelo.entidad.Arma;
import com.SYC.modelo.entidad.Armadura;
import com.SYC.modelo.entidad.Atributo;
import com.SYC.modelo.entidad.Deidad;
import com.SYC.modelo.entidad.Habilidad;
import com.SYC.modelo.entidad.Item;
import com.SYC.modelo.entidad.Personaje;

 
public interface PersonajeDao{
	void crear(String nombre);
	void insertar(Personaje personaje);
	void modificarNombre(Personaje personaje, String nombre);
	void modificarVida(Personaje personaje, Integer vida);
	void modificarMana(Personaje personaje, Integer mana);
	void modificarRaza(Personaje personaje, String raza);
	void modificarClase(Personaje personaje, String clase);
	void modificarCultura(Personaje personaje, String cultura);
	void modificarReligion(Personaje personaje, Deidad deidad);
	void modificarArmadura(Personaje personaje, List<Armadura> armaduras);
	void modificarArma(Personaje personaje, List<Arma> armas);
	void modificarInventario(Personaje personaje, List<Item> inventario);
	void equiparArma(Personaje personaje, Arma arma);
	void desequiparArma(Personaje personaje, Arma arma);
	void equiparArmadura(Personaje personaje, Armadura armadura);
	void desequiparArmadura(Personaje personaje, Armadura armadura);
	void borrar(Personaje personaje);
	List<Personaje> listar();
	
	
	void anyadirArma(Personaje personaje, Arma arma);
	void borrarArma(Personaje personaje, Arma arma);
	List<Arma> listarArmas(Personaje personaje);
	
	void anyadirArmadura(Personaje personaje, Armadura armadura);
	void borrarArmadura(Personaje personaje, Armadura armadura);
	List<Armadura> listarArmaduras(Personaje personaje);
	
	void anyadirAtributo(Personaje personaje, Atributo atributo);
	void borrarAtributo(Personaje personaje, Atributo atributo);
	List<Atributo> listarAtributos(Personaje personaje);
	
	void anyadirHabilidad(Personaje personaje, Habilidad habilidad);
	void borrarHabilidad(Personaje personaje,Habilidad habilidad);
	List<Habilidad> listarhabilidades(Personaje personaje);

	void eliminarItem(Personaje personaje, Item item);
	void anyadirItem(Personaje personaje, Item item);
	List<Item> listarItem(Personaje personaje);
}
