
public class TestaReferencias {
	
	public static void main(String[] args) {
		
		//Funcionario g1 = new Gerente(); //funciona também 
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Bruno");
		g1.setSalario(5000.0);
		
		//System.out.println("nome é: " + g1.getNome());
		//System.out.println("salário é: " + g1.getSalario());
		
//		Funcionario f1 = new Funcionario(); **não funciona pois agora é abstrato (abstract)**
//		f1.setNome("Roberto");**não funciona pois agora é abstrato (abstract)**
//		f1.setSalario(2000.0);**não funciona pois agora é abstrato (abstract)**
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Carla");
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setNome("Paulo");
		d.setSalario(2000.0);

		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
//		controle.registra(f1); **não funciona pois agora é abstrato (abstract)**
		controle.registra(ev);
		controle.registra(d);
		
		
		
		System.out.println("bonificaçao será: " + controle.getSoma());	
		
	}

}
