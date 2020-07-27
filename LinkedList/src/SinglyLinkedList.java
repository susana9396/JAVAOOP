
public class SinglyLinkedList {
	public Node head;   
	public SinglyLinkedList() {
		this.head=null;
	}
	//Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la 

	public void add(int value) {
		Node newNode = new Node(value);        
		// System.out.println(newNode);
		if(this.head == null) {
			this.head = newNode;
		} else {
			Node rem = this.head;
			while(rem.next != null) {
				//System.out.println(rem.next.value+ " next");
				rem = rem.next;
				//System.out.println(rem.value +" rem2");
			}
			rem.next = newNode;
		}
	}   
	public void remove() {
		if(head!=null) {
			if(head.next == null) {
				//System.out.println("rem1");
				this.head = null;
				return;
			}
			Node rem=this.head.next;
			Node previo=this.head;
			//System.out.println(rem.value + "rem1");
			while(rem.next!=null) {
				previo=rem;
				rem=rem.next;
				//System.out.println(previo.value +"previo");
				//System.out.println(rem.value +"rem");
			}
			previo.next=null;
			//System.out.println(previo.next +"fin");
			//System.out.println(rem.value +"head");
		}
	}
	
	
	public void printValues() {

	
		if(head==null) {
			System.out.println("Sin nodo");
		}else {
			Node rem=this.head;
			System.out.println(" Nodo: " + rem.value  );
			while (rem.next!=null) {

				rem=rem.next;  	 
				System.out.println(" Nodo: " + rem.value  );
			}
			//System.out.println(" Nodo: " + rem.value  );
		}
	}
	

	public  void find (int value) {
		Node rem=this.head;
		Node cont=this.head;
		if (rem.value==value) {
			System.out.println("Valor: "+this.head.value +" es el primer valor del nodo");
			cont=null;
		}else {
			while(rem.next!=null) {
				rem=rem.next;

				if (rem.value==value) {
					System.out.println("Valor: "+ rem.value +" se encuentra en el nodo");
					cont=null;
				}

			}
		}
		if (cont!=null) {
			System.out.println("Valor: "+ value +" no está en el nodo");
		}
	}

   /*PENDIENTE
	public void removeAt(int value) {
		Node rem=this.head.next;
		int cont=1;
		if (value==0) {		
			at=null;
		}else {
			while(rem.next!=null) {
				at=rem;
				rem=rem.next;
				cont++;
				if (cont==value) {				
					at=null;
				}

			}
		}

	}
   */
}

