package ProyectClass;

public class Project {

	private static final Project[] Project = null;
	public String nombre;
	public String descripcion;
	public Object initialCost;
	public Object PortfolioCost;


	public Project(String nombre, String descripcion) {
		
	}
	public static void main(String[] args) {	

	}
	// Getter y Setter para el campo "nombre"
	public String getNombre() {
		String getNombre = "Proyecto 1\n";
		return (getNombre);
	}
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    
    // Getter y Setter para el campo "descripcion"
	public String getDescripcion() {
		
		String getDescripcion = " Este es un proyecto de prueba\n";
		return (getDescripcion);
	}
	
    public void setDescripcion(String descripcion) {
    	this.descripcion = descripcion;
    }
    
    // Getter y Setter para el campo "initialCost"
	public double getinitialCost() {
		
		double precio = 100;
		return (getinitialCost(precio));
	}
	
    private double getinitialCost(double precio) {
		return precio;
	}
	public void setinitialCost(Object initialCost) {
    	this.initialCost = initialCost;
    }
    // Getter y Setter para el campo "getPortfolioCost"
	public double getPortfolioCost() {
		
		double precio = 1000000;
		return (getPortfolioCost(precio));
	}
	
    private double getPortfolioCost(double precio) {
		return precio;
	}
	public void setPortfolioCost(Object PortfolioCost) {
    	this.PortfolioCost = PortfolioCost;
    }
    
	// instancia de método que se llame elevatorPitch
	public String elevatorPitch() {
		
		String getNombre = "Proyecto 1 " + "(cost):";
		String getDescripcion = " Ahora esto al parecer tiene un valor\n";
		return (getNombre + getDescripcion);
	}
	
	//Agregar el método showPortfolio que mostrará en pantalla todos los proyectos en formato elevator Pitches, seguido del costo total.
	public void showPortfolio() {
	    int totalCost = 100;

	    for (Project project : Project) {
	        totalCost = (int) project.getinitialCost();
	    }

	    System.out.println("Costo total del portfolio: " + getNombre() + getDescripcion() + totalCost);
	}

    }
	


