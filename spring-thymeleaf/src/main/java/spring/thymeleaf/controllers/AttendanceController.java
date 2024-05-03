/**
 * 
 */
package spring.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring.thymeleaf.interfaces.AttendanceService;

/**
 * 
 */
@Controller
public class AttendanceController {

	@Autowired
	AttendanceService attendanceService;
}
