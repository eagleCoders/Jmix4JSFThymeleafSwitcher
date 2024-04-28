/**
 * 
 */
package jsf.managed.beans;

import jakarta.ejb.EJB;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jsf.managed.services.EmployeeService;

/**
 * 
 */
@Named
@ViewScoped
public class EmployeeBean {

	@EJB
	private EmployeeService employeeService;
}
