
public class TestaGetSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(12343,23333);
		conta.setNumero(1234);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("111.111.111-11");
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getCpf());
		
	}
}
