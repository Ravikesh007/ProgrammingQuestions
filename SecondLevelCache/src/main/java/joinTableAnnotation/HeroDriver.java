package joinTableAnnotation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HeroDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev"); 
	}
}
