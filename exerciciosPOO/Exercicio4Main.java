package exerciciosPOOeSobrecarga;

import java.util.Scanner;

/* 4) Crie uma classe funcion�rio e apresente os atributos e m�todos 
 * referentes esta classe, em seguida crie um objeto funcion�rio, defina 
 * as instancias deste objeto e apresente as informa��es deste objeto 
 * no console. */

public class Exercicio4Main {

	public static void main(String[] args) {
		Exercicio4Funcionario func = new Exercicio4Funcionario();
		
		Scanner leia = new Scanner(System.in);
		
		func.nome = "Hokage";
		func.ocupacao = "Liderar a vila";
		func.autorizacao = false;
		
		System.out.print("Nos diga quantos dias voc� j� faltou esse m�s primeiro: ");
		func.diasFaltas = leia.nextInt();
		
		func.informacoesFunc();
	}

}
