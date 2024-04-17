package ESTRUTURAREPETICAOt;

import java.util.Scanner;

public class Apresentaçãodeinteiros {

	public static void main(String[] args) {
		int num, somapar =0, somaimpar =0; 
		Scanner ler = new Scanner(System.in);

		for (int i=0 ;i <= 9; i++) {
			
			System.out.println("Qual numero deseja somar?");
			num = ler.nextInt();
		
			if (num % 2 == 0) {
		
				somapar++;
			}else { 
				
				somaimpar++;
			}
		}
		System.out.println("Dos numeros digitados " + somapar + " são pares" + "\n" + "Dos numeros digitados "+ somaimpar + " são imapres");
		ler.close();
	}

}