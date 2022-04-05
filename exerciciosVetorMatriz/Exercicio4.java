package exerciciosVetorMatriz;

import java.util.Scanner;

/* 4 - Crie um programa que receba valores do usuário para 
 * preencher uma matriz 3X3, e em seguida, exiba a soma dos 
 * valores dela e a soma dos valores da primeira diagonal, 
 * ou seja, diagonal principal. */

public class Exercicio4 {

	public static void main(String[] args) {
		int mat[] [] = new int[3] [3];
		int somaMat = 0, somaDiagonal = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.print("Digite um núemro: ");
				mat[linha][coluna] = leia.nextInt();
				
				somaMat += mat[linha][coluna];
				somaDiagonal = mat[0][0] + mat[1][1] + mat[2][2];
			}
		}
		System.out.println("A soma de todos os valores é: " + somaMat);
		System.out.println("A soma de todos os valores em diagonal é: " + somaDiagonal);
	}

}
