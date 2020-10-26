package Farmacia;

import javax.swing.JOptionPane;

public class Equipamento extends Produtos {

	@Override
	public void cadastro() {
		setNome(JOptionPane.showInputDialog("ponha o nome do equipamento"));
		setEstoque(Integer.parseInt(JOptionPane.showInputDialog("ponha a quantidade de estoque")));
		setValor(Double.parseDouble(JOptionPane.showInputDialog("ponha o valor")));
	}

	@Override
	public void vender(Cliente c) {
		int qt = Integer.parseInt(JOptionPane.showInputDialog("ponha a quantidade desejada"));
		setEstoque(getEstoque()-qt);
		c.setSaldo(getValor()*qt);
	}
	@Override
	public String toString() {
		return "\n nome "+getNome()+"\n estoque "+getEstoque()+"\n valor "+getValor();
	}
}
