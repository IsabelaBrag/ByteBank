
public class TesteReferencia {
	
	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		System.out.println("Primeira conta tem : "  + primeiraConta.saldo);
		
		
		Conta segundaConta = primeiraConta;
		
		
		System.out.println("Segunda conta tem : " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println("Novo valor segunda conta: " + segundaConta.saldo);
		System.out.println("Novo valor primeira conta "  + primeiraConta.saldo);

		if (primeiraConta == segundaConta) {
			System.out.println("Primeira e Segunda conta são iguals");
			// compara as referência de dentro do objeto se são iguais
		}
		
		
	}

}
