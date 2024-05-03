package spring.thymeleaf.interfaces;

import java.util.List;

import common.beans.Department;

/**
 * 
 */
public interface DepartmentServices {
	
	List<Department> findAllDepartments();
	Department findDepartmentById(int id);
	void saveDepartment(Department department);
	void updateDepartment(Department department);
	void deleteDepartment(Department department);
}
