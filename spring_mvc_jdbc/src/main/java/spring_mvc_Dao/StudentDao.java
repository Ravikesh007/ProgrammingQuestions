package spring_mvc_Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring_mvc_Entity.Student0;

@Repository
public class StudentDao 
{
	@Autowired
	EntityManagerFactory emf;
	
	public void saveStudent(Student0 s)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(s);
		et.commit();
		
	}
	
	public List<Student0> fetchAllStudents()
	{
		EntityManager em = emf.createEntityManager();
		Query q = em.createQuery("select s from Student0 s");
		return q.getResultList();
	}
	
	public void deleteStudentById(int id)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student0 s = em.find(Student0.class,id);
		
		et.begin();
		em.remove(s);
		et.commit();
		
	}
}
