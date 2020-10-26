package Farmacia;

public abstract class Produtos {
	
	protected String nome;
	protected int estoque;
	protected double valor;
	
	public abstract void cadastro() ;
	
	public abstract void vender(Cliente c) ;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String toString() {
		return  "\n Produto "+getNome()+"\n Estoque"+getEstoque()+"\n Valor"+getValor();
	}
}
