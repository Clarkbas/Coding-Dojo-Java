package Telefonos;

public class PhoneTest {
	
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Version", "Ring Ring Ring!");
		IPhone iphoneTen = new IPhone ("x", 100, "AT&T", "Zing");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iphoneTen.displayInfo();
		System.out.println(iphoneTen.ring());
		System.out.println(iphoneTen.unlock());
	}
	

}
