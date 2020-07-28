package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.IHotelDao;
import fr.inti.entities.Hotel;

@Service
@Transactional
public class HotelServiceImpl implements IHotelService {
	
	@Autowired
	private IHotelDao hotelDao;

	@Override
	public List<Hotel> getAllHotels() {
		return hotelDao.findAll();
	}

	@Override
	public Hotel addHotel(Hotel hotel) {
		return hotelDao.save(hotel);
	}

	@Override
	public Hotel getHotelById(int id) {
		return hotelDao.getOne(id);
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		return hotelDao.save(hotel);
	}

	@Override
	public void deleteHotel(int id) {
		hotelDao.deleteById(id);		
	}
	
	
}
