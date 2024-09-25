package setterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("core01.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		Car c = (Car) bf.getBean("mycar");
		Car c1 = (Car) bf.getBean("mycar1");
		
		 
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPrice());
		
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getPrice());
		
	}
}
