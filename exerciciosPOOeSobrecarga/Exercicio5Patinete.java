package exerciciosPOOeSobrecarga;

/* 5) Crie uma classe patinete e apresente os atributos e
 *  m�todos referentes esta classe, em seguida crie um 
 *  objeto patinete, defina as instancias deste objeto e 
 *  apresente as informa��es deste objeto no console. */

public class Exercicio5Patinete {
	// O que tem um patinete?
	
	int rodas, anoFab;
	String marca;
	boolean estado;
	
	public void quebrar() {
		boolean estado = false;
	}
	
	public void consertar() {
		boolean estado = true;
	}
	
	public void andar() {
		if (estado == false) {
			System.out.println("Melhor consertar ela primeiro, n�? Vai por mim!");
		}
		else {
			System.out.println("Vam booooooora!");
		}
	}
	
	public void informacoesPatinete() {
		System.out.println("O patinete tem " + this.rodas + " rodas.");
		
		if (rodas == 2) {
			System.out.println("Essa voc� n�o sabia, hein? Duvido!");
		}
		System.out.println("O patinete foi fabricado no ano de: " + this.anoFab);
		System.out.println("� da marca: " + this.marca);
		System.out.println("O patinete est� em boas condi��es? " + this.estado);
		
		if (estado == false) {
			System.out.println("Ent�o conserta ele antes de usar pra n�o se acidentar depois.");
		}
		else {
			System.out.println("Agora bora dar uma role de patinete, meu caro!");
		}
	}
}
