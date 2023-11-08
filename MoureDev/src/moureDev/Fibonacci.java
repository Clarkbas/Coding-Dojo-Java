package moureDev;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 20;

        System.out.println("Secuencia de Fibonacci hasta el término " + n + ":");

        // Llamada a la función para generar la secuencia de Fibonacci
        for (int i = 0; i < n; i++) {
            System.out.print("Posición "+(i + 1)+" : " + fibonacci(i) + "\n");
        }
    }

    // Función para calcular el término n de la secuencia de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}


