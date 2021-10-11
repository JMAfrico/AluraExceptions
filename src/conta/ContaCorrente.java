package conta;

public class ContaCorrente extends Conta implements tributavel{

	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
		System.out.println("Conta Corrente criada com sucesso. ");
		System.out.print("Agência: " + agencia);
		System.out.println(" Conta: " + conta);
		System.out.println();
	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double tarifa = 0.20;
		System.out.println("Valor de saque: "+valor + " + " + tarifa+" tarifa");
		super.saca(valor + tarifa);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.02;
	}
	
	
}
