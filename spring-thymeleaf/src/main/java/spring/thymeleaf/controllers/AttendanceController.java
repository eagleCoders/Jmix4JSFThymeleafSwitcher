/**
 * 
 */
package spring.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import common.beans.Employee;
import spring.thymeleaf.services.AttendanceService;

/**
 * 
 */
@Controller
public class AttendanceController {

	@Autowired
	AttendanceService attendanceService;
	
	@RequestMapping("/attendance")
	public String attendance() {
		return "attendance";
	}
	
	@PostMapping("/markAttendance")
	public String markAttendance(@ModelAttribute("employee") Employee employee, @ModelAttribute("date") String date) {
		System.out.println("The Employee Name is : "+employee.getName());
		return "attendance";
	}
	
	@GetMapping("/viewAttendance")
	public String viewAttendance(@ModelAttribute("employee") Employee employee) {
		return "attendance";
	}
}
