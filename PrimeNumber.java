package javaAssignments.week1;

public class PrimeNumber {
	
public static void main(String[] args) {
	
	int i, n = 13;
	boolean flag = false;
	
	for(i=2; i <= n/2; i++) {
		
		if(n%i==0) {
			flag = true;
			break;
		}
	}
		if(flag==false) {
			System.out.println("13 is a Prime Number");
			
		}else
			System.out.println("13 is Not a Prime Number");
}
}
