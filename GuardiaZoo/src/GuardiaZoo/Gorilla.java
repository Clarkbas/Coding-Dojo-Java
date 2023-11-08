package GuardiaZoo;

public class Gorilla extends Mamifero {
    public Gorilla(String mammal, int displayEnergy, int energyLevel) {
        super(mammal, displayEnergy, energyLevel);
    }

    public void throwSomething() {
        System.out.println("El gorila ha lanzado algo.");
        setDisplayEnergy(getDisplayEnergy() - 5);
    }

    public void eatBananas() {
        System.out.println("El gorila está comiendo plátanos.");
        setDisplayEnergy(getDisplayEnergy() + 10);
    }

    public void climb() {
        System.out.println("El gorila está trepando un árbol.");
        setDisplayEnergy(getDisplayEnergy() - 10);
    }

    public int displayEnergy() {
        System.out.println("Nivel de energía del gorila: " + getDisplayEnergy());
        return getDisplayEnergy();
    }
}



