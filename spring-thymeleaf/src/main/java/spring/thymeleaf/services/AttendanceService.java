/**
 * 
 */
package spring.thymeleaf.services;

import java.util.Date;
import java.util.List;

import common.beans.Attendance;
import common.beans.Employee;

/**
 * 
 */
public interface AttendanceService {

	public List<Attendance> findAllAttendanceOfEmployee(Employee employee);
	
	public List<Attendance> findAttendanceByDate(Date date);
	
	public Attendance markAttendance(Employee employee, Date date);
	
	public void saveAttendance(Attendance attendance);
	
	public void deleteAttendance(Employee employee, Date date);
	
}
