/**
 * 
 */
package spring.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring.thymeleaf.repositories.EmployeeRepository;

/**
 * 
 */
@Controller
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeService;
}
