package Ejercicio1;

public class StringManipulator {
	public static void main(String[] args) {
		
	StringManipulator manipulator = new StringManipulator();
	
	String str = manipulator.trimAndConcat("Hola","Mundo");
	
	System.out.println(str);
	}
	public String trimAndConcat(String s1, String s2) {
		String S1 = s1.trim();
		String S2 = s2.trim();
		return S1.concat(S2);
	}
}