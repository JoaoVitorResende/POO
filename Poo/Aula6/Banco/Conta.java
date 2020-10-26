package Banco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta {
	private double deposito;
	private double saque;
	private Cliente usuario;
	private Agencia agencia ;
	private ArrayList<Cliente>clientes= new ArrayList<Cliente>();
	 public void cadastro (Cliente c , Agencia a) {
		 setUsuario(c);
		 setAgencia(a);
		 int op = Integer.parseInt(JOptionPane.showInputDialog("gostaria de fazer um deposito ? 1-sim , 2-não"));
		 if(op==1) {
			 this.depositar(c);
		 }
		 
	 }
	 @Override
	public String toString() {
		return "\n cliente "+getUsuario()+"\n Agencia "+getAgencia()+"\n seu saldo "+getDeposito();
	}
	public Cliente getUsuario() {
		return usuario;
	}
	public void setUsuario(Cliente c) {
		this.usuario = c;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia a) {
		this.agencia = a;
	}
	
	public void depositar(Cliente x) {//deposita
		setDeposito(Double.parseDouble(JOptionPane.showInputDialog("ponha o valor do deposito")));
	}
	
	
	public boolean sacar (Cliente z ) {//saca
		int qt = Integer.parseInt(JOptionPane.showInputDialog("ponha o valor que quer retirar "));
			if(qt>getDeposito()) {
				JOptionPane.showMessageDialog(null,"Não há saldo suficiente");
				return false ;
			}else {
				setDeposito(getDeposito()-qt);
				return true ;
			}
		}
	public double getDeposito() {
		return deposito;
	}
	public void setDeposito(double deposito) {
		if(deposito < 0) {
			setDeposito(Double.parseDouble(JOptionPane.showInputDialog("ponha o valor novamente")));
		}else {
			this.deposito = deposito;
		}
	}
	public double getSaque() {
		return saque;
	}
	public void setSaque(double saque) {
		this.saque = saque;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
}
