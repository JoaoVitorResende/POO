package aula5_clavison;

import javax.swing.JOptionPane;

public class Produto {
	private String nome ;
	private int estoque ;
	private double valor ;
	Produto(){
		setNome(JOptionPane.showInputDialog("nome"));
		setEstoque(Integer.parseInt(JOptionPane.showInputDialog("quantos no estoque")));
		setValor(Double.parseDouble(JOptionPane.showInputDialog("valor do produto")));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String toString() {
		return "\n nome "+getNome()+"\n estoque "+getEstoque()+"\n valor "+getValor();
	}
}
