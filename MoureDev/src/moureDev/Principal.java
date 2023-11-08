package moureDev;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Hola");
		
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(1, "JG");
		mapa.put(2, "BI");
		mapa.put(3, "BI_2");
		mapa.put(10, "BI_4");
		mapa.put(21, "BI_99");

		
		//obteniendo el set de claves del mapa 
		Set<Integer> claves = mapa.keySet();
		
		for(Integer clave : claves) {
			System.out.println("Clave = " + clave);
			System.out.println("Valor = " + mapa.get(clave));
		}
		
		System.out.println(mapa);
		//mapa.clear
		mapa.remove(0);
		//mapa remueve el indicador que le das (1), (2)...
		System.out.println(mapa);
		mapa.size();
		// cuenta cuantos parametros ahi dentro
		System.out.println(mapa.size());
		// Verdadero o falso
		System.out.println(mapa.containsKey(3));
		// Toma true aunque tenga espacios
		System.out.println(mapa.containsValue("JG       ".trim() ));
		// Validar un mapa 
		System.out.println(mapa.isEmpty()== false);
		// Muestra el conjunto de todas las claves
		System.out.println(mapa.keySet());
		
		// No toma diplicados 
		Set<Integer> set_no_duplicados = new HashSet<Integer>();

		set_no_duplicados.add(1);
		set_no_duplicados.add(2);
		set_no_duplicados.add(4);
		set_no_duplicados.add(10);
		set_no_duplicados.add(10);
		// Mostrando el set
		System.out.println(set_no_duplicados);	
		
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
