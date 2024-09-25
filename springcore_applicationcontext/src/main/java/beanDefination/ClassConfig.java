package beanDefination;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @configuration is used to specify the source of bean definition to IOC container.

@ComponentScan(basePackages = "beanDefination")
public class ClassConfig 
{
	@Bean 
	// @bean is used to get the instance of third party classes.
	// @bean is used to get instance of classes which are not annotated with @Component.
	// @bean is majorly used to get the instance of inbuilt or pre-defined classes.
	public B getB()
	{
		return new B();
	}
}
