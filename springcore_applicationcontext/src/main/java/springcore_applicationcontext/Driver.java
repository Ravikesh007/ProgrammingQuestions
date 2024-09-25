package springcore_applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ClassConfig.class);
		Pen p = (Pen) context.getBean("pen");
		Pencil p1 = (Pencil) context.getBean("pencil");
		p.work();
		p1.apsara();
	}
}
