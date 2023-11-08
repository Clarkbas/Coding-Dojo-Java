package EjerciciosBasicos;

public class Ejercicio08 {
				//Mayor que Y
	public static void main(String[] args) {
		
		int[] arr = { 1, 3, 5, 7 };
		int y = 3;
		int num = 0;

		for (int i : arr) {
			if (i > y) {
				num++;
			}
		}

		System.out.println("Cantidad de numeros > 3(y): " + num);

	}

}
