package GuardiaZoo;

public class Mamifero {
	
	private String mammal;
	private int displayEnergy;
    private int energyLevel;
	
	
	public Mamifero (String mammal, int displayEnergy, int energyLevel) {
		 
		 this.mammal = mammal;
		 this.displayEnergy = displayEnergy;
		 this.energyLevel = energyLevel;
		 
	 }
	public Mamifero() {
		
	}


	public int getEnergyLevel() {
		return energyLevel;
	}


	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}


	public String getMammal() {
		return mammal;
	}


	public void setMammal(String mammal) {
		this.mammal = mammal;
	}


	public int getDisplayEnergy() {
		return displayEnergy;
	}


	public void setDisplayEnergy(int displayEnergy) {
		this.displayEnergy = displayEnergy;
	}

}
