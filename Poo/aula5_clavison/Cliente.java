package aula5_clavison;

import javax.swing.JOptionPane;

public class Cliente {
	private String nome ;
	private double devendo;
	Cliente(){
	setNome(JOptionPane.showInputDialog("nome do cliente"));
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDevendo() {
		return devendo;
	}
	public void setDevendo(double devendo) {
		this.devendo = devendo;
	}
	public String toString() {
		return "\n nome "+getNome()+"\n devendo "+getDevendo();
	}
}
