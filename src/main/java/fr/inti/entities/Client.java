package fr.inti.entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class Client extends User {
	
	//attributes 
	//all in User entity
	
	//Association 
	//One client have at least one reservation 
	@OneToMany(mappedBy="client")
	private List<Booking> listBookings;

	//Constructor
	public Client() {
		super();
	}
	
	

	
	

}
