
public class TestaReferencias {
	
	public static void main(String[] args) {
		
		//Funcionario g1 = new Gerente(); //funciona tamb�m 
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Bruno");
		g1.setSalario(5000.0);
		
		//System.out.println("nome �: " + g1.getNome());
		//System.out.println("sal�rio �: " + g1.getSalario());
		
//		Funcionario f1 = new Funcionario(); **n�o funciona pois agora � abstrato (abstract)**
//		f1.setNome("Roberto");**n�o funciona pois agora � abstrato (abstract)**
//		f1.setSalario(2000.0);**n�o funciona pois agora � abstrato (abstract)**
		
		EditorVideo ev = new EditorVideo();
		ev.setNome("Carla");
		ev.setSalario(2500.0);
		
		Designer d = new Designer();
		d.setNome("Paulo");
		d.setSalario(2000.0);

		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
//		controle.registra(f1); **n�o funciona pois agora � abstrato (abstract)**
		controle.registra(ev);
		controle.registra(d);
		
		
		
		System.out.println("bonifica�ao ser�: " + controle.getSoma());	
		
	}

}
