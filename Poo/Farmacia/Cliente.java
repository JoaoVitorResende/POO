package Farmacia;

import javax.swing.JOptionPane;

public class Cliente {
	private String nome;
	private double saldo;
	public void cadastro() {
		setNome(JOptionPane.showInputDialog("ponha o nome do usario"));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String toString() {
		return "\n nome "+getNome()+"\n saldo devedor de  "+getSaldo();
	}
}
