/**
 * 
 */
package spring.thymeleaf.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import common.beans.Department;
import spring.thymeleaf.repositories.DepartmentRepository;

/**
 * 
 */
@Component
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	/**
	 * 
	 * @return
	 */
	@Override
	public List<Department> findAllDepartments(){
		return departmentRepository.findAll();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public Department findDepartmentById(UUID id) {
		return departmentRepository.findDepartmentById(id);
	}
	
	/**
	 * 
	 * @param department
	 */
	@Override
	public void saveDepartment(Department department) {
		departmentRepository.saveAndFlush(department);
	}
	
	/**
	 * 
	 * @param department
	 */
	@Override
	public void deleteDepartment(Department department) {
		departmentRepository.delete(department);
	}
}
