package EjercicioExcepciones;

import java.util.ArrayList;

public class ListaException {
	
	public static void main(String[] args) {
	
	ArrayList<Object> myList = new ArrayList<Object>();
	
	myList.add("13");
	myList.add("Hola Mundo");
	myList.add(48);
	myList.add("Adios Mundo");
	myList.add(48.5);
	myList.add(123);
	
	
	// try/catch = Se utiliza para capturar y manejar excepciones en Java
	for (Object element : myList) {
	    try {
	        int castedValue = (int) element;
	        System.out.println("Valor int: " + castedValue);
	    } catch (ClassCastException e) {
	        System.out.println("No se puede asignar a int: " + element);
	    }
	}
	
	// Mientras que if/else se utiliza para tomar decisiones basadas en condiciones lógicas
	
	}
}

