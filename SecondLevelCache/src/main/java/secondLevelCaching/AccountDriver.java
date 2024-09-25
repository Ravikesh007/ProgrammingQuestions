package secondLevelCaching;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AccountDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		AccountCompositeKey composite = new AccountCompositeKey(1,"A");
		AccountCompositeKey composite1 = new AccountCompositeKey(2,"B");
		
		Account ac = new Account();
		ac.setAge(20);
		ac.setMobNub(74815163);
		ac.setComposite(composite);
		
		Account ac1 = new Account();
		ac1.setAge(21);
		ac1.setMobNub(81022922);
		ac1.setComposite(composite1);
		
		et.begin();
		em.persist(ac);
		em.persist(ac1);
		et.commit();
	}
}
