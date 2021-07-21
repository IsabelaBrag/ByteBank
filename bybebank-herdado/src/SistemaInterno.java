
public class SistemaInterno {
	
	private int senha = 2501;
	
	public void autentic(Autenticavel fa) {
		
		boolean autenticou = fa.autentic(this.senha);
		
		if (autenticou) {
			System.out.println("Pode entrar no sistema");
		}else {
			System.out.println("Não pode entrar no sistema");
		}

		
	}

}
