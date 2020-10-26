package Predio;

import javax.swing.JOptionPane;

public class Despesa {
	private String nome;
	private double valor;
	private String ano;
	private String mes;
	
	public void cadastro() {
		setNome(JOptionPane.showInputDialog("ponha o nome da conta"));
		setValor(Double.parseDouble(JOptionPane.showInputDialog("ponha o valor da conta")));
		setAno(JOptionPane.showInputDialog("ponha o ano da conta"));
		setMes(JOptionPane.showInputDialog("ponha o mes da conta "));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
	
}
