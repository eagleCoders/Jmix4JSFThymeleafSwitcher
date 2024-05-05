package spring.thymeleaf.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import common.beans.Department;

/**
 * 
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, UUID> {
	
//	@Query("Select u from common.beans.Department u" )
//	List<Department> findAllDepartments();

	@Query("Select u from common.beans.Department u where u.id = :id")
	Department findDepartmentById(@Param("id") UUID id);
}
