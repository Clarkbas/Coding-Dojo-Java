package EjerciciosBasicos;

import java.util.ArrayList;

public class Ejercicio11 {
	//Mínimo, Máximo y Promedio
	public static void main(String[] args) {
	ArrayList<Object> arrResult = new ArrayList<Object>();
	int[] arr = { 1, 5, 10, -2 };
	int max = 0;
	int min = 0;
	double suma = 0;
	double promedio = 0;{

	for (int i : arr) {
		if (i > max) {
			max = i;
		} else if (i < min) {
			min = i;
		}
		suma += i;
	}

	promedio = Math.floor(suma / arr.length * 100) / 100;

	arrResult.add(max);
	arrResult.add(min);
	arrResult.add(promedio);

	System.out.println(arrResult);
		}
	}
}
