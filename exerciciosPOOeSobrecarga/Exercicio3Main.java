package exerciciosPOOeSobrecarga;

/* 3) Crie uma classe produto eletr�nico e apresente os atributos 
 * e m�todos referentes esta classe, em seguida crie um objeto 
 * produto eletr�nico, defina as instancias deste objeto e apresente 
 * as informa��es deste objeto no console. */

public class Exercicio3Main {

	public static void main(String[] args) {
		Exercicio3PE prod = new Exercicio3PE();
		
		prod.nome = "Notebook";
		prod.anoFab = 2018;
		prod.porte = false;
		prod.funcTom = true;
		prod.avaliacao = 4.5;
		
		prod.informacoesProd();
	}

}
