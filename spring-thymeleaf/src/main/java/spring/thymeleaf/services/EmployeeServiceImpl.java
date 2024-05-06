package spring.thymeleaf.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import common.beans.Employee;
import jakarta.transaction.Transactional;
import spring.thymeleaf.repositories.EmployeeRepository;

/**
 * 
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	/**
	 * 
	 * @return
	 */
	@Override
	@Transactional
	public List<Employee> findAllEmployees(){
		return employeeRepository.findAll();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	@Transactional
	public Employee findEmployeeById(UUID id) {
		return employeeRepository.findEmployeeById(id);
	}
	
	/**
	 * 
	 * @param employee
	 */
	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		employeeRepository.saveAndFlush(employee);
	}
	
	/**
	 * 
	 * @param employee
	 */
	@Override
	@Transactional
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}
}
