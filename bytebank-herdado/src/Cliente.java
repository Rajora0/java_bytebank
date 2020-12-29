
public class Cliente implements Autentificavel {
	
	private AutentificacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutentificacaoUtil();
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

}
