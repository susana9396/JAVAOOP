
public class ListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
		System.out.println("---TODOS LOS NODOS----\n" );
        sll.printValues();
        
        sll.remove();
       // sll.remove();
		System.out.println("\n---DESPUES DE 2 REMOVE-----\n"  );
        sll.printValues();
        
        System.out.println("\n---BUSCAR NODOS-----\n"  );
        sll.find(5);
        sll.find(15);
        sll.find(8);
        
        
        /*PENDIENTE
        System.out.println("\n---REMOVER NODO ESPECIFICO-----\n"  );
        sll.removeAt(0);
        sll.printValues();
        */
	}

}
