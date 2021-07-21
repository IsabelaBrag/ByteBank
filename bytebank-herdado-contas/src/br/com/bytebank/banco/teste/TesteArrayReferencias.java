package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias { 
	
	public static void main(String[] args) {
		
		 Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 33);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(33, 44);
		referencias[1] = cc2;
		
//		Cliente cliente = new Cliente();
//		conta[2] = cliente;
//		
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1]; //type cast referencia especifica
		
		//Conta ref = conta[1]; 
		
		
		System.out.println(cc2.getNumero()); //mesmo valor referencia cc2
		System.out.println(((Conta) referencias[1]).getNumero()); //mesmo valor referencia conta[1]
		System.out.println(ref.getNumero()); //mesmo valor referencia ref, que foi declarada
		// conclusão: três referências apostadas para ContaCorrente(33,44)
		
		System.out.println(referencias[3]); // imprime nulo, pois nao declaramos
		System.out.println(referencias[0]); // imprime a conta corrente com numero e agencia
		
		
 	}

}
