/**
 * 
 */
package jsf.managed.services;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import common.beans.Attendance;
import common.beans.Employee;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * 
 */
@Stateless
public class AttendanceService {

	@PersistenceContext
	private EntityManager em;

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

		em.persist(attendance);
	}

	/**
	 * 
	 * @param employee
	 * @return
	 */
	public List<Attendance> findAttendanceByEmployee(Employee employee) {
		return em.createQuery("Select a from " + Attendance.class.getName() + " a where a.employee = :employee",
				Attendance.class).setParameter("employee", employee).getResultList();

	}
}
