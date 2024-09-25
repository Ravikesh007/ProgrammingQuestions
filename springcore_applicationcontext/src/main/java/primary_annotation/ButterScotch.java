package primary_annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
/**
 * @Primary can be used whenever we have multiple matching beans for a single unit.
 * @Primary has less priority tha @Qualifier.
 * @Primary provides first preference for a bean if there is no @qualifier.
 * Eg:- whenever we have multiple implementing classes for an interface , if there is no @qualifier,
 * 		@Primary can be used.
 */
public class ButterScotch implements IceCream
{
	@Override
	public void taste() 
	{
		System.out.println("ButterScotch is Tasty");
	}
	
}
