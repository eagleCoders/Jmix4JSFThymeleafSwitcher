/**
 * 
 */
package spring.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring.thymeleaf.repositories.AttendanceRepository;

/**
 * 
 */
@Controller
public class AttendanceController {

	@Autowired
	AttendanceRepository attendanceService;
}
