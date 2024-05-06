/**
 * 
 */
package spring.thymeleaf.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import common.beans.Department;
import jakarta.transaction.Transactional;
import spring.thymeleaf.repositories.DepartmentRepository;

/**
 * 
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	/**
	 * 
	 * @return
	 */
	@Override
	@Transactional
	public List<Department> findAllDepartments(){
		return departmentRepository.findAll();
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	@Override
	@Transactional
	public Department findDepartmentById(UUID id) {
		return departmentRepository.findDepartmentById(id);
	}
	
	/**
	 * 
	 * @param department
	 */
	@Override
	@Transactional
	public void saveDepartment(Department department) {
		departmentRepository.saveAndFlush(department);
	}
	
	/**
	 * 
	 * @param department
	 */
	@Override
	@Transactional
	public void deleteDepartment(Department department) {
		departmentRepository.delete(department);
	}
}
