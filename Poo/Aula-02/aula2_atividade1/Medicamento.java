package aula2_atividade1;

import javax.swing.JOptionPane;

public class Medicamento {
String nome;
String apresenta��o;
double valor;

	void cadastro() {
		nome = JOptionPane.showInputDialog("nome do remedio");
		apresenta��o = JOptionPane.showInputDialog("que tipo de apresenta��o ");
		valor = Double.parseDouble(JOptionPane.showInputDialog("valor do remedio "));
	}
	String retorna () {
		return "\n nome do remedio "+nome+"\n apresenta��o do remedio "+apresenta��o+"\n valor do remedio  "+valor;
	}
}
