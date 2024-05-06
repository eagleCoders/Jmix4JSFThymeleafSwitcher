/**
 * 
 */
package spring.thymeleaf.services;

import java.util.List;
import java.util.UUID;

import common.beans.Employee;

/**
 * 
 */
public interface EmployeeService {

	 List<Employee> findAllEmployees();
	 
	 public Employee findEmployeeById(UUID id);
	 
	 public void saveEmployee(Employee employee);
	 
	 public void deleteEmployee(Employee employee) ;
}
