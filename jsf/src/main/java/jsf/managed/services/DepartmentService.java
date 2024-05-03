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

	/**
	 * 
	 * @return
	 */
	public List<Department> findAllDepartments(){
		return em.createQuery("select e from "+Department.class.getName()+" e", Department.class).getResultList();
	}
	
	/**
	 * 
	 * @param deptName
	 * @return
	 */
	public Department findDepartByName(String deptName) {
		return em.createQuery("select e from "+Department.class.getName()+" e where e.name = :deptName", Department.class)
				.setParameter("deptName", deptName).getSingleResult();
	}
}
