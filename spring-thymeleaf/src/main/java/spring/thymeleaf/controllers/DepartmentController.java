/**
 * 
 */
package spring.thymeleaf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import spring.thymeleaf.interfaces.DepartmentServices;

/**
 * 
 */
@Controller
public class DepartmentController {

	@Autowired
	DepartmentServices departmentServices;
}
