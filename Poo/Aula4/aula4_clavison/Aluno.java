package aula4_clavison;

import javax.swing.JOptionPane;

public class Aluno {

	private String nome;
	private int av1 = 0;
	private int av2 = 0;
	private int av3 = 0;
	private String resultado;

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public void cadastro() {
		int media = 0 ;
		String aprova��o =  "";
		setNome(JOptionPane.showInputDialog("nome do aluno"));
		setAv1(Integer.parseInt(JOptionPane.showInputDialog("nota da avalia��o 1")));
		setAv2(Integer.parseInt(JOptionPane.showInputDialog("nota da avalia��o 2")));
		setAv3(Integer.parseInt(JOptionPane.showInputDialog("nota da avalia��o 3")));
		media+=getAv1()+getAv2()+getAv3();
		media=media/3;
		if(media>=7){
			aprova��o="aprovado";
			setResultado(aprova��o);
		}else{
			aprova��o="reprovado";
			setResultado(aprova��o);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAv1() {
		return av1;
	}

	public void setAv1(int av1) {
		this.av1 = av1;
	}

	public int getAv2() {
		return av2;
	}

	public void setAv2(int av2) {
		this.av2 = av2;
	}

	public int getAv3() {
		return av3;
	}

	public void setAv3(int av3) {
		this.av3 = av3;
	}

	public String mostradados() {
		return "\n nome " + getNome() + "\n avalia��o 1 : " + getAv1() + "\n  avalia��o 2 : " + getAv2() + "\n avalia��o 3 : "
				+ getAv3()+"\n"+getResultado();
	}

}
