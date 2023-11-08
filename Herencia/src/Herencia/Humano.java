package Herencia;

public class Humano extends Mamifero {
	

	public String rut;
	
	
	
	public Humano(String rut) {
		this.rut = rut;
	}
	
	public Humano() {
		
	}

	public String getrut(){
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	
}
