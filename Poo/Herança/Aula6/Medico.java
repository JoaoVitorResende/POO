package Aula6;

import javax.swing.JOptionPane;

public class Medico extends Pessoa{
	protected String cmr ;
	@Override
	public void cadastro() {
		super.cadastro();
		setCmr(JOptionPane.showInputDialog("ponha o cmr"));
	}
	@Override
	public String toString() {
		return super.toString()+"\n"+getCmr();
	}
	public String getCmr() {
		return cmr;
	}

	public void setCmr(String cmr) {
		this.cmr = cmr;
	}
}
