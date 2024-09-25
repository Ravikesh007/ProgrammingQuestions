package sc_variableInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springcore_applicationcontext.ClassConfig;

public class MobileDriver 
{
	public static void main(String[] args) 
	{
		ApplicationContext con = new AnnotationConfigApplicationContext(ClassConfig.class);
		Mobile m = (Mobile) con.getBean("mobile");
		Battery b = m.bat;
		b.work();
	}
}
