package hibernateDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertDataDynamically 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Scanner scn = new Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{
			Student s = new Student();
			System.out.println("Enter ID:");
			int id = scn.nextInt();
			
			System.out.println("EnterName:");
			String name = scn.next();
			
			System.out.println("EnterAge:");
			int age = scn.nextInt();
			
			System.out.println("EnterYOP:");
			int yop = scn.nextInt();
			
			s.setId(id);
			s.setName(name);
			s.setAge(age);
			s.setYop(yop);
			
			et.begin();
			em.persist(s);
			et.commit();
		}
	}
}
