
public class TestaValores {
	
	public static void main(String[] args) {

		Conta conta = new Conta(1200, 5432);
		

		// conta esta inconsistente
		//conta.setAgencia(-50);
		//conta.setNumero(-330);
		
		System.out.println(conta.getAgencia());
		
		//Conta conta2 = new Conta(1200, 5333);
		//Conta conta3 = new Conta(1200, 5334);
		
		System.out.println("O total de contas é : " + Conta.getTotal());

		
		
		
	}

}
