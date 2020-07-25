import java.util.ArrayList;

public class Listado {
	private ArrayList<Persona> datos;

	public Listado() {
		datos=new ArrayList<Persona>();
	}
	public void add(Persona arr) {
		datos.add(arr);
	}

	@Override
	public String toString() {
		String result = "";
        for (int i = 0; i < datos.size(); i++) {
            result += " " + datos.get(i)+ "\n";
        }
        return result ;
		//return"Listado [datos=" + datos + "]";
	}
	

}
