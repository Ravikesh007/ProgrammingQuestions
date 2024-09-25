package secondLevelCaching;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class Account 
{
	@EmbeddedId //@EmbeddedId specifies hibernate the class is a composite key
	private AccountCompositeKey composite;
	
	private int age;
	private long mobNub;
	
	public AccountCompositeKey getComposite() {
		return composite;
	}
	public void setComposite(AccountCompositeKey composite) {
		this.composite = composite;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobNub() {
		return mobNub;
	}
	public void setMobNub(long mobNub) {
		this.mobNub = mobNub;
	}
	
	
	
}
