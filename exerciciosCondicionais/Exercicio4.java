package exerciciosCondicionais;

import java.util.Scanner;

/* 4-	Faça um programa em que permita a entrada de um número 
   qualquer e exiba se este número é par ou ímpar. 
   Se for par exiba também a raiz quadrada do mesmo; se for 
   ímpar exiba o número elevado ao quadrado. */

public class Exercicio4 {

	public static void main(String[] args) {
		
			int num, resto;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o número: ");
			num = leia.nextInt();
			
			resto = num % 2;
					
			if (resto == 0) {
				System.out.println("O número " + num + " é par" + 
			    " e sua raiz quadrada é " +  Math.sqrt(num));
				// 'Math.sqrt(x)' é para calcular a raiz quadrada de um núemro(x)
			}
			else {
				System.out.println("O número " + num + " é impar" +
				" e ao elevá-lo ao quadrado, o resultado é " + Math.pow(num, 2));
				/* 'Math.pow(x, y)' é para elevar um número(x) a uma potência(y).
				   Neste caso, ao quadrado. */
			}
			System.out.println("FIM DO PROGRAMA!");
	}

}
