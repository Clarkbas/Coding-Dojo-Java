package EjerciciosBasicos;

import java.util.ArrayList;

public class Ejercicio10 {
			//Eliminar Números Negativos
	public static void main(String[] args) {
		int[] arr = { 1, 5, 10, -2 };
		ArrayList<Integer> arrPositivo = new ArrayList<Integer>();

		for (int i : arr) {
			if (i > 0) {
				arrPositivo.add(i);
			} else if (i < 0) {
				arrPositivo.add(0);
			}
		}
		System.out.println(arrPositivo);
		

	}

}
