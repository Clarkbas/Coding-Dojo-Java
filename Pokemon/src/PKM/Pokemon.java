package PKM;

public class Pokemon {
	
	public String name ;
	public double health;
	public String type;
	private static int count;
	
	//Metodos 
	
	//El public pokemon es un modificador de acceso
    public Pokemon(String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
    }


	public void attackPokemon(Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth() - 30);
    }
	
    // Getters and Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	// Static count getter
	public static int getCount() {
		return count;
	}

}



