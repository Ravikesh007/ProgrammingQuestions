package secondLevelCaching;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class AccountCompositeKey implements Serializable
{	
	private int id;
	private String name;
	public AccountCompositeKey()
	{
		
	}
	public AccountCompositeKey(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() 
	{
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		return super.equals(obj);
		
	}
	
	
	
	
}
