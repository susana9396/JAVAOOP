import java.util.InputMismatchException;
import java.util.Scanner;
public class PersonaTest {

	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);
		int con=1;
		Listado l =new Listado();

		while(con<=3) {
			
			System.out.println("------------Ingrese sus datos completos--------\n");


			System.out.println("Ingrese nombre");
			String nombre=input.next();


			System.out.println("Ingrese apellido");
			String apellido=input.next();


			System.out.println("Ingrese edad");
			boolean a;
			int edad = 0;
			do {
				try {
					a=false;
					edad=input.nextInt();
				} catch (InputMismatchException e){
					a=true;
					input.next();
					System.out.println("Ingrese edad en numero entero");
				}
			}while (a==true);


			System.out.println("Ingrese peso");
			boolean b ;
			float peso = 0;
			do {
				try {
					b=false;
					peso=input.nextFloat();
				} catch (InputMismatchException e){
					b=true;
					input.next();
					System.out.println("Ingrese peso en numeros");
				}
			}while (b==true);


			System.out.println("Ingrese estatura");
			boolean c ;
			float estatura = 0;
			do {
				try {
					c=false;
					estatura=input.nextFloat();
				} catch (InputMismatchException e){
					c=true;
					input.next();
					System.out.println("Ingrese estatura en numeros");
				}
			}while (c==true);

			System.out.println("\nAgregue una descripción");
			String desc2=input.next();

			if (con==1) {
				Persona n1=new Persona(nombre, apellido, edad , peso, estatura, desc2);
				l.add(n1);
				System.out.println("\n------------Sus datos son----------\n");
				System.out.print(n1);
				n1.mayorEdad();
			}else if (con==2) {
				Persona n2=new Persona(nombre, apellido, edad , peso, estatura, desc2);
				l.add(n2);
				System.out.println("\n------------Sus datos son----------\n");
				System.out.print(n2);
				n2.mayorEdad();
			}else if (con==3) {
				Persona n3=new Persona(nombre, apellido, edad , peso, estatura, desc2); 
				l.add(n3);
				System.out.println("\n------------Sus datos son----------\n");
				System.out.print(n3);			
				n3.mayorEdad();
			}
			con++;
			
		}
		System.out.println("\n------------Array list ----------\n");
		System.out.println(l);
	}   

}

