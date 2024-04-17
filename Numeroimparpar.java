package ESTRUTURAREPETICAOt;

import java.util.Scanner;

public class Numeroimparpar {

	public static void main(String[] args) {

		int numero; 
		Scanner ler = new Scanner (System.in);
		System.out.println("Quantos numeros deseja verificar");
		numero = ler.nextInt();
		ler.close();

		for ( int i = 0 ; i<= numero; i++) {

			if ( i  % 2 == 0) {
				System.out.println(i + " é par");
			}
			else {
				System.out.println( i + " é impar");

			}
		}

	}

}
