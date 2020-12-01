package parking;

public abstract  class Vehicle implements payable {
	
	private String rego;
	private String brand;
	private String model;
	private String color;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String rego, String brand, String model, String color ) {
		super();
		this.rego = rego;
		this.brand = brand;
		this.model = model;
		this.color = color;
		
	}

	public String getRego() {
		return rego;
	}

	public void setRego(String rego) {
		this.rego = rego;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [Rego=" + rego + ", brand=" + brand + ", model=" + model + ", color=" + color +"]";
	}

	

	
}
