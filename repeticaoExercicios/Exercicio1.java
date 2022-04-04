package repeticaoExercicios;

// 1-	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
public class Exercicio1 {

	public static void main(String[] args) {
		int num = 1000, resto;
		
		for (num = 1000; num < 2000; num++) {
			resto = num % 11;
			
			if (resto == 5) {
				System.out.print(num + " ");
			}
		}

	}

}
