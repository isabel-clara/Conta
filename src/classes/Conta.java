package classes;

public class Conta {
	
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void deposita (double valor) {
		this.saldo += valor;
	}
	
	protected boolean ehPossivelSaque(double valor) {
		return (valor<=this.saldo);
	}
	
}
