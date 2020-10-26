package aula2_atividade1;

import javax.swing.JOptionPane;

public class Medicamento {
String nome;
String apresentação;
double valor;

	void cadastro() {
		nome = JOptionPane.showInputDialog("nome do remedio");
		apresentação = JOptionPane.showInputDialog("que tipo de apresentação ");
		valor = Double.parseDouble(JOptionPane.showInputDialog("valor do remedio "));
	}
	String retorna () {
		return "\n nome do remedio "+nome+"\n apresentação do remedio "+apresentação+"\n valor do remedio  "+valor;
	}
}
