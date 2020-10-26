package Banco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String menu ="1 - cadastrar agencias\n" + 
				"2 - cadastrar clientes\n" + 
				"3 - cadastrar contas\n" + 
				"4 - Realizar saque\n" + 
				"5 - realizar depósito\n" + 
				"6 - Listar o nome dos clientes e o saldo\n\n"+
			    "7 - Sair";
		int op = 0 ;
		ArrayList<Agencia>agencias= new ArrayList<Agencia>();
		ArrayList<Cliente>clientes= new ArrayList<Cliente>();
		ArrayList<Conta>contas= new ArrayList<Conta>();
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op==1) {
				Agencia a = new Agencia();
				agencias.add(a);
			}
			if(op==2) {
				Cliente c = new Cliente();
				clientes.add(c);
			}
			if(op==3) {
				Cliente x = buscaCliente(clientes);
				Agencia z =  buscaAgencia(agencias);
				Conta cadastro = new Conta ();
					cadastro.cadastro(x,z);
					contas.add(cadastro);
			}
			if(op==4) {
				Cliente x = buscaCliente(clientes);
				Conta c = new Conta();
				c.sacar(x);
				if(c.sacar(x)){
					JOptionPane.showMessageDialog(null,"saque feito com sucesso");
				}else {
					JOptionPane.showMessageDialog(null, " o saque não foi efetuado");
				}
			}
			if(op==5) {
				Cliente x =buscaCliente(clientes);
				Conta c = new Conta ();
				c.depositar(x);
			}
			if(op==6) {
				for (Conta c : contas) {
					JOptionPane.showMessageDialog(null, c);
				}
			}
		} while (op!=7);
	}
	private static Cliente buscaCliente(ArrayList<Cliente>lista) {
		String c = "Clientes cadastrados\n";
		for (int i=0; i < lista.size(); i++) {
			c += (i+1)+" "+lista.get(i).getNome()+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(c));
		return lista.get(op-1);
	}
	private static Agencia buscaAgencia(ArrayList<Agencia>lista) {
		String c = "Clientes cadastrados\n";
		for (int i=0; i < lista.size(); i++) {
			c += (i+1)+" "+lista.get(i).getNumero()+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(c));
		return lista.get(op-1);
	}

}
