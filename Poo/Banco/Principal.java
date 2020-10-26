package Banco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Agencia>agencias= new ArrayList<Agencia>();
		ArrayList<Cliente>clientes= new ArrayList<Cliente>();
		ArrayList<Conta>contas= new ArrayList<Conta>();
		int op = 0;
			do {
			op=menu();
			if(op==1) {
				Agencia a = new Agencia();
				a.cadastra();
				agencias.add(a);
			}
			if(op==2) {
				Cliente c = new Cliente();
				c.cadastro();
				clientes.add(c);
			}
			if(op==3) {
				Cliente c = buscacliente(clientes);
				Agencia a = buscaagencia(agencias);
				Conta co = new Conta();
				co.cadastro(c, a);
				contas.add(co);
			}
			if(op==4) {
				Cliente c = buscacliente(clientes);
				Agencia a = buscaagencia(agencias);
				Conta co = new Conta_universitaria();
				co.cadastro(c, a);
				contas.add(co);
			}
			if(op==5) {
				Conta c = buscaConta(contas);
				double vl = Double.parseDouble(JOptionPane.showInputDialog("ponha  o valor desejado"));
				c.saque(vl);
			}
			if(op==6) {
				Conta c = buscaConta(contas);
				double vl = Double.parseDouble(JOptionPane.showInputDialog("valor desejado para depositar"));
				c.deposito(vl);
			}
			if(op==7) {
				Agencia a1 = buscaagencia(agencias);
				Agencia a2 = buscaagencia(agencias);
				Conta c1 = buscaConta(contas);
				Conta c2 = buscaConta(contas);
				if(a1.getNumero()==a2.getNumero()) {
				}
			}
			if(op==8) {
				String r = " ";
				for (Conta c : contas) {
					r+=c;
				}
				JOptionPane.showMessageDialog(null, r);
			}
		} while (op!=9);
	}

	private static Conta buscaConta(ArrayList<Conta> contas) {
		String a = "contas cadastrados\n";
		for (int i=0; i < contas.size(); i++) {
			a += (i+1)+" "+contas.get(i).getDono()+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(a));
		return contas.get(op-1);
	}

	private static Agencia buscaagencia(ArrayList<Agencia> agencias) {
		String a = "agencias  cadastrados\n";
		for (int i=0; i < agencias.size(); i++) {
			a += (i+1)+" "+agencias.get(i).getNumero()+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(a));
		return agencias.get(op-1);
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
		String menu ="1 - cadastrar agencias\n" + 
				"2 - cadastrar clientes\n" + 
				"3 - cadastrar contas (normal)\n" + 
				"4 - cadastrar contas (univeritária)\n" + 
				"5 - Realizar saque (de todos os tipos de conta)\n" + 
				"6 - realizar depósito (normal)\n" + 
				"7 - realizar tranferência (de todos os tipos de conta)\n" + 
				"8 - Listar o nome dos clientes e o saldo\n\n" + 
				"9 - sair ";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

}
