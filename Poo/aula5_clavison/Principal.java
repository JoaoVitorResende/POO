package aula5_clavison;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		String menu = " 1 - cadastro cliente \n"
				+ 	  " 2 - cadastros produtos \n"
				+ 	  " 3 - vendas \n "
				+	  " 4 - relatório clientes \n"
				+ 	  " 5 - relatório produtos \n \n "
				+ 	  " 6 - sair";
		int op = 0;
		do {
			 op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op==1) {
				Cliente c = new Cliente();
				clientes.add(c);
			}
			if(op==2) {
				Produto p = new Produto(); 
				produtos.add(p);
			}
			if(op==3) {
				String c ;
				Venda v = new Venda();
				Cliente x =cliente(c);
			}
			if(op==4) {
				String r =" ";
				for (Cliente c : clientes) {
					r+=c;
				}
				JOptionPane.showMessageDialog(null,r);
			}
			if(op==5) {
				String re =" ";
				for (Produto p : produtos) {
					re+=p;
				}
				JOptionPane.showMessageDialog(null,re);
			}
		} while (op!=6);
	}
	 public  static String cliente(ArrayList<Cliente>c) {
		String busca = JOptionPane.showInputDialog("nome do cliente a ser procurado");
			for (Cliente cliente : c) {
				if(busca.equalsIgnoreCase(cliente.getNome())) {
					return cliente.getNome();
			}
		}
		return null;
	}
}
