
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(1234, 1234);
		cc.deposita(100);
		
		ContaPoupanca cp = new ContaPoupanca(1235, 1235);
		cp.deposita(200);
		
		cc.transfere(10, cp);
		
		System.out.println(cp.getSaldo());
		System.out.println(cc.getSaldo());
		
		

	}

}
