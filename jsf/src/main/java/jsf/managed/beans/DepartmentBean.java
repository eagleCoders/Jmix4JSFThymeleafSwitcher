/**
 * 
 */
package jsf.managed.beans;

import java.util.List;

import common.beans.Department;
import jakarta.ejb.EJB;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jsf.managed.services.DepartmentService;

/**
 * 
 */
@Named("departmentBean")
@ViewScoped
public class DepartmentBean {
	
	@Inject
	FacesContext facesContext;
	
	@EJB
	private DepartmentService departmentService;

	private List<Department> departments;
	
	private Department selectedDepartment;
	
	/**
	 * 
	 */
	public void init() {
		departments = getAllDepartments();
	}
	
	/**
	 * @return the departments
	 */
	public List<Department> getDepartments() {
		return departments;
	}

	/**
	 * @param departments the departments to set
	 */
	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	/**
	 * @return the selectedDepartment
	 */
	public Department getSelectedDepartment() {
		return selectedDepartment;
	}

	/**
	 * @param selectedDepartment the selectedDepartment to set
	 */
	public void setSelectedDepartment(Department selectedDepartment) {
		this.selectedDepartment = selectedDepartment;
	}

	/**
	 * 
	 * @return
	 */
	private List<Department> getAllDepartments(){
		return departmentService.findAllDepartments();
	}
	
	private Department getDepartmentByName(String deptName) {
		return departmentService.findDepartByName(deptName);
	}
	
}
