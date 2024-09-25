package secondLevelCaching;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class LoginValidation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email:");
		String email = sc.next();
		System.out.println("Enter Password:");
		String password = sc.next();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("select d from LoginDetail d where d.email=?1 and d.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		
		List<LoginDetail> ld = query.getResultList();
		
		if(ld.size()>0)
		{
			System.out.println("Welcome To Jungle");
		}
		else
		{
			System.out.println("Nikal Laurde....................");
		}
		
	}
}
