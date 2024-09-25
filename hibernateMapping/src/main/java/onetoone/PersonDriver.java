package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person person = new Person();
		person.setName("Ravi");
		person.setAge(22);
		
		PanCard pancard = new PanCard();
		pancard.setPannumber("QWER123");
		pancard.setAddress("OOTY");
		
		person.setPancard(pancard);
		pancard.setPerson(person);
		et.begin();
		em.persist(person);
		em.persist(pancard);
		et.commit();
		
	}
}
