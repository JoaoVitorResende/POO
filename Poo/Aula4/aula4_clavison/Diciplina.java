package aula4_clavison;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Diciplina {
	private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	private String nomediciplina;
	Professor prof= new Professor();
	private int reprova��o =0;
	public int getReprova��o() {
		return reprova��o;
	}

	public void setReprova��o(int reprova��o) {
		this.reprova��o = reprova��o;
	}

	public void cadastro() {
		int reprovado=0;
		setNomediciplina(JOptionPane.showInputDialog("nome da diciplina "));
		int op��o = 0;
		prof.cadastro();
		String menu = "1 - cadastrar professor e alunos \n  " + "2 - Sair ";
		do {
			Aluno cadastrar = new Aluno();
			cadastrar.cadastro();
			alunos.add(cadastrar);
			op��o = Integer.parseInt(JOptionPane.showInputDialog(menu));
		} while (op��o != 2);
		for (Aluno a : alunos) {
			if(a.getResultado().equalsIgnoreCase("reprovado")){
				reprovado++;
			}
		}
		setReprova��o(reprovado);
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public String getNomediciplina() {
		return nomediciplina;
	}

	public void setNomediciplina(String nomediciplina) {
		this.nomediciplina = nomediciplina;
	}
public String toString() {
	String r = prof.toString();
	//////
	String re="";
	for (Aluno dado : alunos) {
		
		re+=dado.mostradados();
		
	}
	
	String res = getNomediciplina()+r+re;
	return res;
}
}
