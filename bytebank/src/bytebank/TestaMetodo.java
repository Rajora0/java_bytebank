package bytebank;

public class TestaMetodo {
	
	public static void main (String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		
		
		Conta contaMarcela = new Conta();
		contaMarcela.saldo = 1000;
		System.out.println(contaMarcela.saldo);
		
		if(contaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("transfernecia feita com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		
		System.out.println(contaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);

	}

}
