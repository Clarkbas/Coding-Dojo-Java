package Ejercicio1;

import java.util.ArrayList;

public class Arreglos {
	
	public static void main(String[]args) {
		ArrayList<String> arreglo = new ArrayList<String>();
		arreglo.add("Bastian");
		arreglo.add("Benja");
		arreglo.add("Marce");
		
		System.out.println(arreglo);
		
		arreglo.remove(1);
		System.out.println(arreglo);
		arreglo.remove(arreglo.size()-1);
		System.out.println(arreglo);
		
		System.out.println(arreglo.contains("Bastian"));
		System.out.println(arreglo.isEmpty());
	}

}
