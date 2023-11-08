package com.codingdojo.proyectoclass;

public class Proyecto {

	private String nombre;
	private String descripcion;

	public Proyecto() {

	}

	public Proyecto(String nombre) {

		this.nombre = nombre;
	}

	public Proyecto(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

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

	public void elevatorPitch() {

		System.out.println(nombre + ":" + descripcion);
	}

}
