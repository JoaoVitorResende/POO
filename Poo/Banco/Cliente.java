package Banco;

import javax.swing.JOptionPane;

public class Cliente {
	private String nome;
	private String sexo;
	private int idade;
	
	public void cadastro() {
		setNome(JOptionPane.showInputDialog("ponha o nome do cliente"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("ponha a idade do cliente")));
		setSexo(JOptionPane.showInputDialog("ponha o sexo do cliente"));
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
