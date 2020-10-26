package Aula6;

import javax.swing.JOptionPane;

public class Pessoa {
	protected String nome ;
	protected String sexo ;
	
	
	public void cadastro ( ) {
		setNome(JOptionPane.showInputDialog("nome da pessoa"));
		setSexo(JOptionPane.showInputDialog("sexo da pessoa"));
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
	
	public String toString() {
		return "\n nome da pessoa "+getNome()+"\n sexo da pessoa "+getSexo();
	}

}
