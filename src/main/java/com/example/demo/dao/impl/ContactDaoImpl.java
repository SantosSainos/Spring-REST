package com.example.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.dao.ContactDao;
import com.example.demo.dto.Contact;

/**
 * Clase que implementa los m&eacute;todos de la interface ContactDao
 * 
 * @author Santos Sainos Hdz
 *
 * @version 1.0
 */

@Component
public class ContactDaoImpl implements ContactDao {

	List<Contact> milista = new ArrayList<Contact>();

	@Override
	public List<Contact> getAll() {
		// TODO Auto-generated method stub
		return milista;
	}

	@Override
	public Contact getById(Integer id) {
		Contact result = new Contact();
		for (Contact tmp : milista) {

			if (tmp.getId() == id) {
				result = tmp;
				break;
			}

		}
		return result;
	}

	@Override
	public void init() {

		Contact persona1 = new Contact(1L, "John", "Doe", "john@gmail.com");
		Contact persona2 = new Contact(2L, "Pedro", "Luis", "pedrol@gmail.com");
		Contact persona3 = new Contact(3L, "Carlos", "Pedro", "Cpedro@gmail.com");
		milista.add(persona1);
		milista.add(persona2);
		milista.add(persona3);

	}

}
