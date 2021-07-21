package br.com.bytebank.banco.modelo;

/**
 * Classe que representa a moldura de uma conta.
 * 
 * @author isabelabroque
 *
 */

public abstract class Conta extends Object implements Comparable<Conta> {
	
// quatro atributos dentro da classe
	
	    protected double saldo;  //colocando protected fica public para todos os filhos mesmo em diferente packages
	    private int agencia;
	    private int numero;
	    private Cliente titular;
	    private static int total;
	    
/**
 * Contrutor para inicializar o objeto Conta a partir da agencia e numero.
 * 
 * @param agencia
 * @param numero
 */
 
// cria��o do construtor --> Rotina de inicializa�ao
	    
	    public Conta(int agencia, int numero) {
	    	Conta.total++;
	    	//System.out.println("o total de contas � : " + total);
	    	this.agencia = agencia;
	    	this.numero = numero;
	    	
	    	//System.out.println("estou criando uma conta " + numero);	
	    }
	    
// cria��o do primeiro m�todo
	    
	    public abstract void deposita(double valor);

/**
 * Valor precisa ser maior que o saldo.	  
 *   
 * @param valor
 * @throws SaldoInsulficienteException
 */
// cria��o do segundo m�todo em booleano
	    
	    public void saca(double valor)  throws SaldoInsulficienteException {
	    	
	    	if (this.saldo < valor) {
	    		throw new SaldoInsulficienteException("Saldo: " + this.saldo + "Valor: " + valor);
	    	}
	    	
	    	this.saldo -= valor;

	    }
	 
// cria��o do terceiro m�todo
	    		
	    public void transfere (double valor, Conta destino) throws SaldoInsulficienteException{
		    	
	    	this.saca(valor); 
	        destino.deposita(valor);			    		    	
	   		
	    }
	    
	    public double getSaldo() {
	    	return this.saldo;
	    }

	    public int getNumero() {
	    	return this.numero;    	
	    }
	    
	    public void setNumero(int novoNumero) {
	    	if(numero <= 0) {
	    		System.out.println("n�o pode valor menor igual a zero");
	    	}
	    	this.numero = novoNumero;
	    }
	    
	    public int getAgencia() {
			return this.agencia;
		}
	    
	    public void setAgencia(int agencia) {
			this.agencia = agencia;
			if (agencia <= 0) {
				System.out.println("n pode valor igual a zero");
			}
			
		}
	    
	    public Cliente getTitular() {
			return this.titular;
		}
	    
	    public void setTitular(Cliente titular) {
			this.titular = titular;
		}
    	
	    public static int getTotal() {
	    	return Conta.total;
	    }
	    
		@Override
		public String toString() {
			
			return "Numero: " + this.numero + " Agencia: " + this.agencia + " Saldo: " + this.saldo;
		}

//		public boolean ehigual(Conta outra) {
//			if(this.agencia != outra.agencia) {
//				return false;
//			}
//			if(this.numero != outra.numero) {
//				return false;
//			}
//			
//			return true;
//		}
		@Override
		public boolean equals(Object ref) {
			
			Conta outra = (Conta) ref;
			
			if(this.agencia != outra.agencia) {
				return false;
			}
			if(this.numero != outra.numero) {
				return false;
			}	
			return true;
		}
		
		@Override
			public int compareTo(Conta outra) {
				
				return Double.compare(this.saldo, outra.saldo);
			}
		


}
