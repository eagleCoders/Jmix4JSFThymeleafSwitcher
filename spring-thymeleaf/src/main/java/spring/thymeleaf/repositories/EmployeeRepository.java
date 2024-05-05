package spring.thymeleaf.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import common.beans.Employee;

/**
 * 
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, UUID> {
	
//	@Query("select u from common.beans.Employee u")
//	List<Employee> findAllEmployees();
	
	@Query("select u from common.beans.Employee u where u.id = :id")
	Employee findEmployeeById(@Param("id") UUID id);
	
}
