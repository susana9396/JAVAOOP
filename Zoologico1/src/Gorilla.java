
public class Gorilla extends Mammal {
	public void  throwSomething() {
		System.out.println("\nGorila ha lanzado algo, pierde 5pts de enrgía");
		energyLevel-=5;
		desiplayEnergy();
	}
	
	public void eatBananas() {
		System.out.println("\nGorila ha comió una banana, gana 10pts de enrgía");
		energyLevel+=10;
		desiplayEnergy();
	}
	public void climb() {
		System.out.println("\nGorila ha trepado a la cima de un árbol , pierde 10pts de enrgía");
		energyLevel-=5;
		desiplayEnergy();
	}
}
