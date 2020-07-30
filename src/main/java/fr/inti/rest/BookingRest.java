package fr.inti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.inti.entities.Booking;
import fr.inti.service.IBookingService;

@RestController
@RequestMapping("/booking")
public class BookingRest {
	
	@Autowired
	private IBookingService bookingservice;

	@GetMapping(value="/all", produces= MediaType.ALL_VALUE)
	public List<Booking> getAllBookings(){
		return bookingservice.getAllBookings();
	}
	
	@PostMapping(value="/all", produces= MediaType.ALL_VALUE, consumes=MediaType.ALL_VALUE)
	public Booking addBooking(@RequestBody Booking booking) {
		return bookingservice.addBooking(booking);
	}

}
