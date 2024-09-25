package ManyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CollegeDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		College college = new College();
		college.setName("GALGOTIA");
		college.setPrincipal("Sachin");
		
		Student s1 = new Student();
		s1.setName("Ravi");
		s1.setDegree("Btech");
		s1.setStream("ECE");
		s1.setCollege(college);
		
		Student s2 = new Student();
		s2.setName("Rani");
		s2.setDegree("Mtech");
		s2.setStream("EEE");
		s2.setCollege(college);
		
		Student s3 = new Student();
		s3.setName("Raisen");
		s3.setDegree("Bcom");
		s3.setStream("ME");
		s3.setCollege(college);
		
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		college.setStudents(students);
		
		et.begin();
		em.persist(college);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();
	}
}
