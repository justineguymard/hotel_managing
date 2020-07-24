package fr.inti.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	
	//Attributes
	private String country;
	private int postalCode;
	private String city;
	private String street;
	private int number;
	private String furtherInformation;
	
	
	//Constructors
		
	public Address() {
		super();
	}

	
	public Address(String country, int postalCode, String city, String street, int number, String furtherInformation) {
		super();
		this.country = country;
		this.postalCode = postalCode;
		this.city = city;
		this.street = street;
		this.number = number;
		this.furtherInformation = furtherInformation;
	}


	// Getters et Setters 
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getFurtherInformation() {
		return furtherInformation;
	}
	public void setFurtherInformation(String furtherInformation) {
		this.furtherInformation = furtherInformation;
	}
	
	
	

}
