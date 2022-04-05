package exerciciosVetorMatriz;

import java.util.Random;

/* 3.	Escreve um programa que lê duas matrizes N1 (4,6) 
 * e N2(4,6) e cria:
 * A) Uma matriz M1 cujos elementos serão as somas dos 
 * elementos de mesma posição das matrizes N1 e N2;
 * B) Uma matriz M2 cujos elementos serão as diferenças 
 * dos elementos de mesma posição das matrizes N1 e N2; */

public class Exercicio3AeB {

	public static void main(String[] args) {
		int N1[] [] = new int[4] [6];
		int N2[] [] = new int[4] [6];
		int M1[] [] = new int[4] [6];
		int M2[] [] = new int[4] [6];
		
		Random r = new Random();
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				N1[linha][coluna] = r.nextInt(100) + 1;
				System.out.print(N1[linha][coluna] + "\t");
			}
		}
		System.out.println();
		/////////////////N1 ACIMA//////////////////////////
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				N2[linha][coluna] = r.nextInt(20) + 1;
				System.out.print(N2[linha][coluna] + "\t");
			}
		}
		System.out.println();
		/////////////////N2 ACIMA//////////////////////////
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				System.out.print(M1[linha][coluna] + "\t");
			}
		}
		System.out.println();
		/////////////////M1 ACIMA//////////////////////////
		
		for (int linha = 0; linha < 4; linha++) {
			for (int coluna = 0; coluna < 6; coluna++) {
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
				System.out.print(M2[linha][coluna] + "\t");
			}
		}
		System.out.println();
	}
}
