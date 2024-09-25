package sc_variableInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile 
{
	@Autowired  //It is used to achieve automatic dependency injection. 
	Battery bat;					
}
