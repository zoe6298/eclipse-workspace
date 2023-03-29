package week6controlflow;

import java.util.Scanner;

public class AsciiChars {
	
	private static int NUMBER_LOWER_RANGE = 48;
	private static int NUMBER_HIGHER_RANGE = 57;
	
	private static int LC_LOWER_RANGE = 97;
	private static int LC_HIGHER_RANGE = 121;	
	
	private static int UC_LOWER_RANGE = 65;
	private static int UC_HIGHER_RANGE = 90;
	
	private static int NON_MAGIC_NUM_MAX = 65;
	private static int POWER_BALL = 75;
	
	public static void printNumbers()
	  { 
	    for (int i = AsciiChars.NUMBER_LOWER_RANGE; i <= AsciiChars.NUMBER_HIGHER_RANGE; i++) {
	    	System.out.println((char) i);
	    }
	  }

	  public static void printLowerCase()
	  {
		  for (int i = AsciiChars.LC_LOWER_RANGE; i <= AsciiChars.LC_HIGHER_RANGE; i++) {
		    	System.out.println((char) i);
		    }
	  }

	  public static void printUpperCase()
	  {
		  for (int i = AsciiChars.UC_LOWER_RANGE; i <= AsciiChars.UC_HIGHER_RANGE; i++) {
		    	System.out.println((char) i);
		    }
	  }
	

	public static void main(String[] args) {
		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		//powerball:
		boolean play = true;
		while(play) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter your name:");
			String name = scanner.next();
			System.out.printf("Hello %s!\n", name);
			
			Scanner scanner1 = new Scanner(System.in);
			System.out.println("Do you want to continue to the interactive portion? (yes, no)");
			String name1 = scanner1.next();
			if (name1.equals("yes") || name1.equals("y")) {
				
			} else {
				
				System.out.println("Please return later to complete the survey");
				play = false;
			}
			
			Scanner scanner2 = new Scanner(System.in);
			System.out.println("What is the name of your favorite pet?");
			String name2 = scanner2.next();
			
			Scanner scanner3 = new Scanner(System.in);
			System.out.println("What is the age of your favorite pet?");
			int name3 = scanner3.nextInt();
			
			Scanner scanner4 = new Scanner(System.in);
			System.out.println("What is your lucky number?");
			int name4 = scanner4.nextInt();
			
			Scanner scanner5 = new Scanner(System.in);
			System.out.println("Do you have a favorite quarterback?  If so what is theri jersey number?");
			int name5 = scanner5.nextInt();
			
			Scanner scanner6 = new Scanner(System.in);
			System.out.println("What is two-digit model year of their car?");
			int name6 = scanner6.nextInt();
			
			Scanner scanner7 = new Scanner(System.in);
			System.out.println("What is the first name of the their favorite actor or actress?");
			String name7 = scanner7.next();
			
			Scanner scanner8 = new Scanner(System.in);
			System.out.println("Enter a random number between 1 and 50");
			int name8 = scanner8.nextInt();
			
			//magic ball
			int magicBall = name5 * name8;
			if (magicBall > POWER_BALL) {
				magicBall = magicBall % POWER_BALL;
			}
			//non-magic numbers
			int num1 = ((int) name2.charAt(3)) % NON_MAGIC_NUM_MAX;
			int num2 = (name6 + name4) % NON_MAGIC_NUM_MAX;
			int num3 = name8 % NON_MAGIC_NUM_MAX;
			int num4 = ((int) name7.charAt(0)) % NON_MAGIC_NUM_MAX;
			int num5 = ((int) name7.charAt(name7.length() - 1)) % NON_MAGIC_NUM_MAX;
			
			System.out.printf("Lottery numbers: %d, %d, %d, %d, %d Magic ball: %d\n", num1, num2, num3, num4, num5, magicBall);
			
			Scanner playAgain = new Scanner(System.in);
			System.out.println("Do you want to generate another set? (yes, no)");
			String playAgainAnswer = scanner.next();
			if (playAgainAnswer.equals("no")) {
				play = false;
				System.out.println("Thank you!");
			}
		}
	}

}
