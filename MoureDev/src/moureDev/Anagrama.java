package moureDev;

import java.util.Arrays;

public class Anagrama {

	public static void main(String[] args) {
		
		String P1 = "aperos";
		String P2 = "sopera";
		
		
		System.out.println(P1);
		System.out.println(P2);
		System.out.println("----------------\n");
		
		if(P1.length() != P2.length()) {
			System.out.println("No es un Anagrama");
		} else {
			
			char[] c1 = P1.toCharArray();
			char[] c2 = P2.toCharArray();
			
			Arrays.sort(c1); // ordena los elementos de un arreglo (array)
			Arrays.sort(c2);
			
			if(Arrays.equals (c1,c2)) { //Equals() se usa para saber si dos objetos son del mismo tipo y tienen los mismos datos.
				System.out.println("Es un Anagrama");
			}else 
				System.out.println("No es un Anagrama");	
		}

	}


}
