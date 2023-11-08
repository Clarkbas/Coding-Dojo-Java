package Ejercicio1;

public class StringCuatro {
	
	public static void main(String[] args) {
		StringCuatro manipulator = new StringCuatro();
		String word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
		System.out.println(word); // olmundo

		
	}
	public String concatSubstring(String str1, int init, int fin, String str2) {

		String Str1 = str1.substring(init, fin);

		return Str1.concat(str2);
	}
}
