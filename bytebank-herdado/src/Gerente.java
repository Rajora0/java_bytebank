
public class Gerente extends Funcionario implements Autentificavel{
	
	private AutentificacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutentificacaoUtil();
	}
	
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	public double getBonificacao() {
		return super.getSalario();
	}
	
	
}
