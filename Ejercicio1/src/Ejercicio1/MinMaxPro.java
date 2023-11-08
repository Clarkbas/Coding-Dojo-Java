package Ejercicio1;

import java.util.ArrayList;

public class MinMaxPro {
			//Mínimo, Máximo y Promedio
	ArrayList<Float> MinMaxPro(ArrayList<Integer> arr) {
		float sum = arr.get(0);
		float max = arr.get(0);
		float min = arr.get(0);

		for (int i = 1; i < arr.size(); i++) {
			sum = sum + arr.get(i);
			if (max < arr.get(i)) {
				max = arr.get(i);
			}
			if (min > arr.get(i)) {
				min = arr.get(i);
			}
		}

		ArrayList<Float> retorno = new ArrayList<Float>();
		retorno.add(max);
		retorno.add(min);
		float promedio = sum / arr.size();
		retorno.add(promedio);
		return retorno;
	}

}
