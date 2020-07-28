package fr.inti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.inti.dao.IEmployeeDao;
import fr.inti.entities.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDao employeeDao;

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		return employeeDao.getOne(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public void deleteEmployee(int id) {
		employeeDao.deleteById(id);
		
	}

}
