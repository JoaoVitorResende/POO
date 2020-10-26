package aula2_atividade1;

import javax.swing.JOptionPane;

public class Medico {
	String nome ;
	String especialidade;
	 void cadastro () {
		 nome = JOptionPane.showInputDialog("nome do medico ");
		 especialidade = JOptionPane.showInputDialog("especialidade do medico ");
	 }
	 String retorna () {
		 return " \n nome do medico "+nome+"\n especialidade "+especialidade;
	 }
}
