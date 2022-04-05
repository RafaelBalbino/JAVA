package exerciciosVetorMatriz;

import java.util.Random;

/* 2 - Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
 * Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
 * A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
 * contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior 
 * pontua��o. */

public class Exercicio2 {

	public static void main(String[] args) {
		
		int vet[] = new int[10], contMaior = 0, soma = 0, media; 
		
		Random r = new Random();
		
		System.out.println("Bora l� ent�o!");
		
		for (int x = 0; x < 10; x++) {
			vet[x] = r.nextInt(6) + 1;
			/* O '+1' � para ter certeza que o m�nimo rolado ser� 1, e
			 * n�o influenciado nos outros resultados. */
			System.out.print(vet[x] + "\t");
			
			soma += vet[x];
			if (vet[x] == 6) {
				contMaior++;
			}
		}
		media = soma / 10;
		System.out.println();
		System.out.println("A m�dia aritm�tica dos lan�amentos �: " + media);
		System.out.println("O maior n�mero apareceu " + contMaior + " vezes.");
	}
}
