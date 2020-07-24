
public class ProjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Project proj = new Project();
     Project proj1 = new Project("Web");
     Project proj2 = new Project("App", "Nueva app para pasar el tiempo");
     
    
     proj.setInitialCost(0.55);
     proj1.setInitialCost(0.66);
     proj2.setInitialCost(0.77);
     
     System.out.println("\nProyects:\n");
     System.out.println(proj.elevatorPitch());
     System.out.println(proj1.elevatorPitch());
     System.out.println(proj2.elevatorPitch()); 
     
      Portafolio porta =new Portafolio();
      
      proj.setNombre("Calculadora");
      proj.setDescripcion("Permite hacer operaciones");
      proj1.setDescripcion("Para ganar dinero");
      
     porta.add(proj);
     porta.add(proj2);
     porta.add(proj1);
     
     System.out.println("\nPortafolio:\n");
     porta.showPortfolio();
	}

}
