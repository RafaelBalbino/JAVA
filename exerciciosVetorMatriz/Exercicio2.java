package exerciciosVetorMatriz;

import java.util.Random;

/* 2 - Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 * Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
 * A seguir determine e imprima a média aritmética dos lançamentos, 
 * contabilize e apresente também quantas foram as ocorrências da maior 
 * pontuação. */

public class Exercicio2 {

	public static void main(String[] args) {
		
		int vet[] = new int[10], contMaior = 0, soma = 0, media; 
		
		Random r = new Random();
		
		System.out.println("Bora lá então!");
		
		for (int x = 0; x < 10; x++) {
			vet[x] = r.nextInt(6) + 1;
			/* O '+1' é para ter certeza que o mínimo rolado será 1, e
			 * não influenciado nos outros resultados. */
			System.out.print(vet[x] + "\t");
			
			soma += vet[x];
			if (vet[x] == 6) {
				contMaior++;
			}
		}
		media = soma / 10;
		System.out.println();
		System.out.println("A média aritmética dos lançamentos é: " + media);
		System.out.println("O maior número apareceu " + contMaior + " vezes.");
	}
}
