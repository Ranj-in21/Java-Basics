package javaAssignments.week1;
import javaAssignments.week1.Calculator;
public class MyCalculator {

	public static void main(String[] args) {
		
		System.out.println("Hi, This is my Calculator!");
		Calculator func = new Calculator();
		func.add(255, 96, 77);
		func.sub(27, 100);
		func.mul(855, 754);
		func.div(93.8f, 12.5f);
		func.mod(25, 7);
		func.mod1(250, 7.5f);
		
		
	}

}
