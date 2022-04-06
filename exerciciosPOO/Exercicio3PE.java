package exerciciosPOOeSobrecarga;

/* 3) Crie uma classe produto eletrônico e apresente os atributos 
 * e métodos referentes esta classe, em seguida crie um objeto 
 * produto eletrônico, defina as instancias deste objeto e apresente 
 * as informações deste objeto no console. */

public class Exercicio3PE {
	// O que tem um produto eletrônico?
	
	String nome;
	int anoFab;
	boolean porte, funcTom;
	double avaliacao;
	
	public void porteGrande() {
		boolean porte = true;
	}
	
	public void portePequeno() {
		boolean porte = false;
	}
	
	public void checarPorte() {
		if (porte = true) {
			System.out.println("Este produto é de grande porte.");
		}
		else {
			System.out.println("Este produto é de pequeno porte.");
		}
	}
	
	public void naoFunciona() {
		boolean funcTom = false;
	}
	
	public void funciona() {
		boolean funcTom = true;
	}
	
	public void checarFuncionamento() {
		if(funcTom = true) {
			System.out.println("Este produto funciona fora da tomada.");
		}
		else {
			System.out.println("Este produto não funciona fora da tomada.");
		}
	}
	
	public void informacoesProd() {
		System.out.println("O nome do produto é: " + this.nome);
		System.out.println("Seu ano de fabricação é: " + this.anoFab);
		System.out.println("È um produto de porte grande? " + this.porte);
		System.out.println("Funciona fora da tomada? " + this.funcTom);
		System.out.println("Avaliação do produto pelos nossos clientes: " + this.avaliacao);
		
		if (avaliacao < 2.0) {
			System.out.println("Melhoraremos a qualidade do produto em breve, caros clientes, não se preocupem.");
		}
		else if (avaliacao > 2.0 && avaliacao <= 4.0){
			System.out.println("Produto de avaliação mediana de acordo com nossos clientes.");
		}
		else {
			System.out.println("Produto de excelente avaliação pelos nossos clientes!");
		}
	}
}
