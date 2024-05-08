/**
 * 
 */
package spring.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.thymeleaf.services.DepartmentService;

/**
 * 
 */
@Controller
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentServices;
	
	@GetMapping
	public String getAllDepartments() {
		return "department";
	}
	
	
}
