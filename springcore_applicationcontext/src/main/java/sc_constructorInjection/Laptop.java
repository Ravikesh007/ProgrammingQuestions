package sc_constructorInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop 
{
	int id;
	String brand;
	double price;
	
	
	public Laptop(@Value("101")int id, @Value("Asus")String brand, @Value("2300.0")double price) 
	{
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	
	
}
