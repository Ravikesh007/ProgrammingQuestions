package hibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity			//@entity annotation is used to mark a class as entity class.
public class Student 
{
	@Id			//@id annotation is used to specify primary key.
				//the column which we want to make primary key the @id annotation is written on top of it.
	private int id;
	private String name;
	private int age;
	private int yop;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public int getYop() 
	{
		return yop;
	}
	public void setYop(int yop) 
	{
		this.yop = yop;
	}
	
}
