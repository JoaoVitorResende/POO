package Farmacia;

import javax.swing.JOptionPane;

public class Medicamento extends Produtos {
		private String receita;
			public void cadastro() {
			setNome(JOptionPane.showInputDialog("ponha o nome do medicamento"));
			setEstoque(Integer.parseInt(JOptionPane.showInputDialog("ponha a quantidade de medicamento")));
			setValor(Double.parseDouble(JOptionPane.showInputDialog("ponha o valor do produto")));
		}
		public String getReceita() {
			return receita;
		}
		public void setReceita(String receita) {
			this.receita = receita;
		}
		@Override
		public String toString() {
			return "\n nome "+getNome()+"\n estoque "+getEstoque()+"\n valor "+getValor();
		}
		@Override
		public void vender(Cliente c) {
			int qt = Integer.parseInt(JOptionPane.showInputDialog("ponha a quantidade que queira"));
			setReceita(JOptionPane.showInputDialog("tem receita"));
			if(qt<=getEstoque()) {
				setEstoque(getEstoque()-qt);
				c.setSaldo(getValor()*qt);
				JOptionPane.showMessageDialog(null,"ok");
			}else {
				System.out.println(qt);
				System.out.println(getEstoque());
				JOptionPane.showMessageDialog(null,"venda nao efetuada");
			}
		}
	}
