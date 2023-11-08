package Ejercicio1;

public class StringTres {
	public static void main(String[] args) {
		StringTres manipulator = new StringTres();
		String word = "Hola";
		String subString = "la";
		String notSubString = "mundo";
		int a = manipulator.getIndexOrNull(word, subString);
		int b = manipulator.getIndexOrNull(word, notSubString);
		System.out.println(a); // 2
		System.out.println(b); // -1

	}
	
    public int getIndexOrNull(String str, String sub) {
        int index = str.indexOf(sub);
        return index;
    }
}


