package fr.inti.entities;

import java.io.Serializable;
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
@Table(name="equipments")
public class Equipment implements Serializable {
	
	//attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date datePurchase;
	private int daysBetweenVerification;
	@Temporal(TemporalType.DATE)
	private Date dateVerification;
	private boolean isFunctional;
	
	
	//Associations
	@ManyToOne
	@JoinColumn(name="room_id", referencedColumnName="id")
	private Room room;
	
	
	
	//Getters & Setters
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
	public Date getDatePurchase() {
		return datePurchase;
	}
	public void setDatePurchase(Date datePurchase) {
		this.datePurchase = datePurchase;
	}
	public int getDaysBetweenVerification() {
		return daysBetweenVerification;
	}
	public void setDaysBetweenVerification(int daysBetweenVerification) {
		this.daysBetweenVerification = daysBetweenVerification;
	}
	public Date getDateVerification() {
		return dateVerification;
	}
	public void setDateVerification(Date dateVerification) {
		this.dateVerification = dateVerification;
	}
	public boolean isFunctional() {
		return isFunctional;
	}
	public void setFunctional(boolean isFunctional) {
		this.isFunctional = isFunctional;
	}
	

	
	
	

}
