package fr.inti.service;

import java.util.List;

import fr.inti.entities.Hotel;

public interface IHotelService {
	
	
	public List<Hotel> getAllHotels();
	
	public Hotel addHotel (Hotel hotel);
	
	public Hotel getHotelById (int id);
	
	public Hotel updateHotel (Hotel hotel);
	
	public void deleteHotel (int id);
	

}
