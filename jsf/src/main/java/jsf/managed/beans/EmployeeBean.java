/**
 * 
 */
package jsf.managed.beans;

import java.util.List;

import common.beans.Employee;
import jakarta.ejb.EJB;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jsf.managed.services.EmployeeService;

/**
 * 
 */
@Named("employeeBean")
@ViewScoped
public class EmployeeBean {
	
	@Inject
	FacesContext facesContext;

	@EJB
	private EmployeeService employeeService;
	
	private List<Employee> employees;
	private Employee selectedEmployee;
	
	/**
	 * 
	 */
	public void init() {
		employees = getAllEmployees();
	}
	
	/**
	 * 
	 * @return
	 */
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	
	/**
	 * 
	 * @param employeeService
	 */
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Employee> getEmployees() {
		return getAllEmployees();
	}
	
	/**
	 * 
	 * @param employees
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	/**
	 * 
	 * @return
	 */
	public Employee getSelectedEmployee(Employee employee) {
		return getEmployeeByName(employee.getName());
	}
	
	/**
	 * 
	 * @param selectedEmployee
	 */
	public void setSelectedEmployee(Employee selectedEmployee) {
		this.selectedEmployee = selectedEmployee;
	}
	
	private Employee getEmployeeByName(String employeeName) {
		return employeeService.findEmployeeByName(employeeName);
	}
	
	private List<Employee> getAllEmployees() {
		return employeeService.findAllEmployees();
	}
	
	
}
