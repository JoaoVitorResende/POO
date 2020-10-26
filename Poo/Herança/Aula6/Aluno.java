package Aula6;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso ;
	@Override
	public void cadastro () {
		 super.cadastro();
		 setMatricula(Integer.parseInt(JOptionPane.showInputDialog("numero da matricula")));
		 setCurso(JOptionPane.showInputDialog("nome do curso"));
	 }
	@Override
	public String toString() {
		return super.toString()+"\n"+getMatricula()+"\n"+getCurso();
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
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}
