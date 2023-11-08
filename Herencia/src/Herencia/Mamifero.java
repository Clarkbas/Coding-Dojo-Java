package Herencia;

public class Mamifero {
	
	private String nombre;
	private int edad;
	private boolean dormir = false;
	
	public Mamifero() {
		
	}
	
	
	public Mamifero (String nombre, int edad, boolean dormir) {
		 
		 this.nombre = nombre;
		 this.edad = edad;
		 this.dormir = dormir;
		 
	 }


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public boolean isDormir() {
		return dormir;
	}


	public void setDormir(boolean dormir) {
		this.dormir = dormir;
	}
	
	public void estaDurmiendo() {
		System.out.println("Estado del sueño " + dormir);
		
	}


	

}
