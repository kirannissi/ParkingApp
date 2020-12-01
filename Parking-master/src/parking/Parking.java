package parking;

import java.util.Date;


public  class Parking {

	private static Parking parking = new Parking();
	private Vehicle [] vehicles;
	private Date [] dateEntry;
	private Date [] dateExit;
	private int temp = 0;


	private Parking() {
		vehicles= new Vehicle[50];
		dateEntry= new Date[50];
		dateExit = new Date[50];

	}

	public static Parking instance() {
		return parking;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public static Parking getParking() {
		return parking;
	}

	public static void setParking(Parking parking) {
		Parking.parking = parking;
	}

	public Vehicle[] getVehicle() {
		return vehicles;
	}

	public void setVehicle(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}

	public Date[] getDateEntry() {
		return dateEntry;
	}

	public void setDateEntry(Date[] dateEntry) {
		this.dateEntry = dateEntry;
	}

	public Date[] getDateExit() {
		return dateExit;
	}

	public void setDateExit(Date[] dateExit) {
		this.dateExit = dateExit;
	}


	public Vehicle[] getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle[] vehicles) {
		this.vehicles = vehicles;
	}

	public void enterVehicle(Vehicle vehicle) {
		for (int i =0; i<vehicles.length; i++) {
			if (vehicles[i] == null) {
				vehicles[i]= vehicle;
				Date date = new Date();
				dateEntry[i] = date;
				System.out.println(date);
				System.out.println(vehicle);	
				break;
			}
		}
	}

	public void exitVehicle(String rego) {
		
		
			for (int i=0; i <vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getRego().equals(rego)) {
					Date date = new Date();
					dateExit[i] = date;
					temp = i;
					System.out.println("Thank you for using kiran's Parking lot");
					break;
				}
				
				if(i == checkVehiclesSize()-1) {
					
					System.out.println("entity not found");}
			}
		
	}


	public void getPrice(String ak) {
		
			for (int i=0; i<vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getRego().equals(ak)) {
					System.out.println(dateExit[i]);
					Vehicle vehicle = getVehicles()[i];
					System.out.println("The price for " + vehicle.getRego() + " is: "+vehicle.pay());
					System.out.println(vehicles[i]);
					break;
				} 
				
			}
		

	}



	public void deleteVehicle(String rego) {
		
			for (int i=0; i<vehicles.length; i++) {
				if (vehicles[i] != null && vehicles[i].getRego().equals(rego)) {
					//vehicles[i] = null;
					dateEntry[i] = null;
					dateExit[i] = null;
					System.out.println("Note:"+vehicles[i].getBrand()
							+" "+vehicles[i].getModel()+ " is leaving from the Kiran Parking lot");
					break;
				}
				
			}
	}

	public long remainingTime () {
		long remaining = 0;
		remaining = ( getDateExit()[temp].getTime()-getDateEntry()[temp].getTime());
		return remaining;
	}

	public int checkVehiclesSize() {
		int count = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if(vehicles[i] != null)
				count ++;
		}
		return count;
	}
}
