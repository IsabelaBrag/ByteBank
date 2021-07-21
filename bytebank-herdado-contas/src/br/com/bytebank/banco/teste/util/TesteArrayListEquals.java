package br.com.bytebank.banco.teste.util;
import java.util.ArrayList;
import java.util.Collection; //mãe da classe List, porém os métodos get só funcionam dentro da List e suas filhas
import java.util.List; //mãe da classe ArrayList

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		// Isso  " < > "  se chama Generics
		// usado para especificar que o array criado é somente de contas, não pode criar por exemplo um cliente
		// definir tipos genéricos especiais (classes ou estruturas) 
		//do tipo seguro sem ter que se comprometer com um tipo específico de dados em tempo de projeto.
		Collection<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);
        Conta cc2 = new ContaCorrente(23, 22);
        lista.add(cc2);
        Conta cc3 = new ContaCorrente(23, 22); // outro objeto mas referenciando a mesma conta
        											//porém não adicionamos ele pois é a mesma conta

        boolean existe = lista.contains(cc3); //metodo contains para verificar se true ou false
        									  //com o novo objeto não verifica pois não foi adicionado
        									  //para que verifique TRUE vamos modificar a classe conta
        //Deu true pois sobreescrevemos o método do Object equals na Classe Conta
        
        System.out.println("já existe essa conta: " + existe);
        
//        for (Conta conta : lista) {
//        	if(conta.equals(cc3)) {
//        		System.out.println("já tenho essa conta");	
//        }
//      }   
        for(Conta conta : lista) {
        	System.out.println(conta);
        }
	}
}