package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CitizenDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("deva");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Citizen c1 = new Citizen();
		c1.setName("Rani");
		c1.setNationality("Indian");
		c1.setGender("female");
		
		Citizen c2 = new Citizen();
		c2.setName("Ravi");
		c2.setNationality("Indian");
		c2.setGender("male");
		
		Citizen c3 = new Citizen();
		c3.setName("Robin");
		c3.setNationality("African");
		c3.setGender("male");
		
		Aadhar a1 = new Aadhar();
		a1.setAadharnum(63771234);
		a1.setAddress("Boston");
		
		Aadhar a2 = new Aadhar();
		a2.setAadharnum(58691234);
		a2.setAddress("marathahalli");
		
		Aadhar a3 = new Aadhar();
		a3.setAadharnum(52141234);
		a3.setAddress("IndriraNagar");
		
		c1.setAadhar(a1);
		c2.setAadhar(a2);
		c3.setAadhar(a3);
		
		et.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		et.commit();
	}
	
	
}
