package Day15Inheritance;

class Device
{
	
	void powerOn() {
		System.out.println("Device is powered on...");
	}
}


class Mobiel extends Device
{
	void call() {
		System.out.println("Calling from mobile...");
	}
	
}

class SmartPhonme extends Mobiel
{
	void browse() {
		
		System.out.println("Browsing internet on smart phone..");
	}
	
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
	
		SmartPhonme phone = new SmartPhonme();
		phone.powerOn(); // Device
		phone.call();	 // Mobiel
		phone.browse();  // SmartPhonme

	}

}
