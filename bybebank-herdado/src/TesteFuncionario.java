
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
//		Funcionario nico = new Funcionario(); **não funciona pois agora é abstrato (abstract)**
		
//		Funcionario cliente = new Cliente();
//		cliente.setSalario(3000.0); 
		
		
		Gerente nico = new Gerente();
		nico.setNome("nicolas");
		nico.setCpf("89789545874");
		nico.setSalario(2600);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getCpf());
		System.out.println(nico.getSalario());
		System.out.println(nico.getBonificacao());
		
		//nico.salario = 300;
		
	}

}
