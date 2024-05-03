/**
 * 
 */
package spring.thymeleaf.interfaces;

import java.util.Date;
import java.util.List;

import common.beans.Attendance;
import common.beans.Employee;

/**
 * 
 */
public interface AttendanceService {
	
	void markAttendance(Employee employee, Date date);
	List<Attendance> findAttendanceByEmployee(Employee employee);
	List<Attendance> findAttendancebyDate(Date date);
}
