package javaAssignments.week1;

public class PositiveOrNegative {
		
	public int posOrneg(int num) {
		
		if(num>0) {
			System.out.println("The given number is positive");
			
		}else if(num<0) {
			System.out.println("The given number is negative");
		}
		else
			System.out.println("The given number is neither positive nor negative");
		
		return num;
	}
	public static void main(String[] args) {
		PositiveOrNegative func = new PositiveOrNegative();
		func.posOrneg(0);
		
	}
	
	
	
}
