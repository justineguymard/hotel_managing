package fr.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rooms")
public class Room implements Serializable {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int nbAdults;
	private int nbChildren;

	// Associations
	//One room have a list of equipments
	@OneToMany(mappedBy = "room", fetch = FetchType.EAGER)
	private List<Equipment> listEquipment;
	
	//One room is in One hotel
	@ManyToOne
	@JoinColumn(name="hotel_id", referencedColumnName="id")
	private Hotel hotel;
	
	//One room can be in different bookings
	@OneToMany(mappedBy="room")
	private List<Booking> listBookings;
	
	//Photos of room
	@OneToMany(mappedBy="room")
	private List<Photo> listPhotos;
	
	
	

	// Constructors
	public Room() {
		super();
	}
	
	
	// Getters & Setters
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

	public int getNbAdults() {
		return nbAdults;
	}

	public void setNbAdults(int nbAdults) {
		this.nbAdults = nbAdults;
	}

	public int getNbChildren() {
		return nbChildren;
	}

	public void setNbChildren(int nbChildren) {
		this.nbChildren = nbChildren;
	}



}
