package Ejercicio1;

public class Stringdos {
	public static void main(String[] args) {
		Stringdos manipulator = new Stringdos();
		char letter = 'n';
		int a = manipulator.getIndexOrNull("Coding", letter);
		int b = manipulator.getIndexOrNull("Hola Mundo", letter);
		int c = manipulator.getIndexOrNull("Saludar", letter);
		System.out.println(a); // 4
		System.out.println(b); // 7
		System.out.println(c); // -1

	}
	//Acá llamo al metodo getIndexOrNull que no estaba definido
    public int getIndexOrNull(String str, char c) {
        int index = str.indexOf(c);
        return index;
    }

}
