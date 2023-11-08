package Herencia;

public class humanoTest {

	public static void main(String[] args) {
		
		Humano h1 = new Humano();
		h1.setNombre("carlos");
		System.out.println(h1.getNombre());
		h1.estaDurmiendo();
		h1.setDormir(true);
		h1.estaDurmiendo();
		
		
	}

}
