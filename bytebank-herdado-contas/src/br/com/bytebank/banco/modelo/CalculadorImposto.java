package br.com.bytebank.banco.modelo;

// modelo.CalculadorImposto --> FQN (Full Qualified Name)

public class CalculadorImposto {
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;		
	}
	
	public double gettotalImposto() {
		return totalImposto;
	}
;
	
}
