package com.example.demo.dto;

/**
 * Clase que modela la tabal contacto de la BD.
 * 
 * @author Santos Sainos Hdz
 *
 * @version 1.0
 */
public class Contact {
	/**
	 * Id de usuario
	 */
	private long id;

	/**
	 * Nombre de usuario
	 */
	private String firstName;

	/**
	 * Apellido
	 */
	private String lastName;

	/**
	 * Direci&oacute;n de correo
	 */
	private String email;

	public Contact() {
	}

	public Contact(long id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	// ==================================================
	// ==================setters & getters===============
	// =================================================
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
