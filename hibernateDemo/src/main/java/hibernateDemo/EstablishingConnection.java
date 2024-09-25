package hibernateDemo;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EstablishingConnection 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("deva");
		System.out.println("Connection Established");
		
	}

}
