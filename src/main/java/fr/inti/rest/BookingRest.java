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

import fr.inti.entities.Booking;
import fr.inti.service.IBookingService;

@RestController
@RequestMapping("/booking")
public class BookingRest {
	
	@Autowired
	private IBookingService bookingService;

	@GetMapping(value="/all", produces= MediaType.ALL_VALUE)
	public List<Booking> getAllBookings(){
		return bookingService.getAllBookings();
	}
	
	@PostMapping(value="/all", produces= MediaType.ALL_VALUE, consumes=MediaType.ALL_VALUE)
	public Booking addBooking(@RequestBody Booking booking) {
		return bookingService.addBooking(booking);
	}
	
	@PutMapping(value="/update", produces= MediaType.ALL_VALUE, consumes=MediaType.ALL_VALUE)
	public Booking updateBooking(@RequestBody Booking booking) {
		return bookingService.updateBooking(booking);
	}
	
	@GetMapping(value="/find", produces=MediaType.ALL_VALUE)
	public Booking getBooking(@RequestParam("pId") int id) {
		return bookingService.getBookingById(id);
	}
	
	@DeleteMapping(value="/remove/{pId}")
	public void deleteBooking (@PathVariable("pId") int id) {
		bookingService.deleteBooking(id);
	}

}
