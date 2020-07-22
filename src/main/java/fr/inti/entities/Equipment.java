package fr.inti.entities;

import javax.persistence.ManyToOne;

public class Equipment {
	
	//attributes
	private String name;
	private String datePurchase;
	private boolean isFunctional;
	
	//Associations
	@ManyToOne
	private Room room;

}
