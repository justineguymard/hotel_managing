package fr.inti.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="employees")
public class Employee extends User{
	
	
	//attributes 
	private String function;
	
	//associations
	//An employee works for one hotel only.
	@ManyToOne
	@JoinColumn(name="hotel_id", referencedColumnName="id")
	private Hotel hotel;

	
	//TODO : IDEA : add a system to manage schedules of employees. Adding day off, like adding working time by day every week's day. 
	//Complexité possible : ajouter un système de répartition des taches : receptionniste, manager des chambres, employes d'étages etc 
	// Employee board avec les chambres libérées à nettoyer, les chambres à nettoyer car louées depuis une semaines (un ménage /semaine). 
	// Les chambres à nettoyer à la demande du client : 
	// Outil de validation lorsque le ménage a été réalisé. 
	// IDEA 2 : gestion des payes, calcul des salaires. 
 
	
	//Constructors 
	//Empty 
	public Employee() {
		super();
	}

	//Setters & Getters 



	public String getFunction() {
		return function;
	}


	public void setFunction(String function) {
		this.function = function;
	}
	
	
	
	
	

}
