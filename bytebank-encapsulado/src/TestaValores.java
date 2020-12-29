
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(12345,23333);
		//System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta(12345,23334);
		Conta conta3 = new Conta(12345,23335);
		
		System.out.println("O total de contas é : "+Conta.getTotal());

	}

}
