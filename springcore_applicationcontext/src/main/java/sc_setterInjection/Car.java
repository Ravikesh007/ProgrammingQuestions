package sc_setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car 
{
	private Engine e;

	public Engine getE() {
		return e;
	}
	@Autowired
	public void setE(Engine e) {
		this.e = e;
	}
	
	
}
