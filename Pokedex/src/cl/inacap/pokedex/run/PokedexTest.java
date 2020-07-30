package cl.inacap.pokedex.run;

import cl.inacap.pokedex.model.Pokedex;
import cl.inacap.pokedex.model.Pokemon;

public class PokedexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pokedex pokedex = new Pokedex();
		
		Pokemon pk1 = pokedex.createPokemon("Pikachu", 100, "Electric");
		Pokemon pk2 = pokedex.createPokemon("Charmander", 120, "Fire");
		Pokemon pk3 = pokedex.createPokemon("Squirtle", 150, "Aqua");
		
		
		pokedex.addPokemon(pk1);
		// System.out.println(pk1.getName());
		
		pokedex.addPokemon(pk2);
		//System.out.println(pk2.getType());
		
		pokedex.addPokemon(pk3);
		//System.out.println(pk3.getHealth());
		System.out.println("\n-----POKEMONES-----\n");
		pokedex.listPokemon();
		
		System.out.println("\n-----ATAQUES POKEMONES-----\n");
		pk3.attackPokemon(pk1);
	
		pk1.attackPokemon(pk2);
	
		pk1.attackPokemon(pk2);
		
		pk2.attackPokemon(pk3);
		
				
		//System.out.println(pokedex.pokemonInfo(pk3));
		System.out.println("\n-----POKEMONES DESPUES DE ATAQUES-----\n");
		pokedex.listPokemon();
		
		System.out.println("\n-----NUMERO DE POKEMONES EN LA LISTA-----\n");
		Pokemon.contador();
		
	}	

}
