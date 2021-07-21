
public class TestaGeteSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1200, 5432);
		//conta.numero = 1300;
		//conta.setNumero(1300);
		System.out.println(conta.getNumero());
		
		Cliente isabela = new Cliente();
		//conta.isabela = isabela;
		
		conta.setTitular(isabela); //para não ficar com valor null
		
		isabela.setNome("isabela bragança");
		
		System.out.println(conta.getTitular().getNome());
	
		isabela.setProfissao("física");
		
		System.out.println(conta.getTitular().getProfissao());
		
		
		
		
			
		
		
	}
	

}
