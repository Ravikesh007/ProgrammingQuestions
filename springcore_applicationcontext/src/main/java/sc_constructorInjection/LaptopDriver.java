package sc_constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sc_setterInjection.ClassConfig1;

public class LaptopDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new AnnotationConfigApplicationContext(ClassConfig1.class);
		Laptop lap = (Laptop) con.getBean("laptop");
		
		System.out.println(lap.brand);
		System.out.println(lap.id);
		System.out.println(lap.price);
	}
	
}
