package GuardiaZooTwo;

public class Gorilla extends Mamifero {
    public Gorilla(String mammal, int displayEnergy, int energyLevel) {
    	setEnergyLevel(100);
    }

    public void throwSomething() {
        System.out.println("El gorila ha lanzado algo.");
        setEnergyLevel(displayEnergy() - 5);
    }

    public void eatBananas() {
        System.out.println("El gorila está comiendo plátanos.");
        setEnergyLevel(displayEnergy() + 10);
    }

    public void climb() {
        System.out.println("El gorila está trepando un árbol.");
        setEnergyLevel(displayEnergy() - 10);
    }

    public int displayEnergy() {
        System.out.println("Nivel de energía del gorila: " + displayEnergy());
        return displayEnergy();
    }
    public Gorilla (){
    	
    }
    
}



