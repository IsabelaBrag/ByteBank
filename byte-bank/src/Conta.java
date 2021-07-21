
public class Conta {
	
// quatro atributos dentro da classe
	
	    double saldo;
	    int agencia;
	    int numero;
	    String titular;
	    
// cria��o do primeiro m�todo
	    
	    public void deposita(double valor) {
	    	this.saldo += valor;
	    }
	    
// cria��o do segundo m�todo em booleano
	    
	    public boolean saca(double valor) {
	    	
	    	if (this.saldo >= valor) {
	    		this.saldo -= valor;
	    		return true;
	    	} else {
	    		return false;
	    	}
	    }
	 
// cria��o do terceiro m�todo
	    		
	    public boolean transfere (double valor, Conta destino) {
	    	
	    	if (this.saldo >= valor) {
	    		this.saldo -= valor;
	    		destino.saldo += valor;
	    		return true;
	    	} else {
	    		return false;
	    			    	
	    	
	    }
	  
	    		
	    }
	    	
	    }
