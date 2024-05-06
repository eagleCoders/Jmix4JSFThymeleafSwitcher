/**
 * 
 */
package spring.thymeleaf.services;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import common.beans.Attendance;
import common.beans.Employee;
import jakarta.transaction.Transactional;
import spring.thymeleaf.repositories.AttendanceRepository;

/**
 * 
 */
@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	AttendanceRepository attendanceRepository;
	
	/**
	 * 
	 * @param employee
	 * @return
	 */
	@Override
	@Transactional
	public List<Attendance> findAllAttendanceOfEmployee(Employee employee){
		return attendanceRepository.findAttendanceByEmployee(employee);
	}
	
	
	/**
	 * 
	 * @param date
	 * @return
	 */
	@Override
	@Transactional
	public List<Attendance> findAttendanceByDate(Date date){
		return attendanceRepository.findAttendancebyDate(date);
	}
	
	/**
	 * 
	 * @param attendance
	 */
	@Override
	@Transactional
	public void saveAttendance(Attendance attendance) {
		attendanceRepository.saveAndFlush(attendance);
	}
	
	/**
	 * 
	 * @param employee
	 * @param date
	 */
	@Override
	@Transactional
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
	@Transactional
	public void markAttendance(Employee employee, Date date) {
		Attendance attendance = new Attendance();
		attendance.setEmployee(employee);
		attendance.setDate(date);
		attendance.setTime(new Time(System.currentTimeMillis()));
		
		attendanceRepository.saveAndFlush(attendance);
	}
}
