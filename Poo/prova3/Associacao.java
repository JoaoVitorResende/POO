package prova3;

import javax.swing.JOptionPane;

public class Associacao {
	private String nome;
	private String hobbie;
	private String vezes;
	private String classificacao;
	public void cadastro(Funcionario f, Hobbie h) {
		setNome(f.getNome());
		setHobbie(h.getNome());
		setClassificacao(h.getClassificacao());
		setVezes(JOptionPane.showInputDialog("quantas vezes você faz esse hobbie")+"\n");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHobbie() {
		return hobbie;
	}
	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}
	public String getVezes() {
		return vezes;
	}
	public void setVezes(String vezes) {
		this.vezes = vezes;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String toString() {
		return "Nome "+getNome()+"\n hobbie "+getHobbie()+"\n classificação "+getClassificacao()+"\n vezes "+getVezes();
	}
}
