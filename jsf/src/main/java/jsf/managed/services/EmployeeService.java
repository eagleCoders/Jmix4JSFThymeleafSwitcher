package jsf.managed.services;

import common.beans.Employee;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@Stateless
public class EmployeeService {

	@PersistenceContext
	private EntityManager em;
	
	public List<Employee> findAllEmployees(){
		return em.createQuery("Select e from "+Employee.class.getName()+" e ", Employee.class).getResultList();
	}
}
