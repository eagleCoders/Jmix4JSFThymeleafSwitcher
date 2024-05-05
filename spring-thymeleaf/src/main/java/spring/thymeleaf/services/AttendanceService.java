/**
 * 
 */
package spring.thymeleaf.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import common.beans.Attendance;
import common.beans.Employee;
import spring.thymeleaf.repositories.AttendanceRepository;

/**
 * 
 */
public class AttendanceService {

	@Autowired
	AttendanceRepository attendanceRepository;
	
	/**
	 * 
	 * @param employee
	 * @return
	 */
	public List<Attendance> findAllAttendanceOfEmployee(Employee employee){
		return attendanceRepository.findAttendanceByEmployee(employee);
	}
}
