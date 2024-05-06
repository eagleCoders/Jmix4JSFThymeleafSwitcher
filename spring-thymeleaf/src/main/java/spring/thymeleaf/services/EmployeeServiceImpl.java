package spring.thymeleaf.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import common.beans.Employee;
import spring.thymeleaf.repositories.EmployeeRepository;

/**
 * 
 */
@Component
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	/**
	 * 
	 * @return
	 */
	@Override
	public List<Employee> findAllEmployees(){
		return employeeRepository.findAll();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Employee findEmployeeById(UUID id) {
		return employeeRepository.findEmployeeById(id);
	}
	
	/**
	 * 
	 * @param employee
	 */
	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.saveAndFlush(employee);
	}
	
	/**
	 * 
	 * @param employee
	 */
	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}
}
