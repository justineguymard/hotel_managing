package fr.inti.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class User {
	
	//attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String surname;
	private String mail;
	private String password;
	
	//Relation
	@Embedded
	@AttributeOverrides ({
		@AttributeOverride(name="country", column= @Column(name="add_country")),
		@AttributeOverride(name="postalCode", column= @Column(name="add_postalCode")),
		@AttributeOverride(name="city", column= @Column(name="add_city")),
		@AttributeOverride(name="street", column= @Column(name="add_street")),
		@AttributeOverride(name="number", column= @Column(name="add_number")),
		@AttributeOverride(name="furtherInformation", column= @Column(name="add_furtherInformation"))
	})
	private Address address;
	
	
	//Getters Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
