package com.codingdojo.proyectoclass;

public class ProyectoTest {

	public static void main(String[] args) {
		
		Proyecto proyecto1 = new Proyecto();
		proyecto1.elevatorPitch();
		
		Proyecto proyecto2 = new Proyecto("Especial");
		proyecto2.elevatorPitch();
		
		Proyecto proyecto3 = new Proyecto("ProyectClass","este proyecto me peremite generar..");
		proyecto3.elevatorPitch();
		
		

	}

}
