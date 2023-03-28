package week7oop3;

public class MagicCalculator extends Calculator {
	
	public static int squareRoot(int num1) {
		return (int) Math.sqrt(num1);
	}
	
	public static double sin(int num1) {
		return Math.sin(num1);
	}
	public static double cosine(int num1) {
		return  Math.cos(num1);
	}
	public static double tangent(int num1) {
		return Math.tan(num1);
	}
	public static int factorial(int num1) {
		
		int fact = 1;
		for (int i = 1; i <= num1; i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MagicCalculator.squareRoot(4));
		System.out.println(MagicCalculator.sin(5));
		System.out.println(MagicCalculator.cosine(4));
		System.out.println(MagicCalculator.tangent(4));
		System.out.println(MagicCalculator.factorial(4));
		;
	}

}
