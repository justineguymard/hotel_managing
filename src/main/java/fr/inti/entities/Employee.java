package fr.inti.entities;

public class Employee {
	
	
	//attributes 
	private int id;
	private String function;
	
	//associations
	//An employee works for one hotel only. 
	private Hotel hotel;
	//TODO : IDEA : add a system to manage schedules of employees. Adding day off, like adding working time by day every week's day. 
	//Complexité possible : ajouter un système de répartition des taches : receptionniste, manager des chambres, employes d'étages etc 
	// Employee board avec les chambres libérées à nettoyer, les chambres à nettoyer car louées depuis une semaines (un ménage /semaine). 
	// Les chambres à nettoyer à la demande du client : 
	// Outil de validation lorsque le ménage a été réalisé. 
	
	
	

}
