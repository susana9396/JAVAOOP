import java.util.Random;

public class BankAccount {

	private String numCuenta;
	private double ctaCte;
	private double ctaAhorro;

	private static int contadorCta = 0;
	private static double sumSaldoTotal = 0.0;


	//Número de cta aleatorio.

	private String abreCta() {
		Random rand = new Random(); 
		long drand = (long)(rand. nextDouble()*10000000000L); 
		String num = String.valueOf(drand);
		return num;
	}


	//  Constructor 
	public BankAccount() {
		numCuenta = abreCta();
		contadorCta += 1;
	}


	//  Depositos.
	public void deposito(String tipo, double monto) {
		if(tipo == "ahorro") {
			this.ctaAhorro += monto;
			sumSaldoTotal += monto;

			System.out.println("Usted ha depositado en su Cuenta de Ahorro:\n"+ ctaAhorro);

		}else if(tipo == "corriente"){
			this.ctaCte += monto;
			sumSaldoTotal += monto;

			System.out.println("Usted ha depositado en su Cuenta Corriente:\n"+ ctaCte);
		}

	}

	// Retiros
	public void retiro(String tipo, double monto) {
		
		if(tipo == "ahorro" && ctaAhorro >= monto) {
			this.ctaAhorro -= monto;
			sumSaldoTotal -= monto;

			System.out.println("Usted ha retirado de su Cuenta de Ahorro:\n"+ ctaAhorro);

		}else if(tipo == "corriente"  && ctaCte >= monto){
			this.ctaCte -= monto;
			sumSaldoTotal -= monto;

			System.out.println("Usted ha retirado de su Cuenta Corriente:\n"+ ctaCte);   // Imprime en la consola o pantalla, etc.
			
		}else if(ctaAhorro < monto && tipo == "ahorro" || ctaCte < monto && tipo == "corriente") {
		 	
		 	System.out.println("Saldo es insuficiente");
		}
	}

	public double saldoTotal() {

		return ctaCte + ctaAhorro;
	}




	// Solo  Getters 


	public double getCtaCte() {
		return ctaCte;
	}

	public double getCtaAhorro() {
		return ctaAhorro;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

}
