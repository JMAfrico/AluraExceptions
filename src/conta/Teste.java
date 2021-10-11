package conta;

public class Teste {

	// public static void main(String[] args) UNCHECKED
	public static void main(String[] args) throws SaldoInsuficienteException {// CHECKED
//		ContaCorrente contaCorrente = new ContaCorrente(5544, 87996);
//		contaCorrente.deposita(100.0);
//		
//		contaCorrente.saca(50);
//		contaCorrente.saca(60);
//		
//		contaCorrente.deposita(100.0);
//		System.out.println(contaCorrente.getSaldo());

		ContaCorrente contaCorrente = new ContaCorrente(5544, 87996);
		contaCorrente.deposita(100.0);

		try {
			contaCorrente.saca(50);
			contaCorrente.saca(60);
			contaCorrente.deposita(100.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Exceção: "+ex.getMessage());
		}

		
		System.out.println(contaCorrente.getSaldo());

	}
}
