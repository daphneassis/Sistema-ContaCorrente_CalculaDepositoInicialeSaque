package entities;

public class Conta {
	private  int numconta;
	private  String nome;
	private  double saldo;
	
	public Conta() {
	}
	public Conta(int numconta, String nome) {
		this.numconta=numconta;
		this.nome=nome;
	}
	public Conta(int numconta, String nome, double depositoInicial) {	
		this.numconta=numconta;
		this.nome=nome;
		add(depositoInicial);
	}

	public int getNumconta() {
		return numconta;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public double add(double deposito) {
		return saldo+=deposito;
	}
	public double less(double saque) {
		return saldo-=saque+5;
	}
	public String toString() {
		return "Account data:Account " 
		+ numconta
		+ ", Holder: "
		+nome
		+ ", Balance: $"
		+String.format("%.2f", saldo)
		;
	}
}