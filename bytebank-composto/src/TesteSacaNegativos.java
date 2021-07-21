
public class TesteSacaNegativos {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);

		System.out.println(conta.saca(200));
		
		conta.saca(200);
		
	//	System.out.println(conta.saldo);
		
	//	conta.saldo = conta.saldo - 200; //proibido
		
		System.out.println(conta.GetSaldo());
		
		
		
		
	}

}
