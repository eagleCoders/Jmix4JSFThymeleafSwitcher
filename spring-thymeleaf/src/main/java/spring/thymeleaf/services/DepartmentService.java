/**
 * 
 */
package spring.thymeleaf.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import common.beans.Department;
import spring.thymeleaf.repositories.DepartmentRepository;

/**
 * 
 */
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	/**
	 * 
	 * @return
	 */
	public List<Department> findAllDepartments(){
		return departmentRepository.findAll();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Department findDepartmentById(UUID id) {
		return departmentRepository.findDepartmentById(id);
	}
	
	/**
	 * 
	 * @param department
	 */
	public void modifyDepartment(Department department) {
		departmentRepository.saveAndFlush(department);
	}
	
	/**
	 * 
	 * @param department
	 */
	public void deleteDepartment(Department department) {
		departmentRepository.delete(department);
	}
}
