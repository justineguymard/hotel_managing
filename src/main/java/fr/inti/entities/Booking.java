package fr.inti.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="bookings")
public class Booking{
	
	
	//attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int reference;
	@Temporal(TemporalType.DATE)
	private Date dateArrival;
	@Temporal(TemporalType.DATE)
	private Date dateDeparture;
	private int nights;
	
	//TODO: add nbadults & nb children here? 

	
//	//Association => One booking for one client, for one room
	@ManyToOne
	@JoinColumn(name="client_id", referencedColumnName="id")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name="room_id", referencedColumnName="id")
	private Room room;
	
	
	
	//Getters & Setters 
		public Date getDateArrival() {
		return dateArrival;
	}
	public void setDateArrival(Date dateArrival) {
		this.dateArrival = dateArrival;
	}
	public Date getDateDeparture() {
		return dateDeparture;
	}
	public void setDateDeparture(Date dateDeparture) {
		this.dateDeparture = dateDeparture;
	}
	public int getNights() {
		return nights;
	}
	public void setNights(int nights) {
		this.nights = nights;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	
	//toString 
	@Override
	public String toString() {
		return "Booking [id=" + id + ", reference=" + reference + ", dateArrival=" + dateArrival + ", dateDeparture="
				+ dateDeparture + ", nights=" + nights + "]";
	}
	
	
	
	
}
