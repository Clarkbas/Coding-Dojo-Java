package EjerciciosBasicos;



public class Ejercicio05 {
	// Encontrar el Máximo
	public static void main(String[] args) {
		
		int[] arr = {-3,-4,-7};
		int maxNum = arr[0];
		for(int i: arr) {
			System.out.print(i + ",");
			if (maxNum < i) {
				maxNum = i;
				
			}
		}
		System.out.println("\nNumero Maximo: " + maxNum);
	}


}
