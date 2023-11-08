package EjerciciosBasicos;

import java.util.ArrayList;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Arreglo con Números Impares
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 1; i <= 255; i++) {
			if (i % 2 != 0) {
				arr.add(i);
			}

		}
		System.out.println(arr);
	}
}

