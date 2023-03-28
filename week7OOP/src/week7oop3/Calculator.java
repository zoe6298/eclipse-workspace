package week7oop3;

public class Calculator {
	
	public static int add(int num1, int num2) {
		return num1 + num2 ;
	}
	public static int substract(int num1, int num2) {
		return num1 - num2 ;
	}
	public static int multiply(int num1, int num2) {
		return num1 * num2 ;
	}
	public static int divide(int num1, int num2) {
		return num1 / num2 ;
	}
	public static int square(int num1) {
		return num1 * num1 ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculator.add(1, 2));
		System.out.println(Calculator.substract(1, 2));
		System.out.println(Calculator.multiply(1, 2));
		System.out.println(Calculator.divide(4, 2));
		System.out.println(Calculator.square(4));
	}

}
