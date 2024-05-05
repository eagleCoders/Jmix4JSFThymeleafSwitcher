package spring.thymeleaf.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import common.beans.Employee;
import spring.thymeleaf.repositories.EmployeeRepository;

/**
 * 
 */
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	/**
	 * 
	 * @return
	 */
	public List<Employee> findAllEmployees(){
		return employeeRepository.findAll();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Employee findEmployeeById(UUID id) {
		return employeeRepository.findEmployeeById(id);
	}
	
	/**
	 * 
	 * @param employee
	 */
	public void modifyEmployee(Employee employee) {
		employeeRepository.saveAndFlush(employee);
	}
	
	/**
	 * 
	 * @param employee
	 */
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}
}
