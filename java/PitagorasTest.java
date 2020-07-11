
public class PitagorasTest {
    public static void main(String[] args) {
        Pitagoras py = new Pitagoras();
        int catA=3;
        int catB=4;
        double hipotenusa= py.calculateHypotenuse(catA, catB);
        System.out.println("Hipotenusa: " + hipotenusa);
    }
}
