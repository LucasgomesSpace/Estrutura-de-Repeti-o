package estrutura_pos_condicionada;

import java.util.Scanner;

public class Desafio {

	private static final Object A = null;

	public static void main(String[] args) {

		//-----GABARITO:---------//
		// 1 A
		// 2 B
		// 3 C
		// 4 D
		// 5 E
		// 6 E
		// 7 A
		// 8 B
		// 9 C
		//10 D
		//----------------------//

		String nome;
		int Qalunos,nota = 0, y = 0;
	     String A = a , B = b , C = c , D = d , E = e;    
		String a, b ,c, d, e, f, g, h, i, j ;
		Scanner ler = new Scanner(System.in);
		System.out.print("Quantos alunos vão ser avaliados.");
		Qalunos = ler.nextInt();

		while (y <=Qalunos) {
			System.out.print("Qual o seu nome: ");
			nome = ler.nextLine();

			for (int r = 0; r<=10;r++) {
				System.out.println("inforeme seu gabrito de acordo com os numeros das questões!!!");
				System.out.println(r+"° questão:");

				if (r == 1) {
					a = ler.nextLine();
				}else if (a.equals(A)) {
					nota += 1;
				}
				if (r == 2) {
					b = ler.nextLine();
				}else if (b.equals(B)) {
					nota += 1;
				}
				if (r == 3) {
					c = ler.nextLine();
					}else if (c.equals(C)) {
						nota += 1;
					}
			}


		}
		ler.close();
	  }
	}