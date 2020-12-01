package parking;

import java.io.BufferedReader;
//import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kiranTUMMALA
 * 
 *         This is the main class where console inputs will be sent to parking class methods.
 */
public class MainParking {

	public static void main(String[] args) throws IOException {
		Parking park = Parking.instance(); //new singleton object
		Vehicle v; //Polymorph object

		String ch = "v";
		
		
		BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader input3 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader input4 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader input5 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader input6 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader input7 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader input8 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader input9 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader input10 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader input11 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader input12 = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		while (!(ch.equals("3"))) {
			if (park.checkVehiclesSize() == 50) {
				System.out.println("Kiran parking lot is full. No available spaces. Come again later");
				return;
			} 
			int availablePositions = 50 - park.checkVehiclesSize();
			System.out.println("There are " + availablePositions + " available parking spots");
			System.out.println("Tell us what you want to do by pressing the right keys...");
			System.out.println("PRESS 1 - FOR ENTERING NEW CAR\t\t\t"+"PRESS 2 - TO PAY AND EXIT");
			System.out.println("\t\t\tPRESS 3 - TO EXIT PROGRAM");
			ch  = input1.readLine();
			switch (ch) {
			case "1":
				System.out.println("Bring your vehicle in the parking lot");
			
				System.out.println("Press 1 for car & 2 for motorbike");
				String h = input2.readLine();
				while (!h.equals("1") && !h.equals("2")) {
					System.out.println("please provide VALID  argument. 1 for car or 2 for moto");
					h = input3.readLine();
				}
				if (h.equals("2")) {
					v = new Motorcycle();
					System.out.println("Give license plate number for motorbike...");
					String a = input4.readLine();
					v.setRego(a);
					System.out.println("Give motorbike brand...");
					String a3 = input5.readLine();
					v.setBrand(a3);
					System.out.println("Give motorbike model...");
					String a4 = input6.readLine();
					v.setModel(a4);
					System.out.println("Give motorbike color...");
					String a5 = input7.readLine();
					v.setColor(a5);
					park.enterVehicle(v);
					System.out.println("Thank you!!!!!");
					break;
				}
				else if (h.equals("1")) {
					System.out.println("Give license plate number...");
					String a = input8.readLine();
					v = new Car();
					v.setRego(a);
					System.out.println("Give car brand...");
					String a3 = input9.readLine();
					v.setBrand(a3);
					System.out.println("Give car model...");
					String a4 = input10.readLine();
					v.setModel(a4);
					System.out.println("Give car color...");
					String a5 = input11.readLine();
					v.setColor(a5);
					park.enterVehicle(v);
					System.out.println("Thank you!!!!!");
					break;
				} else {
					
				}
			case "2":
				System.out.println("Pay & exit");
				System.out.println("Please give license plate");
				String e = input12.readLine(); 
				park.exitVehicle(e);
				park.getPrice(e);
				park.deleteVehicle(e);
				break;
			case "3":
				System.out.println("EXIT PROGRAM");
				break;
			default:
				System.out.println("You provided wrong input. Hit 3 to exit");
				break;
			}
		}
	}
}

