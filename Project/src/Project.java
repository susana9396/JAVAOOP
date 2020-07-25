
public class Project {

	private String nombre;
	private String descripcion;
	private Double initialCost;
	
	public Project() {
		nombre="";
		descripcion="";
	}
	
	public Project(String nombre) {
		this.nombre=nombre;
		this.descripcion= "Vacío";
	}
	
	public Project(String nombre, String descripcion) {
		this.nombre=nombre;
		this.descripcion= descripcion;
		
	}
	
	public String elevatorPitch() {
		return nombre +"("+ initialCost + ")"+ ":"+ descripcion;
	}
	
    // getter
    public String getNombre() {
        return nombre;
    }
    
    // setter
    public void setNombre(String nombre) {
        this.nombre=nombre;
        
    }
    // getter
    public String getDescription() {
        return descripcion;
    }
    // setter
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;        
    }
    // getter
    public Double getInitialCost() {
        return initialCost;
    }
    // setter
    public void setInitialCost(Double initialCost) {
        this.initialCost = initialCost;        
    }

}


