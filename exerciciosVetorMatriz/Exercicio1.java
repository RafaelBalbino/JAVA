package exerciciosVetorMatriz;

import java.util.Scanner;

/* 1 - Faça um programa que crie um vetor por leitura com 5 
 * valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente. */

public class Exercicio1 {

	public static void main(String[] args) {
		double vet[] = new double[5], maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int x = 0; x < 5; x++) {
			System.out.print("Digite uma pontuação: ");
			vet[x] = leia.nextDouble();
			
			if (vet[x] > maior) {
				maior = vet[x];
			}
		}
		System.out.println("A sua maior pontuação foi: " + maior);
	}

}
