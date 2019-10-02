package vjezba1;

public class Cars {
	
	String name;
	String model;
	int hp;
	int prodYear;
	
	public Cars(String name, String model, int hp, int prodYear) {
		super();
		this.name = name;
		this.model = model;
		this.hp = hp;
		this.prodYear = prodYear;
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

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getProdYear() {
		return prodYear;
	}

	public void setProdYear(int prodYear) {
		this.prodYear = prodYear;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", model=" + model + ", hp=" + hp + ", prodYear=" + prodYear + "]";
	}
	
	
	
	

}
