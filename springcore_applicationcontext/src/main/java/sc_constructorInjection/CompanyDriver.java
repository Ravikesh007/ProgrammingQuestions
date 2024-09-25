package sc_constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sc_setterInjection.ClassConfig1;

public class CompanyDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new AnnotationConfigApplicationContext(ClassConfig1.class);
		Company c = (Company) con.getBean("company");
		Employee e = c.emp;
		
		System.out.println(e.id);
		System.out.println(e.name);
		System.out.println(e.role);
		System.out.println("*******************************************************");
		System.out.println(c.id);
		System.out.println(c.name);
	}
}
