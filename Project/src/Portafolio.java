import java.util.ArrayList;
public class Portafolio {

	private ArrayList<Project> projects;

    public Portafolio() {
    	projects = new ArrayList<Project>();
    }
    public void add(Project proje) {
    	projects.add(proje);
    }
    public double getPortfolioCost() {
    	double cost=0.0;
    	
    	for(Project p:projects) {
    		cost+=p.getInitialCost();
    		
    	}
    	return cost;
    }
    public void showPortfolio() {
    
    	for(Project p:projects) {
    		System.out.println(p.elevatorPitch());
    		
    	}
    	System.out.println("Costo total:"+ this.getPortfolioCost());
    }
    // getter y setter
    public ArrayList<Project> getProjects(){
    	return projects;
    }
    public void setProjects (ArrayList<Project> list) {
    	this.projects =list;
    }
}
