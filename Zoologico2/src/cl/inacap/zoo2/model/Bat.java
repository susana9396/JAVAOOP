package cl.inacap.zoo2.model;

public class Bat extends Mammal {
    
	public Bat(){
		energyLevel=300;
	}
	
	public void fly() {
		System.out.println("\nBat fly, pierde 50pts");
		energyLevel-=50;
		System.out.println("TOTAL ENERGIA: "+ energyLevel);
		
	}
	public void eatHumans() {
		System.out.println("\nbueno, no importa, gana 25 pts");
		energyLevel+=25;
		System.out.println("TOTAL ENERGIA: "+ energyLevel);
	}
	public void attackTown() {
		System.out.println("\nCiudad en llamas, pierde 100 pts");
		energyLevel-=100;
		System.out.println("TOTAL ENERGIA: "+ energyLevel);
		
	}
}