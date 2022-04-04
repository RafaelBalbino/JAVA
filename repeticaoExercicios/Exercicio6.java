package repeticaoExercicios;

import java.util.Scanner;

/* 6 - Escrever um programa que receba vários números inteiros 
 * no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. 
 * Para sair digitar 0(zero).(DO...WHILE)
 */
public class Exercicio6 {

	public static void main(String[] args) {
		
		int num, resto, soma = 0, cont = 0;
		double media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			resto = num % 3;
			
			if (resto == 0 && num != 0) {
				soma += num;
				cont++;
			}
			media = soma / cont;
		} while (num != 0);
		System.out.println("FIM DO PROGRAMA, TU DIGITOU '0'! Mas por fim...");
		System.out.println("A média nos números inseridos que são múltiplos de 3 é: "
		+ media);
	}
}

