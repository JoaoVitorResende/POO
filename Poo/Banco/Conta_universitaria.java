package Banco;

import javax.swing.JOptionPane;

public class Conta_universitaria extends Conta {

	@Override
	public void deposito(double vl) {
		if(vl<=3000) {
		if(getSaldo()<3000) {
			super.deposito(vl);
			JOptionPane.showMessageDialog(null,"ok");
		}else {
			JOptionPane.showMessageDialog(null,"saldo cheio ");
		}
	}else {
		JOptionPane.showMessageDialog(null,"valor muito alto ! ");
	}
	}
}
