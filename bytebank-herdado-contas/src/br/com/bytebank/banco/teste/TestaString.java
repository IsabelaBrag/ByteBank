package br.com.bytebank.banco.teste;

public class TestaString {

	public static void main(String[] args) {

		//int n = 15;
		String nome = "Alura"; // Esse string nõa muda mais, nasceu e morre assim sendo Alura o nome
		
		//System.out.println(nome.length());
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
			
		}
		
		
		
		String vazio = "  Alura  ";
		String outrovazio = vazio.trim();

		System.out.println(vazio.contains("lu")); // verifica se tem isso dentro da String
		System.out.println(vazio.isEmpty()); //verifica se esta vazio em booleano true ou false
		System.out.println(outrovazio.isEmpty()); //comando trim remove o vazio
		
//		String sub = nome.substring(1);
//		System.out.println(sub);

//		int si = nome.indexOf("ur");
//		System.out.println(si);
		
//		char c = nome.charAt(2);
//		System.out.println(c);
		
		// Não precisa usar o new para criar o objeto
		
		//String nome = new String("Alura"); --> CONSIDERA MÁ PRÁTICA
		
//		System.out.println(nome);
//		
//		// funciona se eu criar outra string, exemplo abaixo:
//		
//		String outronome = nome.replace("A","a");
//		// o metodo replace substitui a letra selecionado pela outra selacionada
//		
//		System.out.println(outronome);
//		
//		// outro exemplo abaixo
//		
//		String outronome2 = nome.toLowerCase();
//		// o metodo toLowerCase transforma todas as letras maiusculas em minúsculas.
//		
//		System.out.println(outronome2);
//		
//		String outronome3 = nome.toUpperCase();
//		// o metodo toLowerCase transforma todas as letras minusculas em maiusculas.
//		
//		System.out.println(outronome3);

	}

}
