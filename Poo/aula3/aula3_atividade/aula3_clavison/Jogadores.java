package aula3_clavison;

import javax.swing.JOptionPane;

public class Jogadores {
	private String nome;
	private int camisa;
	private int gols;
	public int maiorg = 0;
	public int maiorc = 0;
	public String maiorn;
	public int golsT=0;
	int x = 0;

	public void cadastro() {
		setNome(JOptionPane.showInputDialog("nome do jogador "));
		setCamisa(Integer.parseInt(JOptionPane.showInputDialog("numero da camisa ")));
		setGols(Integer.parseInt(JOptionPane.showInputDialog("quantos gols foram feitos ?")));
		golsT+=getGols();
		if (maiorg < getGols()) {
			maiorg = getGols();
			maiorn = getNome();
			maiorc = getCamisa();
		}
		
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if (nome.equalsIgnoreCase("")) {
			JOptionPane.showInputDialog("nome invalido tente novamente");
		} else
			this.nome = nome;
	}

	public int getCamisa() {
		return camisa;
	}

	public void setCamisa(int camisa) {
		if (camisa >= 10 && camisa <= 50) {
			this.camisa = camisa;
		} else {
			camisa = Integer.parseInt(JOptionPane.showInputDialog("camisa numero invalido tente novamente"));
		}
	}

	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		if (gols >= 0) {
			this.gols = gols;
		} else {
			JOptionPane.showInputDialog("o gol não pode ser negativo");
		}
	}

	public String toString() {
		return "\n nome " + getNome() + "\n camisa " + getCamisa()+ "\n gols marcados "+getGols();
	}

}
