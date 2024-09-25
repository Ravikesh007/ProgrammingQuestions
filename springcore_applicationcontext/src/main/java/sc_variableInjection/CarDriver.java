package sc_variableInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springcore_applicationcontext.ClassConfig;

public class CarDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac = new AnnotationConfigApplicationContext(ClassConfig.class);
		
		Car c = (Car) ac.getBean("car");
		System.out.println(c.id);
		System.out.println(c.brand);
		System.out.println(c.price);
		System.out.println("************************************************************");
		
		Car c1 = (Car) ac.getBean("car");
		System.out.println(c1.id);
		System.out.println(c1.brand);
		System.out.println(c1.price);
		
		System.out.println(c);
		System.out.println(c1);
	}
}
