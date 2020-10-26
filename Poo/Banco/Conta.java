package Banco;

import javax.swing.JOptionPane;

public class Conta {
	protected double saldo;
	protected double transferencia;
	protected String dono;
	protected int Agencia;
	
	public void cadastro(Cliente c , Agencia a) {
		setDono(c.getNome());
		setAgencia(a.getNumero());
	}
	public void deposito(double vl) {
		setSaldo(vl+getSaldo());
	}
	public void saque(double vl) {
		if(vl<getSaldo()) {
			setSaldo(getSaldo()-vl);
		}else {
			JOptionPane.showMessageDialog(null,"Saldo insuficiente");
		}
	}
	public void transferencia(Cliente c) {
		
	}
	public int getAgencia() {
		return Agencia;
	}

	public void setAgencia(int agencia) {
		Agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTransferencia() {
		return transferencia;
	}
	public void setTransferencia(double transferencia) {
		this.transferencia = transferencia;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	
	@Override
	public String toString() {
		return "\n Conta "+getDono()+"\n saldo "+getSaldo();
	}
}
