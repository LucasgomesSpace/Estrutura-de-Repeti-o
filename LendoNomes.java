package estrutura_pos_condicionada;

import java.util.Scanner;

public class LendoNomes {

	public static void main(String[] args) {

		String nome ;
		int i = 0 ,x; 

		Scanner ler = new Scanner(System.in);
		System.out.print("Qual seu nome:");
		nome = ler.nextLine();
		System.out.println("Quantas vezes desja repetir ? ");
		x = ler.nextInt();

		while(i < x) { 
			i++;
			System.out.println("Seu nome é :" + nome );
		}
		ler.close();
	}


}
