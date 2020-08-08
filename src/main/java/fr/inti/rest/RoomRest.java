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

import fr.inti.entities.Room;
import fr.inti.service.IRoomService;

@RestController
@RequestMapping("/room")
public class RoomRest {
	

	@Autowired
	private IRoomService roomService;

	@GetMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Room> getAllRooms(){
		return roomService.getAllRooms();
	}
	
	@PostMapping(value="/add", produces= MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Room addRoom (@RequestBody Room room) {
		return roomService.addRoom(room);
	}
	
	@PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Room updateRoom (@RequestBody Room room) {
		return roomService.updateRoom(room);
	}
	
	@GetMapping(value="/find", produces=MediaType.APPLICATION_JSON_VALUE)
	public Room getRoom(@RequestParam("pId") int id) {
		return roomService.getRoomById(id);
	}
	
	@DeleteMapping (value="/remove/{pId}")
	public void deleteRoom(@PathVariable("pId") int id) {
		roomService.deleteRoom(id);
	}
	

}
