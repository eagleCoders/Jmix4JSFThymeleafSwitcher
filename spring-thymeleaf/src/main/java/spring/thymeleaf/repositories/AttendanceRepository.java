/**
 * 
 */
package spring.thymeleaf.repositories;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import common.beans.Attendance;
import common.beans.Employee;

/**
 * 
 */
@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, UUID> {
	
	@Query("SElECT u from common.beans.Attendance u where u.employee = :employee")
	List<Attendance> findAttendanceByEmployee(@Param("employee")  Employee employee);
	
	@Query("SElECT u from common.beans.Attendance u where u.date = :date")
	List<Attendance> findAttendancebyDate(@Param("date") Date date);
	
	void markAttendance(Employee employee, Date date);
}
