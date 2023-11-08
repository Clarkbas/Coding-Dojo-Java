package Ejercicio1;

import java.util.ArrayList;

public class MaxMinAvgTest {
	public static void main(String[]args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(5);
		numeros.add(10);
		numeros.add(-2);
		MinMaxPro x = new MinMaxPro();
		System.out.println(x.MinMaxPro(numeros));
	}

}
