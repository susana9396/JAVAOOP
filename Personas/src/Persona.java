import java.util.ArrayList;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private float peso;
	private float estatura;
	private String descrip;
	
		
	public Persona(String nom, String apell, int edad, float pes , float est, String desc) {
		this.nombre = nom;
		this.edad = edad;
		this.apellido=apell;
		this.peso=pes;
		this.estatura=est;
		this.descrip=desc;
	}
	
	public Persona(String desc) {
		this.descrip=desc;
	}

	public void mayorEdad() {
		if (this.edad>=18) {
			System.out.println("\n\nEl usuario es mayor de edad\n");	
		}else {
			System.out.println("\n\nEl usuario  no es mayor de edad\n");	
		}		
		
	}




	@Override
	public String toString() {
		return "Persona [ nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad +", peso=" + peso
				+ ", estatura=" + estatura + ", descrip=" + descrip + "]";
	}


}
