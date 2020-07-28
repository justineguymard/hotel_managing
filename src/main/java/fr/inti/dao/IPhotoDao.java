package fr.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.inti.entities.Photo;

@Repository
public interface IPhotoDao extends JpaRepository<Photo, Integer>{

}
