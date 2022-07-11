package javaAssignments.week1;

public class MyMobile {
		String Name = "iphone 11";
		String Color = "Red";
		short InternalStorage = 128;
		long IMEINumber = 002750450;
		byte iOS = 13;
		float DisplayInch = 6.1f;
		char FingerPrint = 'Y';
		boolean DualSim = true;
		
	public void makeCall() {
		String name = "Make a call to beauty salon";
		System.out.println("Hi Alexa," +name);

		}
	public void sendMsg() {
		long mobilenum = 9123456789L;
		System.out.println("Hi Alexa, Send a message to " +mobilenum);
	}	

	private void payBills() {
		double BillAmount = 4524.687;
		System.out.println("Hi Alexa, Pay the amount Rs." +BillAmount);

	}
	public static void main(String[] args) {
		MyMobile func = new MyMobile();
		System.out.println("Hi, This is My Mobile");
		System.out.println("Mobile name:" +func.Name);
		System.out.println("Color:" +func.Color);
		System.out.println("Internal storage in GB:" +func.InternalStorage);
		System.out.println("IMEI Number:" +func.IMEINumber);
		System.out.println("iOS installed:" +func.iOS);
		System.out.println("Display size in inch:" +func.DisplayInch);
		System.out.println("Is there fingerprint sensor? " +func.FingerPrint);
		System.out.println("Does iphone 11 support Dual sim? " +func.DualSim);
		func.makeCall();
		func.sendMsg();
		func.payBills();
	}
}
