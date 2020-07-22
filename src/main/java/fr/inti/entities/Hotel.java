package fr.inti.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="hotels")
public class Hotel {
	
	//attributes 
	private int id;
	private String name;
	
	//associations
	//One hotel get one address
	//One hotel get at least one rooms or more 
	//One hotel get one director and at least one or more employees
	
	
	//Getters and Setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
