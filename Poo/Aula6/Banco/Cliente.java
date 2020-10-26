package Banco;

import javax.swing.JOptionPane;

public class Cliente {
	private String nome;
	private int idade ;
	private String sexo ;
	Cliente (){
		setNome(JOptionPane.showInputDialog("nome do cliente"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("idade do cliente")));
		setSexo(JOptionPane.showInputDialog("sexo do cliente"));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String toString() {
		return "\n nome "+getNome()+"\n idade "+getIdade()+"\n sexo "+getSexo();
	}
}
