
public class SistemaInterno {
	
	private int senha = 1111;
	
	public void autentica(Autentificavel fa) {
		
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entra no sistema!");
		} else {
			System.out.println("Não pode entra no sistema!");
		}
		
	}
}
