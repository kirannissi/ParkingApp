package parking;

public class Car extends Vehicle {

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String rego, String brand, String model, String color) {
		super(rego, brand, model, color);
		// TODO Auto-generated constructor stub
	}

	public double  pay() {
		Parking parking = Parking.instance();
		double remaining = parking.remainingTime();

		double price = (remaining*2)*0.24;
		return price;
	}

}
