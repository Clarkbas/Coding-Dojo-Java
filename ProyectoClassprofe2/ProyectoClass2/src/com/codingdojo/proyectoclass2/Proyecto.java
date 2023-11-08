package com.codingdojo.proyectoclass2;
//nombre de la clase
public class Proyecto {
	
	//atributos
	//private tipo nombre_variable;
	private String nombre;
	private String descripcion;
	private int initialCost;
	
	//metodos o funciones
	
	//metodo constructor, permite instanciar(objeto) la clase Proyecto
	//public nombreClase(){}

	public Proyecto() {
		
	}

	
	
	//metodos set(modificar) de todos los atributos
	//metodo get(obtener) de todos los atributos

	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(int initialCost) {
		this.initialCost = initialCost;
	}
	
	
	

}
