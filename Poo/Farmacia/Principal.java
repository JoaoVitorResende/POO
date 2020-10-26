package Farmacia;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Produtos>produtos= new ArrayList<Produtos>();
		ArrayList<Cliente>clientes= new ArrayList<Cliente>();
		int op =0;
		do {
			op = menu();
			if(op==1) {
			Cliente c = new Cliente();
			c.cadastro();
			clientes.add(c);
			}
			if(op==2) {
			Medicamento m = new Medicamento();
			m.cadastro();
			produtos.add(m);
			}
			if(op==3) {
			Cliente c = buscacliente(clientes);
			Produtos m = buscaprodutos(produtos);
			m.vender(c);
			}
			if(op==4) {
				String r = "";
			for (Produtos p : produtos) {
				r+=p;
				}
			JOptionPane.showMessageDialog(null,r);
			}
			if(op==5) {
				String r="";
				for (Cliente c : clientes) {
					r+=c;
				}
				JOptionPane.showMessageDialog(null,r);
			}
		} while (op!=6);
	}

	private static Produtos buscaprodutos(ArrayList<Produtos> produtos) {
		String p = "produtos  cadastrados\n";
		for (int i=0; i < produtos.size(); i++) {
			p += (i+1)+" "+produtos.get(i).getNome()+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(p));
		return produtos.get(op-1);
	}

	private static Cliente buscacliente(ArrayList<Cliente> clientes) {
		String a = "Clientes  cadastrados\n";
		for (int i=0; i < clientes.size(); i++) {
			a += (i+1)+" "+clientes.get(i).getNome()+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(a));
		return clientes.get(op-1);
	}

	private static int menu() {	
		String menu = "1 - cadastrar cliente \n"
				+     "2 - cadastra produto \n"
				+ 	  "3 - venda\n "
				+ 	  "4 - mostra estoque\n"
				+ 	  "5 - saldo devedor\n\n"
				+ 	  "6 - sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

}
