package constructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PencilDriver 
{
	public static void main(String[] args) 
	{
		ClassPathResource cpr = new ClassPathResource("constructorInjection.xml");
		BeanFactory bf = new XmlBeanFactory(cpr);
		
		Pencil pencil = (Pencil) bf.getBean("myPencil");
//		Pencil pencil1 = bf.getBean("myPencil",Pencil.class); 
		
		System.out.println(pencil.id);
		System.out.println(pencil.brand);
		System.out.println(pencil.price);
	}
}
