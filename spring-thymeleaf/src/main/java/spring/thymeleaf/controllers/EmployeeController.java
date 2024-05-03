/**
 * 
 */
package spring.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring.thymeleaf.interfaces.EmployeeService;

/**
 * 
 */
@Controller
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
}
