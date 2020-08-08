package fr.inti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.inti.entities.Equipment;
import fr.inti.service.IEquipmentService;

@RestController
@RequestMapping("/equipment")
public class EquipmentRest {


	@Autowired
	private IEquipmentService equipmentService;

	@GetMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Equipment> getAllEquipments(){
		return equipmentService.getAllEquipments();
	}
	
	@PostMapping(value="/add", produces= MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Equipment addEquipment (@RequestBody Equipment equipment) {
		return equipmentService.addEquipment(equipment);
	}
	
	@PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Equipment updateEquipment (@RequestBody Equipment equipment) {
		return equipmentService.updateEquipment(equipment);
	}
	
	@GetMapping(value="/find", produces=MediaType.APPLICATION_JSON_VALUE)
	public Equipment getEquipment(@RequestParam("pId") int id) {
		return equipmentService.getEquipmentById(id);
	}
	
	@DeleteMapping (value="/remove/{pId}")
	public void deleteEquipment(@PathVariable("pId") int id) {
		equipmentService.deleteEquipment(id);
	}
	
}
