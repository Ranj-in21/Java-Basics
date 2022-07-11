package javaAssignments.week1;

public class NegativeToAnyPositive {
	
	public void anyPositive(int num, int a) {
		
		if(num<0) {
			int conv;
			System.out.println(num +" is Negative");
			System.out.println("I wish to convert the number to " +a);
			conv = num+(-num+a);
			System.out.println("Your Positive number:" +conv);
		}

	}
	public static void main(String[] args) {
		NegativeToAnyPositive func = new NegativeToAnyPositive();
		func.anyPositive(-100008, 1258792);
		
	}

}
