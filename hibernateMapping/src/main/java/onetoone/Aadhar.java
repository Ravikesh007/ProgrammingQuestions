package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true) //default value of unique attribute is false
	private long aadharnum;
	@Column(nullable = false)  //default value of nullable attribute is true
	private String address;
	
	@OneToOne(mappedBy = "aadhar")
	private Citizen citizen;
	
	public Citizen getCitizen() {
		return citizen;
	}
	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAadharnum() {
		return aadharnum;
	}
	public void setAadharnum(long aadharnum) {
		this.aadharnum = aadharnum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
