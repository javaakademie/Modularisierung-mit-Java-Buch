package de.javaakademie.hbs.bookings.model;

/**
 * Guest.
 * 
 * @author Guido.Oelmann
 */
public class Guest {

	private String id;

	private String firstname;

	private String lastname;

	private String address;

	public Guest() {
	}

	public Guest(String firstname, String lastname, String address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}