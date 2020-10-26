package prova3;

import javax.swing.JOptionPane;

public class Hobbie {
	private String nome;
	private String classificacao;

	public void cadastro() {
		setNome(JOptionPane.showInputDialog("ponha o nome do seu hobbie"));
		int op = menu();
		do {
			if(op==1) {
				setClassificacao("esporte");
				break;
			}
			if(op==2) {
				setClassificacao("musica");
				break;
			}
			if(op==3) {
				setClassificacao("filme");
				break;
			}
			if(op==4) {
				setClassificacao("culinaria");
				break;
			}
			if(op==5) {
				setClassificacao("estudo");
				break;
			}
			if(op==6) {
				setClassificacao("festas");
				break;
			}
			if(op==7) {
				setClassificacao("conhecimento intrapessoal");
				break;
			}
			if(op==8) {
				setClassificacao("arte");
				break;
			}
		} while (op != 9);
	}

	private int menu() {
		String menu = "1 -Esporte " + "\n" + " 2 - Música" + "\n" + "3 - Filme" + "\n" + "4 -Culinaria" + "\n"
				+ " 5 - Estudo" + "\n" + " 6 - Festas" + "\n" + "7 - conhecimento intrapessoal" + "\n" + "8 -artes \n\n" + "9 - sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
}
