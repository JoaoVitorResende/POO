package Aula6;

import javax.swing.JOptionPane;

public class Pediatra extends Medico {
	private int idadeM;
	@Override
	public void cadastro() {
		super.cadastro();
		setIdadeM(Integer.parseInt(JOptionPane.showInputDialog("ponha a idade maxima de atendimento a criança")));
	}
	@Override
	public String toString() {
		return super.toString()+"\n a idade maxima que atende é de "+getIdadeM();
	}
	public int getIdadeM() {
		return idadeM;
	}

	public void setIdadeM(int idadeM) {
		this.idadeM = idadeM;
	}
	
	
}
