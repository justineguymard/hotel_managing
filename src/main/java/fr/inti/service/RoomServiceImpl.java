package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.IRoomDao;
import fr.inti.entities.Room;

@Service
@Transactional
public class RoomServiceImpl implements IRoomService{
	
	@Autowired
	private IRoomDao roomDao;

	@Override
	public List<Room> getAllRooms() {
		return roomDao.findAll();
	}

	@Override
	public Room addRoom(Room room) {
		return roomDao.save(room);
	}

	@Override
	public Room getRoomById(int id) {
		return roomDao.getOne(id);
	}

	@Override
	public Room updateRoom(Room room) {
		return roomDao.save(room);
	}

	@Override
	public void deleteRoom(int id) {
		roomDao.deleteById(id);
	}
	
	

}
