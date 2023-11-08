package com.codingdojo.proyectoclass2;

import java.util.ArrayList;

public class Portafolio {

	ArrayList<Proyecto> projects = new ArrayList<Proyecto>();

	public Portafolio() {
	}

	public ArrayList<Proyecto> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Proyecto> projects) {
		this.projects = projects;
	}

	public void add(Proyecto pro1) {
		projects.add(pro1);
	}

	public void showPortfolio() {
		// nombre:descripcion: costo
//		for (int i = 0; i < projects.size(); i++) {
//			Proyecto p = projects.get(i);
//			System.out.println(p.getNombre() + ":" + p.getDescripcion() + ":" + p.getInitialCost());
//
//		}
		for (Proyecto p : projects) {
			System.out.println(p.getNombre() + ":" + p.getDescripcion() + ":" + p.getInitialCost());
		}

	}

}
