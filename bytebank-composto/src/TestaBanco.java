
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente isabela = new Cliente();
		isabela.nome = "Isabela Braganca";
		isabela.cpf = "387-834-028-10";
		isabela.profissao = "programadora";
		
		Conta contaDaIsabela = new Conta();
		contaDaIsabela.deposita(100);
		
		contaDaIsabela.titular = isabela;
		System.out.println(contaDaIsabela.titular);  // teste para ver o formato de chamar um objeto sem o elemento selecionado
		System.out.println(contaDaIsabela.titular.nome);
		System.out.println(contaDaIsabela.titular.cpf);
		System.out.println(contaDaIsabela.titular.profissao);
		
	}

	
}
