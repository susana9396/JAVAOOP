
public class Gorilla extends Mammal {
	public void  throwSomething() {
		System.out.println("\nGorila ha lanzado algo, pierde 5pts de enrg�a");
		energyLevel-=5;
		desiplayEnergy();
	}
	
	public void eatBananas() {
		System.out.println("\nGorila ha comi� una banana, gana 10pts de enrg�a");
		energyLevel+=10;
		desiplayEnergy();
	}
	public void climb() {
		System.out.println("\nGorila ha trepado a la cima de un �rbol , pierde 10pts de enrg�a");
		energyLevel-=5;
		desiplayEnergy();
	}
}
