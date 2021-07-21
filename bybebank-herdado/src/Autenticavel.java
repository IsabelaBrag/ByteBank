// contrato autenticavel que precisa ser assinado 
	//quem assinar o contrato precisa implementar
		//metodo setSenha
		//metodo autentic

public abstract interface Autenticavel {
	
	public abstract void setSenha (int senha);

	public abstract boolean autentic(int senha);
	
	}

