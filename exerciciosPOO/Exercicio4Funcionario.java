package exerciciosPOOeSobrecarga;

/* 4) Crie uma classe funcion�rio e apresente os atributos e m�todos 
 * referentes esta classe, em seguida crie um objeto funcion�rio, defina 
 * as instancias deste objeto e apresente as informa��es deste objeto 
 * no console. */

public class Exercicio4Funcionario {
	// O que tem um funcion�rio?
	
	String nome, ocupacao;
	boolean autorizacao;
	int diasFaltas;
	
	public void informacoesFunc() {
		System.out.print("Nome do funcion�rio: " + this.nome);
		
		if (nome == "Hokage") {
			System.out.println(" - Nome legal o seu, hein? Vou chamar meu filho assim.");
		}
		
		System.out.println("Ocupa��o do funcion�rio: " + this.ocupacao);
		System.out.print("Tem autoriza��o para estar nessa sala? " + this.autorizacao);
		
		if (autorizacao == false) {
			System.out.println(" - J� t� errado que n�o era pra voc� t� aqui, mas beleza.");
		}
		
		System.out.print("Qtd de dias que n�o compareceu em servi�o: " + this.diasFaltas);
		
		if (diasFaltas >= 4) {
			System.out.println(" - Infelizmente ela vai te demitir daqui a pouquinho...");
		}
		else if (diasFaltas > 0 && diasFaltas < 4) {
			System.out.println(" - N�mero aceit�vel mas tente comparecer mais, fiquei sabendo que essa " +
							   "nova supervisora � muito estrita.");
		}
		else {
			System.out.println(" - Muito bem, sem nenhuma falta!");
		}
	}
}
