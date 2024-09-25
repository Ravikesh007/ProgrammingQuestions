package primary_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Baby 
{
	/**
	 * @Qualifier is used to specify the specific bean to IOC container , when there is multiple 
	 * 		matching beans in single unit.
	 * @Qualifier has more priority then @primary annotation.
	 * Eg:- whenever we have multiple implementing classes for an interface, we have to instantiate the
	 * 		specific implementing class object. we use @qualifier annotation
	 */
	@Autowired
	@Qualifier("vanilla")  
	IceCream cream;
	// IOC will not create object of interface, it will create object of implemented class
	// internally upcasting is performed.
	
	public void eat()
	{
		System.out.println("baby is eating icecream");
		cream.taste();
		System.out.println("baby stopped crying");
	}
}
