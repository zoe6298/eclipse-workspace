package week6LoopMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeworkCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> car = new HashMap<>();
		
		car.put("Civic", "Honda");
		car.put("CRV", "Honda");
		car.put("Accord", "Honda");
		
		System.out.println("What car you are looking for?");
		Scanner userInput = new Scanner(System.in);
		String vehicle = userInput.nextLine();
		
		for (Map.Entry<String, String> entry: car.entrySet()) {
			if (vehicle.equals(entry.getKey())) {
				System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...", vehicle,entry.getValue());
				break;
			} 
		}

	}

}
