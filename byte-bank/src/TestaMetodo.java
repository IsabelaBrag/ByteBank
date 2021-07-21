
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDaIsabela = new Conta();
		contaDaIsabela.saldo = 100; 
		
		contaDaIsabela.deposita(50); //chamando do primeiro método no Java
		
		System.out.println(contaDaIsabela.saldo);
		
		contaDaIsabela.saca(20); //chamando do segundo método no Java
		
		System.out.println(contaDaIsabela.saldo);
		
		Conta contaDaMarcela = new Conta ();
		contaDaMarcela.saldo = 1000;
		
		if (contaDaMarcela.transfere(300, contaDaIsabela)) {
			System.out.println("Transferência autorizada");
		} else {
			System.out.println("Transferência negada");
		}
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaIsabela.saldo);
		
		
		
	}

}
