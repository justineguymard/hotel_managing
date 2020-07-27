package fr.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "photos")
public class Photo implements Serializable {

	// attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private String url;
	
	//TODO : voir pour enrregistrer les photos dans une base de données et stocker les liens dans l'attribut de l'objet
	// Associations
	// One Hotel get * (0 or more) photos.

	 @ManyToOne
	 @JoinColumn(name="hotel_id", referencedColumnName="id")
	 private Hotel hotel;
	// //One rooms get * photos.
	 @ManyToOne
	 @JoinColumn(name="room_id", referencedColumnName="id")
	 private Room room;


	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


}
