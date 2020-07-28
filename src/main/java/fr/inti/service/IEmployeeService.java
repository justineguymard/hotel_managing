package fr.inti.service;

import java.util.List;

import fr.inti.entities.Employee;

public interface IEmployeeService {
	
	
	public List<Employee> getAllEmployees();
	
	public Employee addEmployee (Employee employee);
	
	public Employee getEmployeeById (int id);
	
	public Employee updateEmployee (Employee employee);
	
	public void deleteEmployee (int id);
	

}
