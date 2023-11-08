package com.codingdojo.proyectoclass2;

public class ProyectoTest {

	public static <T> void main(String[] args) {
		//CLASE OBJETO = OPERADOR
		//nombre_clase nombre_variable = new nombre_clase();
		Proyecto pro1 = new Proyecto();
		pro1.setNombre("Proyecto Forge");
		pro1.setDescripcion("Este es un proyecto que..");
		pro1.setInitialCost(100);
		Proyecto pro2 = new Proyecto();
		pro2.setNombre("Proyecto Forge2");
		pro2.setDescripcion("Este es un proyecto que 2..");
		pro2.setInitialCost(200);
		
	
		
		Portafolio portafolio= new Portafolio();
		portafolio.add(pro1);
		portafolio.add(pro2);
		
		portafolio.showPortfolio();
		
	
		
		
		
		
	}

}
