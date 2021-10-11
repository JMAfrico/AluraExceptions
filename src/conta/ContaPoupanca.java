package conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int conta) {
		super(agencia, conta);
		System.out.println("Conta Poupança criada com sucesso. ");
		System.out.print("Agência: " + agencia);
		System.out.println(" Conta: " + conta);
		System.out.println();
	}

}
