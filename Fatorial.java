package ESTRUTURAREPETICAOt;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		int fatorial , v1 =1;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual o numero que deseja fazer fatorial");
		fatorial = ler.nextInt();
		
		for (int i = fatorial; i >=1 ; i--) {
			v1 *= i; 
			
		}
		System.out.println("O nímero fatorial é igual a " + v1);
		ler.close();

	}

}
