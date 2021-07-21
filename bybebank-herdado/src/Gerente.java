// Gerente é um funcionario, gerente herda da classe Autenticavel, assina o contrato Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;
	
	private AutenticacaoUtil autentificador;

	public Gerente() {
		this.autentificador = new AutenticacaoUtil();
		
	}

	public double getBonificacao() {
		System.out.println("chamando o metodo de bonificacao do Gerente");
		return super.getSalario();
	
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
