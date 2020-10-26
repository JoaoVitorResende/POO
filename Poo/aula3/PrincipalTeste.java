package aula3;

import java.util.ArrayList;

public class PrincipalTeste {

	public static void main(String[] args) {
		ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
		for (int i = 0; i <3; i++) {
			Pessoa p = new Pessoa();
			p.cadastra();
			lista.add(p);
		}
		
		for (Pessoa p : lista) {
			System.out.println(p.mostrarDados());
		}
	}

}
