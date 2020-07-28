package fr.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.inti.entities.Room;

@Repository
public interface IRoomDao extends JpaRepository<Room, Integer>{

}
