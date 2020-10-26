package Predio;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Apartamento>apartamentos = new ArrayList<Apartamento>();
		ArrayList<Despesa>despesas = new ArrayList<Despesa>();
		ArrayList<Condominio>condominios = new ArrayList<Condominio>();
		int op = 0;
		do {
			op = menu();
			if(op==1) {
				Apartamento a = new Apartamento();
				a.cadastro();
				apartamentos.add(a);
			}
			if(op==2) {
				Despesa d = new Despesa();
				d.cadastro();
				despesas.add(d);
			}
			if(op==3) {
				Apartamento a = Buscaapartamento(apartamentos);
				Despesa d = buscaDespesa(despesas);
				Condominio sp = new Saldo_Proprietario();
				sp.calcula(a, d);
				condominios.add(sp);
			}
			if(op==4) {
				Apartamento a = Buscaapartamento(apartamentos);
				Despesa d = buscaDespesa(despesas);
				Condominio sa = new Saldo_Apartamento();
				sa.calcula(a, d);
				condominios.add(sa);
			}
			if(op==5) {
				String r = "";
				for (Condominio c : condominios) {
					if (c instanceof Saldo_Proprietario) {
						r+=c;
					}
				}
				JOptionPane.showMessageDialog(null,r);
			}
			if(op==6) {
				String r = " ";
				for (Condominio c : condominios) {
					if(c instanceof Saldo_Apartamento) {
						r+=c;
					}
				}
				JOptionPane.showMessageDialog(null,r);
			}
		} while (op!=7);
	}

	private static Despesa buscaDespesa(ArrayList<Despesa> despesas) {
		String a = "Despesas  cadastrados\n";
		for (int i=0; i < despesas.size(); i++) {
			a += (i+1)+" "+despesas.get(i).getNome()+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(a));
		return despesas.get(op-1);
	}

	private static Apartamento Buscaapartamento(ArrayList<Apartamento> apartamentos) {
		String a = "Apartamentos  cadastrados\n";
		for (int i=0; i < apartamentos.size(); i++) {
			a += (i+1)+" "+apartamentos.get(i).getProprietario()+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(a));
		return apartamentos.get(op-1);
	}

	private static int menu() {
		String menu ="1 - cadastrar apartamentos\n"
				+ 	 "2 - cadastrar despesas\n"
				+ 	 "3 - cadastrar despesa proprietario\n"
				+ 	 "4 - cadastrar despesa apartamento\n"
				+ 	 "5 - listar despesa proprietario\n"
				+ 	 "6 - listar despesa apartamento\n\n"
				+ 	 "7 - sair ";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

}
