package fr.inti.service;

import java.util.List;

import fr.inti.entities.Room;

public interface IRoomService {
	
	
	public List<Room> getAllRooms();
	
	public Room addRoom (Room room);
	
	public Room getRoomById (int id);
	
	public Room updateRoom (Room room);
	
	public void deleteRoom (int id);
	

}
