package PKM;

public class pokemonTest {
    public static void main(String[] args) {
    	MyPokedex pokedex = new MyPokedex();

        // Crear Pokémon
        Pokemon pokemon1 = pokedex.createPokemon("Pikachu", 100, "Electrico");
        Pokemon pokemon2 = pokedex.createPokemon("Charizard", 150, "Fuego");
        Pokemon pokemon3 = pokedex.createPokemon("Bulbasaur", 90, "Pasto");
        Pokemon pokemon4 = pokedex.createPokemon("Squirtle", 95, "Agua");


        // Ataque de Pokémon
        System.out.println("Antes del ataque - Vida de " + pokemon2.getName() + ": " + pokemon2.getHealth());
        pokemon1.attackPokemon(pokemon2);
        System.out.println("Despues del ataque - Vida de " + pokemon2.getName() + ": " + pokemon2.getHealth());

        // Ataque de Pokémon
        System.out.println("Antes del ataque - Vida de " + pokemon4.getName() + ": " + pokemon4.getHealth());
        pokemon3.attackPokemon(pokemon4);
        System.out.println("Despues del ataque - Vida de " + pokemon4.getName() + ": " + pokemon4.getHealth());
        
        // Listar Pokémon
        System.out.println("Pokémon List:");
        pokedex.listPokemon();
    }
}


