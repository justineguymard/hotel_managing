package fr.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.inti.entities.Director;

@Repository
public interface IDirectorDao extends JpaRepository<Director, Integer>{

}
