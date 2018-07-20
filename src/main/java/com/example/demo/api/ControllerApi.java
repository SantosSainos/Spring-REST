package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ContactDao;
import com.example.demo.dto.Contact;

/**
 * Controlador que gestiona e total de contacto, como por ID
 * @author Santos Sainos Hdz
 *
 * @version 1.0
 */

@RestController
@RequestMapping("/")
public class ControllerApi {

	@Autowired
	ContactDao contactDao;

	@RequestMapping("contact")
	public List<Contact> getContact() {
		contactDao.init();

		return contactDao.getAll();
	}

	@RequestMapping("/id/{id}")
	public Contact getByID(@PathVariable("id") Integer id) {
		contactDao.init();

		return contactDao.getById(id);
	}

}
