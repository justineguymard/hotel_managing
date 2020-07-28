package fr.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.inti.entities.Equipment;

@Repository
public interface IEquipmentDao extends JpaRepository<Equipment, Integer>{

}
