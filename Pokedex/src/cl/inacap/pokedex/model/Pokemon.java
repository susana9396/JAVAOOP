package cl.inacap.pokedex.model;

public class Pokemon {
	
	//atributos
	private String name;
	private int health;
    private String type;
    public static int count= 0;
    
    
    //constructor
      
    public Pokemon(String name, int health, String type){
    	this.name = name;
    	this.health = health;
    	this.type = type;
    	count++;
    }
    
    //metodo
    
    public static void contador() {
    	System.out.println("\nExisten " +count + " pokemones creados.");
    }
        
    public void attackPokemon(Pokemon pokemon) {
    	pokemon.setHealth(pokemon.getHealth()-10);
    	System.out.println("\nEl pokemon " +this.name + " atacó a " + pokemon.getName() );
    }

    //Getter y Setter
    public String getName() {
		return name;
	}

   
	public void setName(String name) {
		this.name = name;
	}


	public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	
    
   

}
