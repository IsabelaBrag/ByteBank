package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		int[] idades = new int[5];
		// int é primitivo, mas o Java fez o Integer que é uma classe que cria um objeto que guarda o int
		
		String[] nomes = new String[5]; 
		
		int idade = 21; //a transformação de primitivo para objeto se chama Autoboxing
		
		//Integer idaderef = new Integer(21); //o java já faz isso de baixo dos panos
		Integer idaderef = Integer.valueOf(21); //Autoboxing - transformar um int/primitivo para uma referencia/Objeto	
		System.out.println(idaderef.intValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); //numero de bits
		System.out.println(Integer.BYTES); // numero de bytes
		
		int valor = idaderef.intValue();//Unboxing - transforma um objeto em um primitivo
		
		
		String s = args[0];
		Integer numero = Integer.parseInt(s); 
		System.out.println(numero);		
				
				
		List <Integer> numeros = new ArrayList<Integer>(); //colocando <> para ficar mais seguro
		
		numeros.add(idade); //não da problema, pois o int é um primitivo que o java ja verifica automaticamente
							// na classe Ingeter que cria um objeto que guarda o primitivo	

	}

} 

		
