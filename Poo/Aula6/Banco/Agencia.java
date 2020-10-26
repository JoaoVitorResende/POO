package Banco;

import javax.swing.JOptionPane;

public class Agencia {
	private int numero ;
	private String cidade;
	private String bairro;
	Agencia(){
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("numero da agencia ")));
		setCidade(JOptionPane.showInputDialog("nome da cidade da agencia"));
		setBairro(JOptionPane.showInputDialog("nome do bairro da agencia"));
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
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String toString() {
		return "\n Numero da Agencia "+getNumero()+"\n Cidade "+getCidade()+"\n Bairro "+getBairro();
	}
}
