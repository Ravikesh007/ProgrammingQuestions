package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="countries")
public class Country 
{
	@Id
	private int id;
	
	@Column(unique = true)
	private String name;
	
	private String population;
	
	@OneToOne          //@onetoone is used to establish one to one realtionship between 2 tables
	private PrimeMinister primeminister;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public PrimeMinister getPrimeminister() {
		return primeminister;
	}

	public void setPrimeminister(PrimeMinister primeminister) {
		this.primeminister = primeminister;
	}
	
	
}
