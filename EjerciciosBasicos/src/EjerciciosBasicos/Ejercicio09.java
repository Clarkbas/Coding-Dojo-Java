package EjerciciosBasicos;

public class Ejercicio09 {
			//Valores al Cuadrado
	public static void main(String[] args) {
		int x;

	    int [] array  = {1,5,10,-2};
	    for(int i = 0;i < array.length;i++) {
	    	x = (int)(Math.pow(array[i],2));

	        System.out.print(x+",");
	    }
    }
}
