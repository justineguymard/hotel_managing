package fr.inti.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.inti.entities.Employee;
import fr.inti.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeRest {
	

	@Autowired
	private IEmployeeService employeeService;

	@GetMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@PostMapping(value="/add", produces= MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Employee addEmployee (@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@PutMapping(value="/update", produces=MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployee (@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@GetMapping(value="/find", produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@RequestParam("pId") int id) {
		return employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping (value="/remove/{pId}")
	public void deleteEmployee(@PathVariable("pId") int id) {
		employeeService.deleteEmployee(id);
	}
	

}
