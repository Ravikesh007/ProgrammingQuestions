package sc_setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new AnnotationConfigApplicationContext(ClassConfig1.class);
		Car c = (Car) con.getBean("car");
		
		Engine e = c.getE();
		e.work();
	}
}
