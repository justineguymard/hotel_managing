package fr.inti.service;

import java.util.List;

import fr.inti.entities.Booking;

public interface IBookingService {
	
	public List<Booking> getAllBookings();
	
	public Booking addBooking (Booking booking);
	
	public Booking getBookingById (int id);
	
	public Booking updateBooking (Booking booking);
	
	public void deleteBooking (int id);
	

}
