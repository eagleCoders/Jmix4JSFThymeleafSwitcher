package jsf.managed.beans;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import common.beans.Attendance;
import common.beans.Employee;
import jakarta.ejb.EJB;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jsf.managed.services.AttendanceService;

/**
 * 
 */
@Named("attendanceBean")
@ViewScoped
public class AttendanceBean {

	@Inject
	FacesContext facesContext;

	@EJB
	private AttendanceService attendanceService;
	
	private Employee selectedEmployee;
	private Date selectedDate;
	private Attendance markAttendance;
	private List<Attendance> attendanceRecords;
	
	public void init() {
	}
	
	
	
	/**
	 * @return the selectedEmployee
	 */
	public Employee getSelectedEmployee() {
		return selectedEmployee;
	}

	/**
	 * @param selectedEmployee the selectedEmployee to set
	 */
	public void setSelectedEmployee(Employee selectedEmployee) {
		this.selectedEmployee = selectedEmployee;
	}

	/**
	 * @return the selectedDate
	 */
	public Date getSelectedDate() {
		return selectedDate;
	}

	/**
	 * @param selectedDate the selectedDate to set
	 */
	public void setSelectedDate(Date selectedDate) {
		this.selectedDate = selectedDate;
	}
		
	/**
	 * @return the markAttendance
	 */
	public Attendance getMarkAttendance() {
		return markAttendance;
	}

	/**
	 * @param markAttendance the markAttendance to set
	 */
	public void setMarkAttendance(Attendance markAttendance) {
		this.markAttendance = markAttendance;
		performAttendance(getSelectedEmployee());
	}

	/**
	 * @return the selectedEmployeeAttendance
	 */
	public List<Attendance> getAttendanceRecords() {
		return getAttendanceByEmployee(getSelectedEmployee());
	}

	/**
	 * @param selectedEmployeeAttendance the selectedEmployeeAttendance to set
	 */
	public void setSelectedEmployeeAttendance(List<Attendance> selectedEmployeeAttendance) {
		this.attendanceRecords = selectedEmployeeAttendance;
	}

	/**
	 * 
	 * @param employee
	 */
	private void performAttendance(Employee employee) {
		attendanceService.markAttendance(employee, Date.from(Instant.now()));
	}
	
	/**
	 * 
	 * @param employee
	 * @return
	 */
	private List<Attendance> getAttendanceByEmployee(Employee employee) {
		return attendanceService.findAttendanceByEmployee(employee);
	}
}
