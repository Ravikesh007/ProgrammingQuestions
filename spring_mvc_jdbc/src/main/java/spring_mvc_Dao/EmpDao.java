package spring_mvc_Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring_mvc_Entity.Employee;

@Component
public class EmpDao 
{
	@Autowired
	EntityManagerFactory emf;
	
	public void saveEmployee(Employee e)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(e);
		et.commit();
	}
}
