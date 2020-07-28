package fr.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.inti.entities.Client;

@Repository
public interface IClientDao extends JpaRepository<Client, Integer>{

}
