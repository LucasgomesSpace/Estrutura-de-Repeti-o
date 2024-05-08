package estrutura_pos_condicionada;

public class CalculeAlgoritimos {

	public static void main(String[] args) {
		int v1 ;
		int i = 0, soma = 0;

		while (i<= 15) {

			System.out.println(i);
			v1 = i++ ;
			soma += v1; 

		}
		System.out.println("Resultado: " + soma);

	}

}

// Ou você pode usar uma variação mais curta: 
//
//			int i = 0, soma = 0;
//
//			while (i<= 15) {
//
//		System.out.println(i);
//			soma += i++;			