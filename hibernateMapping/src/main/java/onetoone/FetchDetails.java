package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchDetails 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Country country = em.find(Country.class, 3);
		System.out.println("country name:" + country.getName());
		System.out.println("country population:" + country.getPopulation());
		
		PrimeMinister minister = country.getPrimeminister();
		System.out.println("minister name:" + minister.getName());
		System.out.println("minister age:" + minister.getAge());
	}
}
