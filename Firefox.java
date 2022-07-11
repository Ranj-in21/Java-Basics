package javaAssignments.week1;

import javaAssignments.week1.Chrome;
public class Firefox {
	float version = 100.2f;
	String name = "Firefox";
	boolean visible = true;
	int year = 2022;
	char logo = 'M';
public void edge() {
		float version =50.1f;
		String name = "Edge";
		System.out.println("Version of the browser is " +version);
		System.out.println("Name of the browser is " +name);
	
	}
public void chrome() {
		float speed = 22.3f;
		System.out.println("Speed of the browser is " +speed);
	
	}
public static void main(String[] args) {
		Firefox browser = new Firefox();
		browser.edge();
		browser.chrome();
		System.out.println("Year is " +browser.year);
		Chrome name = new Chrome();
		name.getName();

	}

}
