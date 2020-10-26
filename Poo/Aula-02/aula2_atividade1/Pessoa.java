package aula2_atividade1;

import javax.swing.JOptionPane;

public class Pessoa {
	String nome;
	String sexo;
	Medico cam = new Medico();
	Medicamento came = new Medicamento();
	 void cadastro() {
		 nome = JOptionPane.showInputDialog("nome da pessoa");
		 sexo = JOptionPane.showInputDialog("sexo da pessoa ");
		 cam.cadastro();
		 came.cadastro();
	 }
	 String retorna() {
		 return " \n nome "+nome +" \n sexo "+sexo+cam.retorna()+came.retorna();
	 }
}
