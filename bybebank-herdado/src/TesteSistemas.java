
public class TesteSistemas {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2501);
		
		Administrador adm = new Administrador();
		adm.setSenha(1234);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(5432);
		
		SistemaInterno si = new SistemaInterno();
		si.autentic(g);
		si.autentic(adm);
		si.autentic(cliente);
		
	}

}
