package aula2_atividade1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalPessoa {

	public static void main(String[] args) {
		ArrayList<Pessoa>list = new ArrayList<Pessoa>();
		String menu = "1 - Cadastrar Departamento \n"
				+ "2 - Listar Departamentos \n\n"
				+ "3 - sair";
		String r = "resposta";
		int op = 0 ;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op==1) {
				Pessoa cadastro = new Pessoa();
				cadastro.cadastro();
				list.add(cadastro);
			}
			if(op==2) {
				for (Pessoa x : list) {
					r+=x.retorna();
				}
				JOptionPane.showMessageDialog(null, r);
			}
		}while(op!=3);
	}

}
