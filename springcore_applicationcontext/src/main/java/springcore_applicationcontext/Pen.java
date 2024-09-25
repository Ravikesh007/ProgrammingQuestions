package springcore_applicationcontext;

import org.springframework.stereotype.Component;

/**
 * @component is used to mark a class as a component class.
 * IOC Container creates objects for the component classes.
 * @component annotation is used to specify POJO class to the IOC container.
 * In application Context @component will be used instead of <bean> tag.
 * @component is class level annotation
 */
@Component
public class Pen 
{
	public Pen()
	{
		System.out.println("pen constructor is invoked");
	}
	public void work()
	{
		System.out.println("pen is writing well");
	}
}
