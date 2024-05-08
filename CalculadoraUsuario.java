package estrutura_pos_condicionada;

import java.util.Scanner;

public class CalculadoraUsuario {

	public static void main(String[] args) {

		int v1 ;
		int i = 0, soma = 0;

		Scanner ler = new Scanner (System.in);

		while (i < 10) {
			i++;
			System.out.print("digite um numero a ser somado: ");
			v1 = ler.nextInt();
			soma += v1; 

		}
		System.out.println("Resultado: " + soma);
		ler.close();
	}

}