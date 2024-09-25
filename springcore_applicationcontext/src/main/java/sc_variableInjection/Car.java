package sc_variableInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype") //@Scope is used to modify the scope of the bean.
public class Car 
{
	
	/**
	 *@Value is used to provide default values by the programmer to the properties of a POJO class
	 *@Value is used to specify default values.  
	 */
	
	@Value("1")
	int id;
	
	@Value("Laudi")
	String brand;
	
	@Value("100.0")
	double price;
}
