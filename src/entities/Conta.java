package entities;

public class Conta {

	private int numero;
	private String titular;
	private double saldo;

	public Conta() {

	}

	public Conta(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void AbrirConta(int numero) {

		this.numero = numero;
	}

	public void Deposito(double valor) {

		saldo = saldo + valor;

	}

	public void Saque(double valor) {

		saldo = (saldo - valor) - 5;

	}

	public String toString() {
		return "Conta: " 
				+ numero
				+ " , Titular: "
				+ titular
				+ " Saldo: R$:"
				+ String.format("%.2f", saldo);

	}

}
