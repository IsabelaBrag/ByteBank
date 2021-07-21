package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(3);
		System.out.println(true);
		
		
		Object cc = new ContaCorrente(33, 22); // ocorre polimorfismo uma referencia mais generica que tem "Object"
		Conta cp = new ContaPoupanca(55, 33); // pode ser referenciado por outra referencia generica a "Conta", também
		Cliente carlos = new Cliente(); //referenciado pela referencia menos generica
		
		
		//System.out.println(cc.toString()); //referenciado na classe Object
		System.out.println(cp);
		System.out.println(cc);
		
		println(carlos);
		
	}
	
	static void println() {
		
	}
	
	static void println(int a) {
		
	}
	
	static void println(boolean valor) {
		
	}
	
	static void println(Conta conta) {
		
	}
	
	static void println(Object x) {
		
	}

}
