package aula1;

import javax.swing.JOptionPane;

public class Atividade1 {

	public static void main(String[] args) {
		String [] nome = new String [5];
		Double [] altura = new Double [5];
		Double [] peso = new Double [5];
		Double [] IMC= new Double [5];
		
		for (int i = 0; i < peso.length; i++) {
			nome[i]=JOptionPane.showInputDialog("ponha o nome ");
			altura[i]=Double.parseDouble(JOptionPane.showInputDialog("ponha a altura da pessoa"));
			peso[i]=Double.parseDouble(JOptionPane.showInputDialog("ponnha o seu peso "));
			IMC[i]=peso[i]/altura[i]*altura[i];
		}
		System.out.println("----------Status------------");
		for (int i = 0; i < peso.length; i++) {
			System.out.print(nome[i]);
			System.out.print(IMC[i]+"\t");
		}
	}

}
