// Alland, Antonio, Cristian, Susana
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount persona1  = new BankAccount();
		BankAccount persona2  = new BankAccount();
		System.out.println("\n----Persona1 Apertura de Cuenta Persona1----\");
		// Persona1 Apertura de Cuenta.
		System.out.println("Número de Cuenta:\n"+ persona1.getNumCuenta());
		
		
		System.out.println("\n----Depositos Persona1----\n");
		// Persona1 Deposita en Cuenta.
		persona1.deposito("ahorro", 12.0);
		persona1.deposito("corriente", 142.5);
		
		System.out.println("Usted ha depositado:\n"+ persona1.getCtaAhorro());
		
		System.out.println("\n----Retiro Persona1----\n");
		persona1.retiro("ahorro", 10.5);
		
		System.out.println("\n----Retiro Persona2----\n");
		persona2.retiro("ahorro",  100.0);
		
		System.out.println("\n----Consulta saldo Persona1----\n");		
		// Consulta de saldo		
		System.out.println("Su saldo total es de:\n"+ persona1.saldoTotal());
		System.out.println("Su saldo total en Cuenta de Ahorro es de:\n"+ persona1.getCtaAhorro());
	}

}
