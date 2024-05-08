/**
 * 
 */
package spring.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.thymeleaf.services.DepartmentService;

/**
 * 
 */
@Controller
public class DepartmentController {

	@Autowired
	DepartmentService departmentServices;
	
	@RequestMapping("/department")
	public String getAllDepartments(Model model) {
		model.addAttribute("departments", departmentServices.findAllDepartments());
		return "department";
	}
	
	
}
