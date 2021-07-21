package br.com.bytebank.banco.teste.util;

import java.util.Collection;//mãe da classe List, porém os métodos get só funcionam dentro da List e suas filhas
import java.util.LinkedList;
import java.util.List;//mãe da classe ArrayList/LinkedList/Vector

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		// Isso  " < > "  se chama Generics
		List<Conta> lista = new LinkedList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);
        Conta cc2 = new ContaCorrente(23, 22);
        lista.add(cc2);
        
        System.out.println("Tamanho do array: " + lista.size());   
        System.out.println("A conta corrente é: " + (Conta) lista.get(0));
        
        Conta ref = (Conta)lista.get(0);
        System.out.println("A agencia da conta, na posição(0), é: " + ref.getAgencia());
        
        lista.remove(0);
        
        System.out.println("O novo tamanho do array: " + lista.size());
        
        Conta cc3 = new ContaCorrente(24, 33);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(25, 44);
        lista.add(cc4);
        
//        for (int i = 0; i < lista.size(); i++) {
//        	Object oRef = lista.get(i);
//        	System.out.println(oRef);
//        } 
//        
//        for (Object oRef : lista) {     ---> Esse for é uma versão reduzida do de cima
//        	System.out.println(oRef);
//        }
        
        for(Conta conta : lista) {
        	System.out.println(conta);
        }
        
        
        
        
        
	}

}
