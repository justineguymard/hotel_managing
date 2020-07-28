package fr.inti.service;

import java.util.List;

import fr.inti.entities.Equipment;

public interface IEquipmentService {
	
	
	public List<Equipment> getAllEquipments();
	
	public Equipment addEquipment (Equipment equipment);
	
	public Equipment getEquipmentById (int id);
	
	public Equipment updateEquipment (Equipment equipment);
	
	public void deleteEquipment (int id);
	

}
