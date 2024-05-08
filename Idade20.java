package estrutura_pos_condicionada;

import java.util.Scanner;

public class Idade20 {

	public static void main(String[] args) {
		int i = 0, maior = 0, menor = 0, v = 1 ;
		int  id; 
		Scanner ler = new Scanner (System.in);

		while ( i< 20) { 
			i++;
			System.out.print("Qual a sua idade : ");
			id = ler.nextInt();

			if (id >=18) {
				maior += v;

			}else { menor += v; 
			} 	

		}

		System.out.println("De 20 pessoas "+ maior + " são maiores de idade"+ " e " + menor + " são menores de idade " );
		ler.close();		

	}
}