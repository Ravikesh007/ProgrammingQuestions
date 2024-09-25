package dependencyInjectionWithSetterInjection;

public class Mobile 
{
	private int id;
	private String name;
	private String model;
	
	private Sim s;

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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Sim getS() {
		return s;
	}

	public void setS(Sim s) {
		this.s = s;
	}
	
	
}
