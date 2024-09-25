package sc_constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company 
{
	int id;
	String name;
	Employee emp;
	
	
	public Company(@Value("102") int id, @Value("Emcure Pharacuticals") String name, @Autowired Employee emp) 
	{
		this.id = id;
		this.name = name;
		this.emp = emp;
	}
	
	
}
