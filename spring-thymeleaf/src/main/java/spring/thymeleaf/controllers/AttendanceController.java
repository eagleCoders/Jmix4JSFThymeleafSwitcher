/**
 * 
 */
package spring.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.thymeleaf.services.AttendanceService;

/**
 * 
 */
@Controller
@RequestMapping("/attendance")
public class AttendanceController {

	@Autowired
	AttendanceService attendanceService;
	
	@PostMapping("/mark")
	public String markAttendance() {
		return "attendance";
	}
	
	@GetMapping("/view")
	public String viewAttendance() {
		return "attendance";
	}
}
