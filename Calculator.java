package javaAssignments.week1;

public class Calculator {
	public void add(int a, int b, int c) {
		System.out.println("Addition of 3 numbers:" +(a+b+c));
		
	}
	public void sub(int a, int b) {
		System.out.println("Subtraction of 2 numbers:" +(a-b));
		
	}
	public void mul(double a, double b) {
		System.out.println("Multiplication of 2 numbers:" +(a*b));

	}
	public void div(float a, float b) { 
		System.out.println("Division of 2 numbers:" +(a/b));
	}
	
	public void mod(int a, int b) {
		System.out.println("Remainder of 2 numbers:" +(a%b));

	}
	
	public void mod1(int a, float b) {
		float c = a%b;
		System.out.println("Remainder of 2 numbers:" +c);

	}

	
}
