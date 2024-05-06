/**
 * 
 */
package spring.thymeleaf.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import spring.thymeleaf.controllers.AttendanceController;
import spring.thymeleaf.controllers.DepartmentController;
import spring.thymeleaf.controllers.EmployeeController;
import spring.thymeleaf.services.AttendanceService;
import spring.thymeleaf.services.AttendanceServiceImpl;
import spring.thymeleaf.services.DepartmentService;
import spring.thymeleaf.services.DepartmentServiceImpl;
import spring.thymeleaf.services.EmployeeService;
import spring.thymeleaf.services.EmployeeServiceImpl;

/**
 * 
 */

@Configuration
@EnableWebMvc
public class WebConfiguration implements WebMvcConfigurer {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	@Bean
	public AttendanceController attendanceController() {
		return new AttendanceController();
	}

	@Bean
	public DepartmentController departmentController() {
		return new DepartmentController();
	}

	@Bean 
	public EmployeeController employeeController() {
		return new EmployeeController();
	}
	
	@Bean
	public AttendanceService attendanceService() {
		return new AttendanceServiceImpl();
	}
	
	@Bean
	public DepartmentService departmentService() {
		return new DepartmentServiceImpl();
	}
	
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
}
