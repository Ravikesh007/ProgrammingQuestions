package beanDefination;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new AnnotationConfigApplicationContext(ClassConfig.class);
		A a =  (A) con.getBean("a");
		B b = a.b;
		
		b.m1();
	}
}
