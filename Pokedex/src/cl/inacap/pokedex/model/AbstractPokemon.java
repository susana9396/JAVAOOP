package cl.inacap.pokedex.model;

public abstract class AbstractPokemon implements PokemonInterface {
	
	//se crea la clase abstracta porque existe un metodo que no se ejecute 
	
	public Pokemon createPokemon(String name, int health, String type) {
		
		Pokemon creacion = new Pokemon(name,health,type);
		return creacion;
	}

	
	 public String pokemonInfo(Pokemon pokemon) {
		 return "Su nombre es: " + pokemon.getName() + ", su salud es de " + pokemon.getHealth() + " y su tipo de pokemon es " + pokemon.getType();
		 
	 }
	 
	 public abstract void  listPokemon() ;
}
