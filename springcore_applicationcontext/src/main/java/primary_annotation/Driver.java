package primary_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new AnnotationConfigApplicationContext(ClassConfig.class);
		Baby b = (Baby) con.getBean("baby");
		b.eat();
	}
}
