package Predio;

public class Saldo_Apartamento extends Condominio {
	private int numero;
	private String ano;
	private String mes;
	Apartamento a = new Apartamento();
	@Override
	public void calcula(Apartamento a, Despesa d) {
		setSaldo(d.getValor()+getSaldo());
		setMes(d.getMes());
		setAno(d.getAno());
		setNumero(a.getNumero());
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
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
	@Override
	public String toString() {
		return "\n apartamento "+getNumero()+"\n saldo total de "+getSaldo()+"\n ano "+getMes()+"\n mes "+getMes();
	}
}
