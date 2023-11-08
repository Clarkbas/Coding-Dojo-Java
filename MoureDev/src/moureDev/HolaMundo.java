package moureDev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HolaMundo {

	public static void main(String[] args) {
		System.out.println("Hola, java!");
		
		String myString = "Esto es una cadena de texto";
		myString = "Aqui cambio el valor de la cadena de texto";
		System.out.println(myString);
		
		
		Integer myInt = 7;
		myInt = myInt + 4; // Integer toma numeros enteros
		System.out.println(myInt);
		System.out.println(myInt - 1);
		
		double myDouble = 6.5; //El Double toma decimales 
		System.out.println(myDouble);
		
		float myFloat = 6.5f;
		System.out.println(myFloat);
		
		
		System.out.println(myDouble + " " + myString + " " + myFloat + " " + myInt ); 
		// Al ser numeros decimales ambos lo imprime 
		
		Boolean myBoolean = Boolean.TRUE;
		myBoolean = false;
		System.out.println(myBoolean);
		
		myBoolean = null;
		System.out.println(myBoolean);
		
		/*
        myFloat = null;
        if (myFloat != null) {
            System.out.println(myFloat + 10);
            System.out.println("My Float es distinto de nulo");
        } else {
            System.out.println("My Float es nulo");
        }
		 */
		if(myInt == 11) {
            System.out.println("my Int es 11");
		}else if (myInt == 12) {
            System.out.println("my Int es 12");
		} else {
            System.out.println("El valor no es ni 11 ni 12");
		}
		
		List<String> myList = new ArrayList<String>();
		myList.add(myString);
		myList.add(myInt.toString());
        System.out.println(myString);
        
		
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("String", myString);
		myMap.put("Int", myInt.toString());
        System.out.println(myMap);
        System.out.println(myMap.get("int"));
        
        for(int index = 0; index < myList.size(); index++) {
            System.out.println(myList.get(index));
        }
        
        HolaMundo myMundo = new HolaMundo();
        System.out.println(myMundo.myFunction(5, 2));
        System.out.println(myMundo.myFunction(3, 123));
       
	}	
	public int myFunction(int myfirstNumber, int mySecondNumber) {
		return myfirstNumber + mySecondNumber;
	}

}
		
		


