package fr.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="directors")
public class Director extends User implements Serializable {
	
	//attributes all in User class
	
	//associations 
	@OneToOne
	@JoinColumn(name="hotel_id", referencedColumnName="id")
	private Hotel hotel;

	//Constructor
	public Director() {
		super();
	}
	
	
	
	

}
