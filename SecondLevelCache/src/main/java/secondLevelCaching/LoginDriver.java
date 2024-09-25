package secondLevelCaching;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LoginDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		LoginDetail ld = new LoginDetail();
		ld.setName("Ravi");
		ld.setEmail("qwerty@gmail.com");
		ld.setPassword("7481");
		ld.setAge(21);
		
		LoginDetail ld1 = new LoginDetail();
		ld1.setName("Rani");
		ld1.setEmail("asdf@gmail.com");
		ld1.setPassword("5163");
		ld1.setAge(25);
		
		LoginDetail ld2 = new LoginDetail();
		ld2.setName("Raja");
		ld2.setEmail("zxcv@gmail.com");
		ld2.setPassword("2468");
		ld2.setAge(23);
		
		et.begin();
		em.persist(ld);
		em.persist(ld1);
		em.persist(ld2);
		et.commit();
	}
}
