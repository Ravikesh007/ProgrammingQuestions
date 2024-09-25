package sc_constructorInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee 
{
	int id;
	String name;
	String role;
	
	public Employee(@Value("101") int id, @Value("Thapar") String name, @Value("Founder") String role)
	{
		this.id = id;
		this.name = name;
		this.role = role;
	}
}
