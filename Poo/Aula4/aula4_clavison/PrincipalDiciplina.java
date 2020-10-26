package aula4_clavison;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalDiciplina {

	public static void main(String[] args) {
//		Uma disciplina possui um nome, um professor e uma lista de alunos.
//		Cada aluno possui nome e as notas de tres avalia��es.
//		O professor tem nome, idade e sexo.
//		Fa�a um programa que defina as classes Disciplina, Professor e Aluno e possibilite:
//		1 - Cadastrar disciplinas
//		2 - Mostrar os alunos de uma disciplina com a informa��o se est� aprovado, reprovado ou em recupera��o (m�dia 7 para aprova��o e m�dia 2 para reprova��o).
//		3 - Verificar qual disciplina obteve o maior n�mero de aprova��es
//		4 - verificar o nome do professor que teve mais reprova��es em sua disciplina
//		5 - Verificar o professor mais velho que leciona
//		6 - Calcular o percentual de cada sexo dos professores
		ArrayList<Diciplina>diciplinas= new ArrayList<Diciplina>();
		String menu ="1 - cadastrar \n"
				+	 "2 - listar com verifica��o de aprova��o \n"
				+ 	 "3 - verificar qual diciplina teve maior numero de reprova��o \n"
				+ 	 "4 - verificar o nome do professor que teve mais reprova��es em sua disciplina \n"
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
					if(d.getReprova��o()>maisreprovado){
						maisreprovado= d.getReprova��o();
						materia= d.getNomediciplina();
					}
				}
				JOptionPane.showMessageDialog(null,"materia mais reprovada �  "+materia+" com reprova��o de "+maisreprovado);
			}
			if(op==4){
				String professor="";
				int maisreprovado=0;
				for (Diciplina d : diciplinas) {
					if(d.getReprova��o()>maisreprovado){
						professor=d.prof.getNome();
					}
				}
				JOptionPane.showMessageDialog(null," o nome do professor com mais reprova��es � o : "+professor);
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
				JOptionPane.showMessageDialog(null,"Professor mais velho � o : "+professor+" com idade de "+velho);
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
				JOptionPane.showMessageDialog(null,"Porcentagem Masculina � de : "+pormas);
				JOptionPane.showMessageDialog(null,"Porcentagem Feminina � de : "+pormas);
			}
		} while( op!=7);
	}

}
