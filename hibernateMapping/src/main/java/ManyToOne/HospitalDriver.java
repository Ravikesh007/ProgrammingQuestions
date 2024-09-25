package ManyToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Hospital hospital = new Hospital();
		hospital.setName("Apollo");
		hospital.setCeo("Namita Thapar");
		
		Branch branch1 = new Branch();
		branch1.setName("Marathahalli-Apollo");
		branch1.setPincode(560037);
		branch1.setHospital(hospital);
		
		Branch branch2 = new Branch();
		branch2.setName("HAL-Apollo");
		branch2.setPincode(560056);
		branch2.setHospital(hospital);
		
		Branch branch3 = new Branch();
		branch3.setName("SilkBoard-Apollo");
		branch3.setPincode(560095);
		branch3.setHospital(hospital);
		
		et.begin();
		em.persist(hospital);
		em.persist(branch1);
		em.persist(branch2);
		em.persist(branch3);
		et.commit();
		
	}
}
