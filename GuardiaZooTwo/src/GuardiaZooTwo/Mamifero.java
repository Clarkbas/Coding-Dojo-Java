package GuardiaZooTwo;

public class Mamifero {
	
	
	//Atributos
    private int energyLevel;
    
    //Metodo Constructor, lo que hace es inicializar la clase
	public Mamifero (int energyLevel) {
		 
		 this.energyLevel = energyLevel;
		 
	 }
	
	// Metodo Constructor, lo que hace es inicializar la clase
	public Mamifero () {
		
	}
	

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	


}
