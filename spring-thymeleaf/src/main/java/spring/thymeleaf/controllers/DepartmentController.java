/**
 * 
 */
package spring.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring.thymeleaf.repositories.DepartmentRepository;

/**
 * 
 */
@Controller
public class DepartmentController {

	@Autowired
	DepartmentRepository departmentServices;
}
