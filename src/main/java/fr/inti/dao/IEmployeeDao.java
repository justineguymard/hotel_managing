package fr.inti.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.inti.entities.Employee;

@Repository
public interface IEmployeeDao extends JpaRepository<Employee, Integer>{

}
