/**
 * 
 */
package jsf.managed.services;

import java.util.List;

import common.beans.Department;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

/**
 * 
 */
@Stateless
public class DepartmentService {

	@PersistenceContext
	private EntityManager em;

	public List<Department> findAllDepartments(){
		return em.createQuery("select e from "+Department.class.getName()+" e", Department.class).getResultList();
	}
}
