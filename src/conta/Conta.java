package conta;

public class Conta {

	private double saldo;
	private int conta;
	private int agencia;
	private static int totalContas;

	public Conta(int agencia, int conta) {
		totalContas++;
		this.agencia = agencia;
		this.conta = conta;
	}

	public double deposita(double valor) {
		this.saldo += valor;
		System.out.println("Valor depositado: "+valor);
		System.out.println("Saldo Atual: "+this.getSaldo());
		return valor;
		
	}
//		//UNCHECKED
//	public void saca(double valor){
//		
//		if (this.saldo < valor) {
//			throw new SaldoInsuficienteException("Saldo: "+this.saldo+", Valor: " +valor);
//			
//		} 
//		this.saldo -= valor;
//	}
	
		//CHECKED
	public void saca(double valor) throws SaldoInsuficienteException{
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: "+this.saldo+", Valor: " +valor);
			
		} 
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
		this.saca(valor); 
		destino.deposita(valor);
			
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getConta() {
		return this.conta;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public static void getTotalContas() {
		System.out.println("Total de contas criadas: " + totalContas);
	}

}
