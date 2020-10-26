package Banco;

import javax.swing.JOptionPane;

public class Agencia {
	private int numero;
	private String cidade;
	
	public void cadastra() {
		setCidade(JOptionPane.showInputDialog("ponha o nome da cidade"));
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("ponha o numero da agencia")));
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
