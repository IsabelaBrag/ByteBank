
public class TestaGerente {
	
	public static void main(String[] args) {
		
		Autenticavel referencia = new Administrador();	
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("3878888845");
		g1.setSalario(2100.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2501);
		boolean autenticou = g1.autentic(2501);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}

}
