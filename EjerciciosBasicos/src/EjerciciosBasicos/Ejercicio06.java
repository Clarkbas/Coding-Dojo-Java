package EjerciciosBasicos;

public class Ejercicio06 {
	// Obtener el Promedio
	public static void main(String[] args) {
		int[] arr = {2,10,3};
		int Total = 0;
		for(int i: arr) {
			System.out.print(i + ",");
				Total += i;
			}
		System.out.println("\nNumero Total: " + Total);
		}

	}


