package fr.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.inti.entities.Booking;

@Repository
public interface IBookingDao extends JpaRepository<Booking, Integer>{

}
