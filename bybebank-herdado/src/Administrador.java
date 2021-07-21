
public class Administrador extends Funcionario implements Autenticavel{
	
	private AutenticacaoUtil autentificador;

	public Administrador() {
		this.autentificador = new AutenticacaoUtil();
		
	}
	
	@Override
	public double getBonificacao() {	

		return 50;
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
