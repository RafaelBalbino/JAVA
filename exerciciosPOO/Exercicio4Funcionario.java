package exerciciosPOOeSobrecarga;

/* 4) Crie uma classe funcionário e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto funcionário, defina 
 * as instancias deste objeto e apresente as informações deste objeto 
 * no console. */

public class Exercicio4Funcionario {
	// O que tem um funcionário?
	
	String nome, ocupacao;
	boolean autorizacao;
	int diasFaltas;
	
	public void informacoesFunc() {
		System.out.print("Nome do funcionário: " + this.nome);
		
		if (nome == "Hokage") {
			System.out.println(" - Nome legal o seu, hein? Vou chamar meu filho assim.");
		}
		
		System.out.println("Ocupação do funcionário: " + this.ocupacao);
		System.out.print("Tem autorização para estar nessa sala? " + this.autorizacao);
		
		if (autorizacao == false) {
			System.out.println(" - Já tá errado que não era pra você tá aqui, mas beleza.");
		}
		
		System.out.print("Qtd de dias que não compareceu em serviço: " + this.diasFaltas);
		
		if (diasFaltas >= 4) {
			System.out.println(" - Infelizmente ela vai te demitir daqui a pouquinho...");
		}
		else if (diasFaltas > 0 && diasFaltas < 4) {
			System.out.println(" - Número aceitável mas tente comparecer mais, fiquei sabendo que essa " +
							   "nova supervisora é muito estrita.");
		}
		else {
			System.out.println(" - Muito bem, sem nenhuma falta!");
		}
	}
}
