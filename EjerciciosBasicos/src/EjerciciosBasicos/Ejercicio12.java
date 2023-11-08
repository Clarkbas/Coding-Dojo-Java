package EjerciciosBasicos;

import java.util.ArrayList;

public class Ejercicio12 {
	//Cambiando los Valores del Arreglo
	public static void main(String[] args) {
			int[] arr = { 1, 5, 10, 7, -2 };
		ArrayList<Object> arrResult = new ArrayList<Object>();{


			for (int i = 1; i < arr.length; i++) {
					arrResult.add(arr[i]);
					}
					arrResult.add(0);

					System.out.println(arrResult);


		}
	}

}