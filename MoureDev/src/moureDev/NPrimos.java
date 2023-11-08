package moureDev;

public class NPrimos {
	//Escribe un programa que se encargue de comprobar si un número es o no primo.
	public static void main(String[] args) {
		
        for (int i = 0; i < 100; i++) {
        	if(NPrimos(i)) {
        		System.out.println(i + " (Es primo)");
        	}else {
        		System.out.println(i);
        	}
        }
        
	}
	// numero que no es primo, no tiene nada al lado.
	public static boolean NPrimos(int number) {
	    if (number < 2) {
	        return false;
	    }

	    for (int i = 2; i < number; i++) {
	        if (number % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
