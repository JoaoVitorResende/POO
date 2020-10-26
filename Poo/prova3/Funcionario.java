package prova3;

import javax.swing.JOptionPane;

public class Funcionario {
	private String nome;
	private String sexo;
	private int idade;
	private String departamento;
	public void cadastro() {
		setNome(JOptionPane.showInputDialog("ponha o seu nome"));
		setSexo(JOptionPane.showInputDialog("ponha seu sexo"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("ponha a sua idade")));
		setDepartamento(JOptionPane.showInputDialog("ponha seu departamento"));
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
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
