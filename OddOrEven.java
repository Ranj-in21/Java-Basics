package javaAssignments.week1;

public class OddOrEven {
	public static void main(String[] args) {
		
		int num1 = 2358756;
		int num2 = 5214786;
			
		if((num1)%2!=0 && (num2)%2==0) {
			System.out.println("First number is odd");
			
		}
		else if((num1)%2==0 && (num2)%2!=0) {
			System.out.println("Second number is odd");
			
		}
		else if((num1)%2==0 && (num2)%2==0) {
			System.out.println("The given numbers are even");
			
		}
		else  {
			System.out.println("The given numbers are odd");
			
		}
			
	}

}
