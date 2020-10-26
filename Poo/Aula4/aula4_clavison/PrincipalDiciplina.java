package aula4_clavison;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalDiciplina {

	public static void main(String[] args) {
//		Uma disciplina possui um nome, um professor e uma lista de alunos.
//		Cada aluno possui nome e as notas de tres avaliações.
//		O professor tem nome, idade e sexo.
//		Faça um programa que defina as classes Disciplina, Professor e Aluno e possibilite:
//		1 - Cadastrar disciplinas
//		2 - Mostrar os alunos de uma disciplina com a informação se está aprovado, reprovado ou em recuperação (média 7 para aprovação e média 2 para reprovação).
//		3 - Verificar qual disciplina obteve o maior número de aprovações
//		4 - verificar o nome do professor que teve mais reprovações em sua disciplina
//		5 - Verificar o professor mais velho que leciona
//		6 - Calcular o percentual de cada sexo dos professores
		ArrayList<Diciplina>diciplinas= new ArrayList<Diciplina>();
		String menu ="1 - cadastrar \n"
				+	 "2 - listar com verificação de aprovação \n"
				+ 	 "3 - verificar qual diciplina teve maior numero de reprovação \n"
				+ 	 "4 - verificar o nome do professor que teve mais reprovações em sua disciplina \n"
				+ 	 "5 - Verificar o professor mais velho que leciona \n"
				+ 	 "6 - Calcular o percentual de cada sexo dos professores \n\n"
				+    "7 - sair ";
		int op=0;
		do {
			op=Integer.parseInt(JOptionPane.showInputDialog(menu));
			if(op == 1){
				Diciplina d = new Diciplina();
				d.cadastro();
				diciplinas.add(d);
			}
			if(op==2){
				for (Diciplina d : diciplinas) {
					JOptionPane.showMessageDialog(null,d.toString());
				}
			}
			if(op==3){
				int maisreprovado=0;
				String materia="";
				for (Diciplina d : diciplinas) {
					if(d.getReprovação()>maisreprovado){
						maisreprovado= d.getReprovação();
						materia= d.getNomediciplina();
					}
				}
				JOptionPane.showMessageDialog(null,"materia mais reprovada é  "+materia+" com reprovação de "+maisreprovado);
			}
			if(op==4){
				String professor="";
				int maisreprovado=0;
				for (Diciplina d : diciplinas) {
					if(d.getReprovação()>maisreprovado){
						professor=d.prof.getNome();
					}
				}
				JOptionPane.showMessageDialog(null," o nome do professor com mais reprovações é o : "+professor);
			}
			if(op==5){
				String professor="";
				int velho =0;
				for (Diciplina d : diciplinas) {
					if(d.prof.getIdade()>velho){
						professor=d.prof.getNome();
						velho=d.prof.getIdade();
					}
				}
				JOptionPane.showMessageDialog(null,"Professor mais velho é o : "+professor+" com idade de "+velho);
			}
			if(op==6){
				int mas=0;
				int pormas=0;
				int porfem=0;
				int fem=0;
				int x=0;
				for (Diciplina d : diciplinas) {
					x++;
					if(d.prof.getSexo().equalsIgnoreCase("m")){
						mas++;
					}else{
						fem++;
					}
				}
				pormas=mas*100/x;
				porfem=fem*100/x;
				JOptionPane.showMessageDialog(null,"Porcentagem Masculina é de : "+pormas);
				JOptionPane.showMessageDialog(null,"Porcentagem Feminina é de : "+pormas);
			}
		} while( op!=7);
	}

}
