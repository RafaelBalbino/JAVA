package repeticaoExercicios;

import java.util.Scanner;

/* 6 - Escrever um programa que receba v�rios n�meros inteiros 
 * no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE) */

public class BoraLaGente {

	public static void main(String[] args) {
		int num, resto, soma = 0, cont = 0, media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			resto = num % 3;
			// % divide pelo n�mero desejado e pega o resto.
			
			if (resto == 0 && num > 0) {
				soma += num;
				cont++;
			}
		} while (num != 0);
		
		media = soma / cont;
		System.out.println("A m�dia dos n�meros digitados �: " + media);
	}

}
