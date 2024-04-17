package ESTRUTURAREPETICAOt;

import java.util.Scanner;

public class mediasalarial {

	public static void main(String[] args) {
		int salario=0, soma = 0, funs, media;

		Scanner ler = new Scanner(System.in);
		System.out.println("Qual a quantidade de funcionários?");
		funs = ler.nextInt();

		for(int i=1; i <= funs; i++) {
			System.out.println("Informe o salário dos funcionários: ");
			salario = ler.nextInt();
		     soma += salario;
		}
		media = soma/funs;
		System.out.println("A média salarial da empresa é de " + media);
		ler.close();	
	}

}
