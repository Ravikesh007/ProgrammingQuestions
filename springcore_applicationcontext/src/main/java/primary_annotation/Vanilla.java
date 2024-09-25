package primary_annotation;

import org.springframework.stereotype.Component;

@Component
public class Vanilla implements IceCream
{
	@Override
	public void taste() 
	{
		System.out.println("ice cream is tasty");
	}
}
