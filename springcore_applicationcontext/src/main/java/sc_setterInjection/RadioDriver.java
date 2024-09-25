package sc_setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RadioDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new AnnotationConfigApplicationContext(ClassConfig1.class);
		Radio r = (Radio) con.getBean("radio");
		
		System.out.println(r.getId());
		System.out.println(r.getBrand());
		System.out.println(r.getPrice());    
		
	}
}
