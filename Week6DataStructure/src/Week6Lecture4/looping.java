package Week6Lecture4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<Integer> arraylist = new ArrayList<> ();
//		arraylist.add(1);
//		
//		arraylist.add(2);
//		arraylist.add(13);
//		arraylist.add(5);
//		
//		for (int i =0; i < arraylist.size(); i++) {
//			arraylist.get(i);
//		}
//		
//		for (Integer num: arraylist) {
//			System.out.println(num);
//		}
//		//iterator
//		Iterator<Integer> iterator1 = arraylist.iterator();
//		System.out.println("Please give me a number:");
//		Scanner userInput1 = new Scanner(System.in);
		
		HashMap<String, String> vehicle = new HashMap<>();
		vehicle.put("Civic", "Honda");
		vehicle.put("Accord", "Honda");
		vehicle.put("CRV", "Honda");
		System.out.println(vehicle);
		System.out.println("What model you are looking for?");
		Scanner userInput1 = new Scanner(System.in);
		String modelInput = userInput1.nextLine();
		
//		for (Map.Entry<String, String> entry : vehicle.entrySet()){
//			String key = entry.getKey();
//			String value = entry.getValue();
			if (vehicle.containsKey(modelInput)) {
				System.out.printf("Oh, you're looking for a %s? Our %s selection is right over here...",modelInput,vehicle.get(modelInput) );
				}
			
		
		
	}
//	public static void hashmap() {
//		HashMap<String, Integer> hashmap1 = new HashMap<String, Integer>();
//		
//	}

}
