package OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CompanyDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Company com1 = new Company();
		com1.setName("BharatPe");
		com1.setCeo("Ashneer Grover");
		
		Employee emp1 = new Employee();
		emp1.setName("Ravi");
		emp1.setRole("developer");
		emp1.setExperience(8);
		
		Employee emp2 = new Employee();
		emp2.setName("Sonia");
		emp2.setRole("Tester");
		emp2.setExperience(5);
		
		Employee emp3 = new Employee();
		emp3.setName("Dhania");
		emp3.setRole("clerk");
		emp3.setExperience(6);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		
		com1.setEmployees(employees);
		
		et.begin();
		em.persist(com1);
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		et.commit();
	}
}
