/**
 * 
 */
package spring.thymeleaf.services;

import java.sql.Time;
import java.util.Date;
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
	
	/**
	 * 
	 * @param attendance
	 */
	public void modifyAttendance(Attendance attendance) {
		attendanceRepository.saveAndFlush(attendance);
	}
	
	/**
	 * 
	 * @param employee
	 * @param date
	 */
	public void deleteAttendance(Employee employee, Date date) {
		Attendance attendance = new Attendance();
		attendance.setEmployee(employee);
		attendance.setDate(date);
		
		attendanceRepository.delete(attendance);
	}
	
	
	/**
	 * 
	 * @param employee
	 * @param date
	 */
	public void markAttendance(Employee employee, Date date) {
		Attendance attendance = new Attendance();
		attendance.setEmployee(employee);
		attendance.setDate(date);
		attendance.setTime(new Time(System.currentTimeMillis()));
		
		attendanceRepository.saveAndFlush(attendance);
	}
}
