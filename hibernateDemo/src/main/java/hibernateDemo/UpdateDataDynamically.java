package hibernateDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateDataDynamically 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter ID to update");
		int id = scn.nextInt();
		System.out.println("Enter new Name");
		String name = scn.next();
		
		Student s = em.find(Student.class, id);
		s.setName(name);
		
		et.begin();
		em.merge(s);
		et.commit();
	}
}
