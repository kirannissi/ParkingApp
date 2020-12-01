package parking;

public class Motorcycle extends Vehicle {

	public Motorcycle() {
		// TODO Auto-generated constructor stub
	}
	
	public Motorcycle(String rego, String brand, String model, String color) {
		super(rego, brand, model, color);
		// TODO Auto-generated constructor stub
	}

	public double pay() {
		Parking parking = Parking.instance();
		double remaining = parking.remainingTime();
	
		double price = (remaining*0.5)*0.24;
		return price;
	}

}
