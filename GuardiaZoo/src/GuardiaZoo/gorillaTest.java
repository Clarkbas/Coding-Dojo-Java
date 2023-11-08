package GuardiaZoo;

public class gorillaTest {

    public static void main(String[] args) {
        Gorilla g = new Gorilla("", 100, 0);
        
        // Muestra el nivel de energía inicial
        g.displayEnergy();
        
        // Las acciones que realiza el gorilla
        g.throwSomething();//1
        g.throwSomething();//2
        g.throwSomething();//3
        g.eatBananas();//1
        g.eatBananas();//2
        g.climb();//1
        g.climb();//2

        // El nivel de energía después de realizar las acciones
        g.displayEnergy(); 
    }

}
