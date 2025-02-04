package exerciciosCondicionais;

import java.util.Scanner;

/* 4-	Fa�a um programa em que permita a entrada de um n�mero 
   qualquer e exiba se este n�mero � par ou �mpar. 
   Se for par exiba tamb�m a raiz quadrada do mesmo; se for 
   �mpar exiba o n�mero elevado ao quadrado. */

public class Exercicio4 {

	public static void main(String[] args) {
		
			int num, resto;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o n�mero: ");
			num = leia.nextInt();
			
			resto = num % 2;
					
			if (resto == 0) {
				System.out.println("O n�mero " + num + " � par" + 
			    " e sua raiz quadrada � " +  Math.sqrt(num));
				// 'Math.sqrt(x)' � para calcular a raiz quadrada de um n�emro(x)
			}
			else {
				System.out.println("O n�mero " + num + " � impar" +
				" e ao elev�-lo ao quadrado, o resultado � " + Math.pow(num, 2));
				/* 'Math.pow(x, y)' � para elevar um n�mero(x) a uma pot�ncia(y).
				   Neste caso, ao quadrado. */
			}
			System.out.println("FIM DO PROGRAMA!");
	}

}
