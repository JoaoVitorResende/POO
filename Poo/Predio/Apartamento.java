package Predio;

import javax.swing.JOptionPane;

public class Apartamento {
	private int numero;
	private String proprietario;
	private String bloco;
	private int metros;
	private int apartamentos;
	
	public void cadastro() {
		setBloco(JOptionPane.showInputDialog("ponha o bloco do predio"));
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("ponha o numero do apartamento")));
		setProprietario(JOptionPane.showInputDialog("ponha o nome do proprietario"));
		setMetros(Integer.parseInt(JOptionPane.showInputDialog("ponha quantos metros quadrados")));
		setApartamentos(1+getApartamentos());
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	public int getMetros() {
		return metros;
	}
	public void setMetros(int metros) {
		this.metros = metros;
	}
	public int getApartamentos() {
		return apartamentos;
	}
	public void setApartamentos(int apartamentos) {
		this.apartamentos = apartamentos;
	}
	
}
