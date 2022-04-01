package exercicios1a4;

import java.util.Scanner;

//   1 - Faça um programa que receba três inteiros e diga qual deles é o maior. 
public class Exercicio1 {

	public static void main(String[] args) {
		
			int n1, n2, n3;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o primeiro número: ");
			n1 = leia.nextInt();
			
			System.out.println("Digite o segundo número: ");
			n2 = leia.nextInt();
			
			System.out.println("Digite o terceiro número: ");
			n3 = leia.nextInt();
			
			if (n1 > n2 && n1 > n3) {
				System.out.println("O maior número é: " + n1);
			}
			else if (n2 > n1 && n2 > n3) {
				System.out.println("O maior número é: " + n2);
			}
			else {
				System.out.println("O maior número é: " + n3);
			}
			System.out.println("FIM DO PROGRAMA!");
	}

}
