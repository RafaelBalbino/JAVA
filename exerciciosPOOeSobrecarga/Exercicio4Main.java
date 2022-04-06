package exerciciosPOOeSobrecarga;

import java.util.Scanner;

/* 4) Crie uma classe funcionário e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto funcionário, defina 
 * as instancias deste objeto e apresente as informações deste objeto 
 * no console. */

public class Exercicio4Main {

	public static void main(String[] args) {
		Exercicio4Funcionario func = new Exercicio4Funcionario();
		
		Scanner leia = new Scanner(System.in);
		
		func.nome = "Hokage";
		func.ocupacao = "Liderar a vila";
		func.autorizacao = false;
		
		System.out.print("Nos diga quantos dias você já faltou esse mês primeiro: ");
		func.diasFaltas = leia.nextInt();
		
		func.informacoesFunc();
	}

}
