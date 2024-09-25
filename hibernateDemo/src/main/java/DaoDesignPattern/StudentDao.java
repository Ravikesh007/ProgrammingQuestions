package DaoDesignPattern;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernateDemo.Student;

public class StudentDao 
{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void saveStudent(Student s)
	{
		et.begin();
		em.persist(s);
		et.commit();
	}
	public Student fetchStudentById(int id)
	{
		Student s = em.find(Student.class, id);
		return s ;
	}
	public void deleteStudentById(int id) 
	{
		Student s = em.find(Student.class, id);
		et.begin();
		em.remove(s);
		et.commit();
	}
	public void updateStudentById(Student s) 
	{
		
		et.begin();
		em.merge(s);
		et.commit();
	}
	
}
