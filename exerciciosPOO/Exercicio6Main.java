package exerciciosPOOeSobrecarga;

import java.util.Scanner;

/* 6) Crie uma classe conta bancaria e apresente os atributos e 
 * métodos referentes esta classe, em seguida crie um objeto conta 
 * bancaria, defina as instancias deste objeto e apresente as 
 * informações deste objeto no console. */

public class Exercicio6Main {

	public static void main(String[] args) {
		Exercicio6ContBanc cont = new Exercicio6ContBanc();
		
		Scanner leia = new Scanner(System.in);
		
		cont.agencia = "Bradesco";
		cont.dono = "Gabriel";
		cont.tipoConta = true;
		
		System.out.print("Primeiramente, informe-nos seu saldo atual: ");
		cont.saldo = leia.nextDouble();
		
		cont.depositar();
		
		cont.sacar();
		
		cont.limite = cont.saldo * 0.20;
		
		cont.checagemDeConta();
	}

}
