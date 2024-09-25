package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CountryDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Country country1 = new Country();
		country1.setId(1);
		country1.setName("INDIA");
		country1.setPopulation("140 crores");
		
		Country country2 = new Country();
		country2.setId(2);
		country2.setName("USA");
		country2.setPopulation("40 crores");
		
		Country country3 = new Country();
		country3.setId(3);
		country3.setName("RUSSIA");
		country3.setPopulation("20 crores");
		
		PrimeMinister minister1 = new PrimeMinister();
		minister1.setId(1);
		minister1.setName("ModiJ1");
		minister1.setAge(75);
		
		PrimeMinister minister2 = new PrimeMinister();
		minister2.setId(2);
		minister2.setName("JoeBiden");
		minister2.setAge(65);
		
		PrimeMinister minister3 = new PrimeMinister();
		minister3.setId(3);
		minister3.setName("DaniDenials");
		minister3.setAge(35);
		
		country1.setPrimeminister(minister1);
		country2.setPrimeminister(minister2);
		country3.setPrimeminister(minister3);
		
		et.begin();
		em.persist(country1);
		em.persist(country2);
		em.persist(country3);
		em.persist(minister1);
		em.persist(minister2);
		em.persist(minister3);
		et.commit();
	}

}
