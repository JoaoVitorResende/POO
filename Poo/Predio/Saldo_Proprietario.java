package Predio;

public class Saldo_Proprietario extends Condominio {
	private String nome;
	private String ano;
	private String mes;
	private int metro;
	private int divisao;
	@Override
	public void calcula(Apartamento a, Despesa d) {
		setNome(a.getProprietario());
		setMes(d.getMes());
		setAno(d.getAno());
		setSaldo(d.getValor()+getSaldo());
		setMetro(a.getMetros());
		setDivisao(a.getApartamentos());
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public int getMetro() {
		return metro;
	}
	public void setMetro(int metro) {
		this.metro = metro;
	}
	
	public int getDivisao() {
		return divisao;
	}
	public void setDivisao(int divisao) {
		this.divisao = divisao;
	}
	@Override
	public String toString() {
		return "\n Proprietario "+getNome()+"\n mes "+getMes()+"\n ano "+getAno()+"\n valor total "+(getSaldo()+getMetro()*getValor())/getDivisao();
	}
}
