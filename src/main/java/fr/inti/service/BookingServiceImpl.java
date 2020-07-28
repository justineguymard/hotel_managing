package fr.inti.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.IBookingDao;
import fr.inti.entities.Booking;

@Service
@Transactional
public class BookingServiceImpl implements IBookingService {

	@Autowired
	private IBookingDao bookingDao;
	
	@Override
	public List<Booking> getAllBookings() {
		return bookingDao.findAll();
	}

	@Override
	public Booking addBooking(Booking booking) {
		return bookingDao.save(booking);
	}

	@Override
	public Booking getBookingById(int id) {
		return bookingDao.getOne(id);
	}

	@Override
	public Booking updateBooking(Booking booking) {
		return bookingDao.save(booking);
	}

	@Override
	public void deleteBooking(int id) {
		bookingDao.deleteById(id);
	}

}
