package prova3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {
	public static ArrayList<Hobbie> hobbies = new ArrayList<Hobbie>();
	public static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	public static ArrayList<Associacao> associacoes = new ArrayList<Associacao>();

	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			if (op == 1) {
				Hobbie h = new Hobbie();
				h.cadastro();
				hobbies.add(h);
			}
			if (op == 2) {
				Funcionario f = new Funcionario();
				f.cadastro();
				funcionarios.add(f);
			}
			if (op == 3) {
				Funcionario f = buscafuncionarios();
				Associacao a = new Associacao();
				Hobbie h = buscaHobbie();
				a.cadastro(f, h);
				associacoes.add(a);
			}
			if (op == 4) {
				Associacao a = buscaassociacao();
				JOptionPane.showMessageDialog(null, a);
			}
			if (op == 5) {
				String r = " ";
				String b = buscaclassificacao();
				for (Associacao a : associacoes) {
					if (b.equalsIgnoreCase(a.getClassificacao())) {
						r += a + "\n";
					}
				}
				if (r.equals(" ")) {
					JOptionPane.showMessageDialog(null, "não encontrado");
				} else {
					JOptionPane.showMessageDialog(null, r);
				}
			}
		} while (op != 6);
	}

	private static String buscaclassificacao() {
		String classificacoes = "1 -Esporte " + "\n" + " 2 - Música" + "\n" + "3 - Filme" + "\n" + "4 -Culinaria" + "\n"
				+ " 5 - Estudo" + "\n" + " 6 - Festas" + "\n" + "7 - conhecimento intrapessoal" + "\n" + "8 -artes ";
		int op = Integer.parseInt(JOptionPane.showInputDialog(classificacoes));
		if (op == 1) {
			return "esporte";
		}
		if (op == 2) {
			return "musica";
		}
		if (op == 3) {
			return "filme";
		}
		if (op == 4) {
			return "culinaria";
		}
		if (op == 5) {
			return "festas";
		}
		if (op == 6) {
			return "estudos";
		}
		if (op == 7) {
			return "conhecimento intrapessoal";
		}
		if (op == 8) {
			return "artes";
		}
		return "false";
	}

	private static int menu() {
		String menu = "1- cadastrar hobbie \n" + "2- cadastrar funcionario\n" + "3 - associar hobbie com funcionario\n"
				+ "4 - listar hobbie de um funcionario\n" + "5 - listar por hobbie um determinado funcionario\n\n"
				+ "6 - sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

	private static Associacao buscaassociacao() {
		String a = "funcionarios  cadastrados\n";
		for (int i = 0; i < associacoes.size(); i++) {
			a += (i + 1) + " " + associacoes.get(i).getNome() + "\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(a));
		return associacoes.get(op - 1);
	}

	private static Hobbie buscaHobbie() {
		String a = "hobbies cadastrados\n";
		for (int i = 0; i < hobbies.size(); i++) {
			a += (i + 1) + " " + hobbies.get(i).getNome() + "\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(a));
		return hobbies.get(op - 1);
	}

	private static Funcionario buscafuncionarios() {
		String a = "funcionarios  cadastrados\n";
		for (int i = 0; i < funcionarios.size(); i++) {
			a += (i + 1) + " " + funcionarios.get(i).getNome() + "\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(a));
		return funcionarios.get(op - 1);
	}

}
