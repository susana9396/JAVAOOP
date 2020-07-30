package cl.inacap.pokedex.model;
import java.util.HashMap;
import java.util.Set;

public class Pokedex extends AbstractPokemon {
	
	HashMap<String, Pokemon> myPokemons = new HashMap<String, Pokemon>();
	
	public void addPokemon(Pokemon p) {
		myPokemons.put(p.getName(), p);
		
	}
	
	@Override
	public void listPokemon() {
		Set<String>keys = myPokemons.keySet();
		
		for (String key:keys) {
			
			// System.out.println(myPokemons.get(key).getName() + myPokemons.get(key).getHealth() + myPokemons.get(key).getType());
			System.out.println(pokemonInfo(myPokemons.get(key)));
		}
		
	}

}
