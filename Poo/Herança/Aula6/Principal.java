package Aula6;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
//		1 - Cadastrar Alunos
//		2 - Cadastrar Pediatras
//		3 - Listar todos alunos (dados completos)
//		4 - Listar todos os pediatras (dados completos)
		ArrayList<Pediatra>pediatras = new ArrayList <Pediatra>();
		ArrayList<Aluno>alunos = new ArrayList <Aluno>();
		String menu ="1 - Cadastrar Alunos \n"
				+ 	 "2 - Cadastrar Pediatras \n"
				+    "3 - Listar todos alunos (dados completos) \n"
				+ 	 "4 - Listar todos os pediatras (dados completos) \n\n"
				+ 	 "5 - sair";
		int op = 0;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op==1) {
				Aluno a = new Aluno ();
				a.cadastro();
				alunos.add(a);
			}
			if(op==2) {
				Pediatra p = new Pediatra();
				p.cadastro();
				pediatras.add(p);
			}
			if(op==3) {
				String r =" ";
				for (Aluno a: alunos) {
					r+=a;
				}
				JOptionPane.showMessageDialog(null,r);
			}
			if(op==4) {
				String re =" ";
				for (Pediatra p : pediatras) {
					re+=p;
				}
				JOptionPane.showMessageDialog(null,re);
			}
		} while (op!=5); 
				
	}

}
