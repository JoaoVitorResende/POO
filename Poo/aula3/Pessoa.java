package aula3;

import javax.swing.JOptionPane;

public class Pessoa {
private String nome;
private int Idade;
private String sexo;
public static String humor;


public void cadastra() {
	setNome(JOptionPane.showInputDialog("ponha o nome"));
	setIdade(Integer.parseInt(JOptionPane.showInputDialog("ponha  a idade")));
	setSexo(JOptionPane.showInputDialog("ponha o sexo m ou f "));
	humor = JOptionPane.showInputDialog("ponha o seu humor");
}
public String mostrarDados() {
	return getNome()+" - "+getSexo()+" - "+getIdade()+" - "+humor;
}

public String getNome() {
	if(getSexo().equalsIgnoreCase("f")) 
		return "sra "+nome;
	else
		return "sr"+nome;

}
public void setNome(String nome) {
	if(!nome.equals("")) {
		this.nome = nome;
	}else {
		setNome(JOptionPane.showInputDialog("não pode ser vazio ponha novamente"));
	}
}
public int getIdade() {
	return Idade;
}
public void setIdade(int Idade) {
	if(Idade >=18 && Idade<=99) 
		this.Idade = Idade;
	else 
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("PONHA A IDADE NOVAMENTE")));
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("f")){
		this.sexo = sexo;
	}else {
		JOptionPane.showInputDialog("sexo invalido ponha outro");
	}
}

	


}
