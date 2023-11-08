package Ejercicio1;

public class Pitagoras {
	

	public static void main(String[] args) {
		System.out.println(CalcularHipo(3,4)); 
	}
	public static double CalcularHipo(int catetoA, int catetoB) {
		return Math.sqrt(Math.pow(catetoA, 2)+ Math.pow(catetoB, 2));
		}
	public  double CalcularHipos(int catetoA, int catetoB) {
		return Math.sqrt(Math.pow(catetoA, 2)+ Math.pow(catetoB, 2));
		}
}
