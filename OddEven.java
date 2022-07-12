package javaAssignments.week1;

public class OddEven {
	
	public void oddev(int num1, int num2) {
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

	public static void main(String[] args) {
		OddEven func = new OddEven();
		func.oddev(3256, 4147);
	
	}

}
