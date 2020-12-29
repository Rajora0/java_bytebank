
public class TesteReferencias {
	
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("111.222.333-44");
		g1.setSalario(5000);
		
		EditorDeVideo e1 = new EditorDeVideo();
		e1.setNome("Tiago");
		e1.setCpf("111.222.333-66");
		e1.setSalario(2500);
		
		Designer d1 = new Designer();
		d1.setNome("Daniel");
		d1.setCpf("111.222.333-77");
		d1.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e1);
		controle.registra(d1);
		
		System.out.println(controle.getSoma());
	}

}
