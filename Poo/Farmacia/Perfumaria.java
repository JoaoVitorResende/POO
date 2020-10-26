package Farmacia;

import javax.swing.JOptionPane;

public class Perfumaria extends Produtos {

	@Override
	public void cadastro() {
		setNome(JOptionPane.showInputDialog("ponha o nome da perfumaria"));
		setEstoque(Integer.parseInt(JOptionPane.showInputDialog("ponha a quantidade de estoque")));
		setValor(Double.parseDouble(JOptionPane.showInputDialog("ponha o valor do produto")));
	}

	@Override
	public void vender(Cliente c) {
		int qt = Integer.parseInt(JOptionPane.showInputDialog("ponha a quantidade desjada"));
		if(c.getSaldo()<100) {
			if(getEstoque()<=qt) {
				c.setSaldo(getValor()*qt);
			}else {
				JOptionPane.showMessageDialog(null,"quantidade insuficiente");
			}
		}else {
			JOptionPane.showMessageDialog(null,"seu saldo está muito alto");
		}
	}
	@Override
	public String toString() {
		return "\n nome "+getNome()+"\n estoque "+getEstoque()+"\n valor "+getValor();
	}
}
