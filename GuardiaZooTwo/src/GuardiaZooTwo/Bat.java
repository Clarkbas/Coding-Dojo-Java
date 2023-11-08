package GuardiaZooTwo;
//Murcielago hereda de mamifero atributos y metodos publicos 

public class Bat extends Mamifero {
	
	//Metodo constructor, inicializa muitos murcielagos
    public Bat() {
    	setEnergyLevel(300);
    }

    
     //metodo que solo tiene el bat(murcielagos).
    public void fly() {
        System.out.println("El murciélago hace un sonido al despegar.");
        setEnergyLevel(getEnergyLevel() - 50);
        System.out.println("Nivel de energía después de volar: " + getEnergyLevel());
    }
    
    // metodo que solo tiene el bat(murcielagos).
    public void eatHumans() {
        System.out.println("Bueno, no importa.");
        setEnergyLevel(getEnergyLevel() + 25);
        System.out.println("Nivel de energía después de comer humanos: " + getEnergyLevel());
    }
    
    // metodo que solo tiene el bat(murcielagos).
    public void attackTown() {
        System.out.println("El sonido de la ciudad en llamas.");
        setEnergyLevel(getEnergyLevel() - 100);
        System.out.println("Nivel de energía después de atacar la ciudad: " + getEnergyLevel());
    }
}
