package com.example.demo.dao;

import java.util.List;

import com.example.demo.dto.Contact;

/**
 * Interface que obtiene los datos del usuario.
 * @author Santos Sainos Hern&aacute;ndez
 *
 * @version 1.0
 */

public interface ContactDao {
	/**
	 * Obtiene la lista de todos los contactos
	 * @return Lista de contacto
	 */
	List<Contact>  getAll();
	
	/**
	 * Obtiene usuario en espec&iacute;fico
	 * @param id id de usuario a buscar
	 * @return
	 */
	Contact getById(Integer id);
	
	/**
	 * Inicializa los datos a cargar ===>> simulando acceso a la BD
	 */
	void init();
}
