package spring.thymeleaf.interfaces;

import java.util.List;

import common.beans.Employee;

/**
 * 
 */
public interface EmployeeService {
	
	List<Employee> findAllEmployees();
	Employee findEmployeeById(int id);
	void saveEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(Employee employee);
}
