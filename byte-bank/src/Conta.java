
public class Conta {
	
// quatro atributos dentro da classe
	
	    double saldo;
	    int agencia;
	    int numero;
	    String titular;
	    
// criação do primeiro método
	    
	    public void deposita(double valor) {
	    	this.saldo += valor;
	    }
	    
// criação do segundo método em booleano
	    
	    public boolean saca(double valor) {
	    	
	    	if (this.saldo >= valor) {
	    		this.saldo -= valor;
	    		return true;
	    	} else {
	    		return false;
	    	}
	    }
	 
// criação do terceiro método
	    		
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
