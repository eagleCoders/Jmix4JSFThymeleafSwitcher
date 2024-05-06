/**
 * 
 */
package spring.thymeleaf.services;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import common.beans.Attendance;
import common.beans.Employee;
import spring.thymeleaf.repositories.AttendanceRepository;

/**
 * 
 */
@Component
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceRepository attendanceRepository;
	
	/**
	 * 
	 * @param employee
	 * @return
	 */
	@Override
	public List<Attendance> findAllAttendanceOfEmployee(Employee employee){
		return attendanceRepository.findAttendanceByEmployee(employee);
	}
	
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	@Override
	public List<Attendance> findAttendanceByDate(Date date){
		return attendanceRepository.findAttendancebyDate(date);
	}
	
	/**
	 * 
	 * @param attendance
	 */
	@Override
	public void saveAttendance(Attendance attendance) {
		attendanceRepository.saveAndFlush(attendance);
	}
	
	/**
	 * 
	 * @param employee
	 * @param date
	 */
	@Override
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
	@Override
	public void markAttendance(Employee employee, Date date) {
		Attendance attendance = new Attendance();
		attendance.setEmployee(employee);
		attendance.setDate(date);
		attendance.setTime(new Time(System.currentTimeMillis()));
		
		attendanceRepository.saveAndFlush(attendance);
	}
}
