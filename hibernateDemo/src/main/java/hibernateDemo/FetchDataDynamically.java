package hibernateDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchDataDynamically 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("EnterID:");
		int id = scn.nextInt();
		
		Student s = em.find(Student.class, id);
		if(s!=null)
		{
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println(s.getYop());
		}else
		{
			System.out.println("Invalid ID Laure");
		}
	}
}
