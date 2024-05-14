/**
 * 
 */
package spring.thymeleaf.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import common.beans.Attendance;
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
	
	@PostMapping("/attendance/mark")
	public String markAttendance(@ModelAttribute("employee") Employee employee, @ModelAttribute("date") String date, Model model) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-YYYY", Locale.ENGLISH);
		try {
			Date attendanceDate = formatter.parse(date);
			Attendance attendance = attendanceService.markAttendance(employee, attendanceDate);
			List<Attendance> attendances = new ArrayList<Attendance>();
			attendances.add(attendance);
			model.addAttribute("attendances", attendances);
			model.addAttribute("employee", employee);
		} catch (ParseException e) {
		}
		return "attendance";
	}
	
	@GetMapping("/attendance/view")
	public String viewAttendance(@ModelAttribute("employee") Employee employee, Model model) {
		List<Attendance> attendances = attendanceService.findAllAttendanceOfEmployee(employee);
		model.addAttribute("attendances", attendances);
		model.addAttribute("employee", employee);
		return "attendance";
	}
}
