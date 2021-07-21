
public class Conta {
	
// quatro atributos dentro da classe
	
	    private double saldo;
	    private int agencia;
	    private int numero;
	    private Cliente titular;
	    private static int total;
 
// cria��o do construtor --> Rotina de inicializa�ao
	    
	    public Conta(int agencia, int numero) {
	    	Conta.total++;
	    	System.out.println("o total de contas � : " + total);
	    	this.agencia = agencia;
	    	this.numero = numero;
	    	
	    	System.out.println("estou criando uma conta " + numero);
	    	
	    }
	    
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
	    
	    public double GetSaldo() {
	    	return this.saldo;
	    }

	    public double getNumero() {
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

}
