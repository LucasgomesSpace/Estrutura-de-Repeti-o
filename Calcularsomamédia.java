package ESTRUTURAREPETICAOt;

import java.util.Scanner;

public class Calcularsomamédia {

	public static void main(String[] args) {
		
		double nums, resul; 
		double soma = 0;
		Scanner ler = new Scanner(System.in);
		
		for (double i = 0; i<=5; i++) {
			System.out.println("Qual numero deseja calcular");
			nums = ler.nextDouble();
			soma += nums ;
		}
		resul = soma/5 ; 
		System.out.println("A média é igaul a: " + resul);
		ler.close();
	}
}
