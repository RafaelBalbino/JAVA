package repeticaoExercicios;

import java.util.Scanner;

/* 6 - Escrever um programa que receba v�rios n�meros inteiros 
 * no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 */
public class Exercicio6 {

	public static void main(String[] args) {
		
		int num, resto, soma = 0, cont = 0;
		double media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			resto = num % 3;
			
			if (resto == 0 && num != 0) {
				soma += num;
				cont++;
			}
			media = soma / cont;
		} while (num != 0);
		System.out.println("FIM DO PROGRAMA, TU DIGITOU '0'! Mas por fim...");
		System.out.println("A m�dia nos n�meros inseridos que s�o m�ltiplos de 3 �: "
		+ media);
	}
}

