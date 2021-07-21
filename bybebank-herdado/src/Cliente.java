
public class Cliente implements Autenticavel {

	private int senha;
	private AutenticacaoUtil autentificador;
	
	
	public Cliente() {
		this.autentificador = new AutenticacaoUtil();
		
	}
	
	@Override
	public void setSenha(int senha) {
		this.autentificador.setSenha(senha);
	
	}

	@Override
	public boolean autentic(int senha) {
		boolean autenticou = this.autentificador.autentic(senha);
		return autenticou;
	}
}


