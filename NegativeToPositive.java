package javaAssignments.week1;

public class NegativeToPositive {
	

	public static void main(String[] args) {
		int num = -40;
		int conv;
		if(num<0) {
			System.out.println(num + " is negative");
			conv = num * (-1);
			System.out.println("The positive value is " +conv);
			
		}
		else
			System.out.println(num  +" is positive");

	}

}
