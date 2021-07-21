package br.com.bytebank.banco.teste.util;
import java.util.ArrayList;
import java.util.Collection; //m�e da classe List, por�m os m�todos get s� funcionam dentro da List e suas filhas
import java.util.List; //m�e da classe ArrayList

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		// Isso  " < > "  se chama Generics
		// usado para especificar que o array criado � somente de contas, n�o pode criar por exemplo um cliente
		// definir tipos gen�ricos especiais (classes ou estruturas) 
		//do tipo seguro sem ter que se comprometer com um tipo espec�fico de dados em tempo de projeto.
		Collection<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);
        Conta cc2 = new ContaCorrente(23, 22);
        lista.add(cc2);
        Conta cc3 = new ContaCorrente(23, 22); // outro objeto mas referenciando a mesma conta
        											//por�m n�o adicionamos ele pois � a mesma conta

        boolean existe = lista.contains(cc3); //metodo contains para verificar se true ou false
        									  //com o novo objeto n�o verifica pois n�o foi adicionado
        									  //para que verifique TRUE vamos modificar a classe conta
        //Deu true pois sobreescrevemos o m�todo do Object equals na Classe Conta
        
        System.out.println("j� existe essa conta: " + existe);
        
//        for (Conta conta : lista) {
//        	if(conta.equals(cc3)) {
//        		System.out.println("j� tenho essa conta");	
//        }
//      }   
        for(Conta conta : lista) {
        	System.out.println(conta);
        }
	}
}