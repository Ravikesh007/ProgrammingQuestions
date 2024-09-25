package springCore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PenDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("core01.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		
		Pen p = (Pen)bf.getBean("mypen");
		p.work();
	}
}
