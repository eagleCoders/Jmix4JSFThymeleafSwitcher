/**
 * 
 */
package spring.thymeleaf.services;

import java.util.List;
import java.util.UUID;

import common.beans.Department;

/**
 * 
 */
public interface DepartmentService {

	public List<Department> findAllDepartments();
	
	public Department findDepartmentById(UUID id);
	
	public void saveDepartment(Department department);
	
	public void deleteDepartment(Department department);
}
