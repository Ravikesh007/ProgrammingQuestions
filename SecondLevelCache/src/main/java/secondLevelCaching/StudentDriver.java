package secondLevelCaching;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityManager em1 = emf.createEntityManager();
		EntityManager em2 = emf.createEntityManager();
		
//		EntityTransaction et = em.getTransaction();
//		
//		Student s = new Student();
//		s.setId(1);
//		s.setName("Thanos");
//		s.setAge(100);
//		
//		Student s1 = new Student();
//		s1.setId(2);
//		s1.setName("LordStar");
//		s1.setAge(52);
//		
//		Student s2 = new Student();
//		s2.setId(3);
//		s2.setName("IronMan");
//		s2.setAge(45);
//		
//		et.begin();
//		em.persist(s);
//		em.persist(s1);
//		em.persist(s2);
//		et.commit();
		
		em.find(Student.class, 1);
		em.find(Student.class, 2);
		em1.find(Student.class,1);
		em1.find(Student.class, 2);
		em1.find(Student.class, 3);
		System.out.println(em2.find(Student.class, 1));
		em2.find(Student.class, 2);
		
		 
	}
}
