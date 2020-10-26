package Predio;

public abstract class Condominio {
	protected double saldo;
	protected final int valor =5;
	
	public abstract void calcula(Apartamento a , Despesa d);
	
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getValor() {
		return valor;
	}
	
}
