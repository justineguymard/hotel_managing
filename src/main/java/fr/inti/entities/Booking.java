package fr.inti.entities;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Booking {
	
	
	//attributes
	@Temporal(TemporalType.DATE)
	private Date dateArrival;
	@Temporal(TemporalType.DATE)
	private Date dateDeparture;

	
	//Association => One booking for one client, for one room
	
	
	
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
	
	
}
