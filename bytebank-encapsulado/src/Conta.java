
public class Conta {
	
// quatro atributos dentro da classe
	
	    private double saldo;
	    private int agencia;
	    private int numero;
	    private Cliente titular;
	    private static int total;
 
// criação do construtor --> Rotina de inicializaçao
	    
	    public Conta(int agencia, int numero) {
	    	Conta.total++;
	    	System.out.println("o total de contas é : " + total);
	    	this.agencia = agencia;
	    	this.numero = numero;
	    	
	    	System.out.println("estou criando uma conta " + numero);
	    	
	    }
	    
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
	    
	    public double GetSaldo() {
	    	return this.saldo;
	    }

	    public double getNumero() {
	    	return this.numero;    	
	    }
	    
	    public void setNumero(int novoNumero) {
	    	if(numero <= 0) {
	    		System.out.println("não pode valor menor igual a zero");
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

}
