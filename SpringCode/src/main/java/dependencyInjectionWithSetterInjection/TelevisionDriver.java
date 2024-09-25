package dependencyInjectionWithSetterInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TelevisionDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("core02.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		
		Television tel = (Television) bf.getBean("myTelevision");
		Remote remote = tel.getRemote();
		remote.work();
		
	}
}
