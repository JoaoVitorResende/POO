package aula5_clavison;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Venda {
	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	public boolean vender(Cliente nome , Produto produto) {
		int qt = Integer.parseInt(JOptionPane.showInputDialog("quantidade de produto "+ produto.getNome()));
			if(qt <= produto.getEstoque()) {
				produto.setEstoque(produto.getEstoque()-qt);
				nome.setDevendo(produto.getValor());
				return true;
			}else {
				return false;
			}
		
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
}
