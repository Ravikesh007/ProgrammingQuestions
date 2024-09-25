package hibernateDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = new Student();
		s.setId(5);
		s.setName("Rohan");
		s.setAge(21);
		s.setYop(2020);
		
		et.begin();
		em.merge(s);
		et.commit();
	}

}
