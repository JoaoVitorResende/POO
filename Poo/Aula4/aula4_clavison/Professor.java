package aula4_clavison;

import javax.swing.JOptionPane;

public class Professor {
	private String nome;
	private int idade;
	private String sexo;
	public void cadastro(){
		setNome(JOptionPane.showInputDialog("nome do professor"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("idade de professor")));
		setSexo(JOptionPane.showInputDialog(" sexo do professor "));
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
		return "\n nome do professor "+getNome()+"\n idade de professor "+getIdade()+"\n sexo do professor "+getSexo();
	}
}
