package PKM;


import java.util.ArrayList;
import java.util.List;

class MyPokedex implements PokemonInterface {
    private List<Pokemon> pokemonList;

    public MyPokedex() {
        pokemonList = new ArrayList<>();
    }

    public Pokemon createPokemon(String name, int health, String type) {
        Pokemon pokemon = new Pokemon(name, health, type);
        pokemonList.add(pokemon);
        return pokemon;
    }

    public String pokemonInfo(Pokemon pokemon) {
        String info = "Name: " + pokemon.getName() + ", Health: " + pokemon.getHealth() + ", Type: " + pokemon.getType();
        return info;
    }
    //Lista de información de los pokemon
    public void listPokemon() {
        for (Pokemon pokemon : pokemonList) {
            String info = "Name: " + pokemon.getName() + ", Health: " + pokemon.getHealth() + ", Type: " + pokemon.getType();
            System.out.println(info);
        }
    }
}

