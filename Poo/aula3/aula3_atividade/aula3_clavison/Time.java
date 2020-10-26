package aula3_clavison;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Time {
	ArrayList<Jogadores> jogadores = new ArrayList<Jogadores>();
	private String nome;
	public int m = 0;
	public String re;
	String menu = " 1 - cadastra time e seus jogadores \n" + "  2 - sair ";
	int op = 0;
	int x = 0;
	public String artilheiro="";
	public int camisa=0;
	public int maior=0;
	public int maiorT=0;
	public String timeM;

	public void cadastro() {
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (op == 1) {
				for (int i = 0; i < 2; i++) {// cadastra 2 times
					setNome(JOptionPane.showInputDialog("nome do time "));
					do {
						Jogadores jog = new Jogadores();
						jog.cadastro();
						jogadores.add(jog);
						x = Integer.parseInt(JOptionPane.showInputDialog(" 1-quer mias um jogador 2- sair"));
					} while (x != 2);
				}
			}
		} while (op != 2);
		for (Jogadores jog : jogadores) {//ve o melhor jogador e faz a mostra dos times cadastrados
			artilheiro=jog.maiorn;
			camisa=jog.maiorc;
			maior=jog.maiorg;
			re+=jog.toString();
		}
		for (Jogadores joga : jogadores) {//pega o melhor time
			if(joga.golsT>maiorT){
				timeM=getNome();
				maiorT=joga.golsT;
			}
		}
	}
	public  String Nometime(){
		return getNome();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.equalsIgnoreCase("")) {
			JOptionPane.showInputDialog("nome invalido tente novamente");
		} else {
			this.nome = nome;
		}
	}

	public String toString() {
		return re;
	}

}
