/**
 * 
 */
package spring.thymeleaf.controllers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import common.beans.Attendance;
import common.beans.Employee;
import spring.thymeleaf.services.AttendanceService;
import spring.thymeleaf.services.EmployeeService;

/**
 * 
 */
@Controller
public class AttendanceController {

	@Autowired
	AttendanceService attendanceService;
	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/attendance")
	public String attendance() {
		return "attendance";
	}

	@GetMapping("/attendance/mark")
	public String markAttendance(@ModelAttribute("empId") String employeeId, Model model) {
		LocalDate localDate = LocalDate.now();
		Date attendanceDate = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());

		Employee employee = employeeService.findEmployeeById(UUID.fromString(employeeId));

		Attendance attendance = attendanceService.markAttendance(employee, attendanceDate);
		List<Attendance> attendances = new ArrayList<Attendance>();
		attendances.add(attendance);
		model.addAttribute("attendances", attendances);
		model.addAttribute("employee", employee);
		return "attendance";
	}

	@GetMapping("/attendance/view")
	public String viewAttendance(@ModelAttribute("empId") String employeeId, Model model) {

		Employee employee = employeeService.findEmployeeById(UUID.fromString(employeeId));

		List<Attendance> attendances = attendanceService.findAllAttendanceOfEmployee(employee);
		model.addAttribute("attendances", attendances);
		model.addAttribute("employee", employee);
		return "attendance";
	}
}
