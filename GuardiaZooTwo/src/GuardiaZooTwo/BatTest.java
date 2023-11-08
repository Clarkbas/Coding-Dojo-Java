package GuardiaZooTwo;

public class BatTest {
    public static void main(String[] args) {
        Bat bat = new Bat();

        System.out.println("Nivel de energía inicial: " + bat.getEnergyLevel());
        // Ataque a la ciudad tres veces
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();

        // Come dos humanos
        bat.eatHumans();
        bat.eatHumans();

        // Volar dos veces
        bat.fly();
        bat.fly();
        System.out.println("Nivel de energía al final: " + bat.getEnergyLevel());
        
    }
}

