package ProyectClass;

public class ProyectTest {


	private static String totalCost;

	public static void main(String[] args) {

        String nombre = "Proyecto 1";
        String descripcion = "Este es un proyecto de prueba";

        // Crear un objeto Project y asignar valores a los campos
        Project proyecto = new Project(nombre, descripcion);

        // Imprimir los valores de los campos
        System.out.println("Nombre del proyecto: " + proyecto.getNombre());
        System.out.println("Descripción del proyecto: " + proyecto.getDescripcion());

        // Llamar al método elevatorPitch y mostrar el resultado
        System.out.println("Elevator pitch: " + proyecto.elevatorPitch());
        
        //Llama al metodo double de initialCost
        System.out.println("El precio es: " + proyecto.getinitialCost());
        
        //Llama al metodo double de PortfolioCost
        System.out.println("El precio es: " + proyecto.getPortfolioCost());
        

		//Llama el total del metodo showPortfolio en formato 
	    System.out.println("Costo total del portfolio \n: " + proyecto.getNombre()+ ":" + proyecto.getDescripcion()+ ": " +totalCost);
	    
    }
}

