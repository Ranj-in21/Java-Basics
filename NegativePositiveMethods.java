package javaAssignments.week1;

public class NegativePositiveMethods {

	public void negCallpos(int num) {
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
