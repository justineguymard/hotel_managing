package fr.inti.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="rooms")
public class Room {
	
	//Attributes 
	private int id;
	private String name;
	private int nbAdults;
	private int nbChildren;
	
	//Associations
	@OneToMany(mappedBy="room" ,fetch=FetchType.EAGER)
	private List<Equipment> listEquipment;
	
	
	//Constructors 
	public Room() {
		super();
	}
	
	//Getters & Setters 
	
	

}
