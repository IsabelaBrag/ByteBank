package br.com.bytebank.banco.teste.util;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idaderef = Integer.valueOf(21); //autoboxing
		System.out.println(idaderef.intValue()); //unboxing
		
		Double dref = Double.valueOf(3.2); //autoboxing	
		System.out.println(dref.doubleValue()); //unboxing
		
		Boolean bref = Boolean.FALSE;
		System.out.println(bref.booleanValue());
		
		
		
		
		

	}

}
