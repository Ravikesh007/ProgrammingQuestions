package sc_variableInjection;

import org.springframework.stereotype.Component;

@Component
public class Battery 
{	
	public void work() 
	{
		System.out.println("Double Battery Single Power");
	}
}
