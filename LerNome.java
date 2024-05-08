package estrutura_pos_condicionada;

import java.util.Scanner;

public class LerNome {

	public static void main(String[] args) {

		int i = 0; 
		String nome;
		Scanner	ler = new Scanner(System.in);
		System.out.print("Qual o seu nome: ");
		nome = ler.nextLine();

		while (i <= 10) { 
			i++; 
			System.out.println(nome);
		}
		ler.close();
	}

}