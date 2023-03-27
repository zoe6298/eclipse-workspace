package week6LoopMap;
import java.util.Scanner;
import java.util.ArrayList;

public class HomeworkNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i=0; i < 5; i++) {
			System.out.println("Please enter a number:");
			Scanner userInput = new Scanner(System.in);
			try {
				Integer number = Integer.parseInt(userInput.nextLine());
				arrayList.add(number);
			} catch(NumberFormatException e) {
				System.out.println("Please enter an interger not string!");
			}
			
			
		}
		
		System.out.println(findSum(arrayList));
		System.out.println(findProduct(arrayList));
		System.out.println(findLargest(arrayList));
		System.out.println(findSmallest(arrayList));

	}
	
	private static int findSum(ArrayList<Integer> arrayList) {
		if (arrayList.size() == 0) return 0;
		int sum = 0;
		for (int number : arrayList) {
			sum += number;
		}
		return sum;
	}
	
	private static int findProduct(ArrayList<Integer> arrayList) {
		if (arrayList.size() == 0) return 0;
		int product = 1;
		for (int number : arrayList) {
			product *= number;
		}
		return product;
	}
	
	private static int findLargest(ArrayList<Integer> arrayList) {
		if (arrayList.size() == 0) return 0;
		int largest = arrayList.get(0);
		for (int number : arrayList) {
			if (number > largest) {
				largest = number;
			}
		}
		return largest;
	}
	
	private static int findSmallest(ArrayList<Integer> arrayList) {
		if (arrayList.size() == 0) return 0;
		int smallest = arrayList.get(0);
		for (int number : arrayList) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	
}
