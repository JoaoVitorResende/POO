package aula3_clavison;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalTime {

	public static void main(String[] args) {
		ArrayList<Time> times = new ArrayList<Time>();
		String nomet="";
		String menu = "1 - cadastrar \n"
				+ "2 - listar \n"
				+ "3 - artilheiro do campeonato \n"
				+ "4 - qual time fez mais gols \n"
				+ "5 - sair";
		int z =0;
		do{
			z=Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(z==1){
				Time t = new Time();
				t.cadastro();
				times.add(t);
			}
			if(z==2){
				for (Time t : times) {
					nomet=t.Nometime();
					t.toString();
					JOptionPane.showMessageDialog(null,nomet+t.toString());
				}
			}
			if(z==3){
				for (Time ti : times) {
					JOptionPane.showMessageDialog(null,"\n nome do artilheiro do campeonato "+ti.artilheiro+"\n camisa "+ti.camisa+"\n numero de gols feito "+ti.maior);
				}
			}
			if(z==4){
				for (Time tim : times) {
					JOptionPane.showMessageDialog(null,"\n melhor time do campeonato "+tim.timeM+"\n seu numero de gols "+tim.maiorT);
				}
			}
		}while(z!=5);
	}

}
