package secondLevelCaching;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentResultSet 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("select s from Student s");
		List<Student> students = query.getResultList();
		
		for(Student s : students)
		{
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getAge());
			System.out.println("*********************************************");
		}
	}
}
