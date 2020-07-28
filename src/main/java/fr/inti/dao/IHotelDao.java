package fr.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.inti.entities.Hotel;

@Repository
public interface IHotelDao extends JpaRepository<Hotel, Integer>{

}
