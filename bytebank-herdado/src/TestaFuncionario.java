
public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		nico.setCpf("111.111.111-11");
		nico.setNome("Nico S.");
		nico.setSalario(20000);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		System.out.println();
	}

}
