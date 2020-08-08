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

import fr.inti.entities.Hotel;
import fr.inti.service.IHotelService;

@RestController
@RequestMapping("/hotel")
public class HotelRest {

	@Autowired
	private IHotelService hotelService;

	@GetMapping(value="/liste", produces = MediaType.ALL_VALUE)
	public List<Hotel> getAllHotels(){
		return hotelService.getAllHotels();
	}
	
	@PostMapping(value="/add", produces= MediaType.ALL_VALUE, consumes=MediaType.ALL_VALUE)
	public Hotel addHotel (@RequestBody Hotel hotel) {
		return hotelService.addHotel(hotel);
	}
	
	@PutMapping(value="/update", produces=MediaType.ALL_VALUE, consumes = MediaType.ALL_VALUE)
	public Hotel updateHotel (@RequestBody Hotel hotel) {
		return hotelService.updateHotel(hotel);
	}
	
	@GetMapping(value="/find", produces=MediaType.ALL_VALUE)
	public Hotel getHotel(@RequestParam("pId") int id) {
		return hotelService.getHotelById(id);
	}
	
	@DeleteMapping (value="/remove/{pId}")
	public void deleteHotel(@PathVariable("pId") int id) {
		hotelService.deleteHotel(id);
	}
	

}
