package exerciciosPOOeSobrecarga;

/* 5) Crie uma classe patinete e apresente os atributos e
 *  métodos referentes esta classe, em seguida crie um 
 *  objeto patinete, defina as instancias deste objeto e 
 *  apresente as informações deste objeto no console. */

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
			System.out.println("Melhor consertar ela primeiro, né? Vai por mim!");
		}
		else {
			System.out.println("Vam booooooora!");
		}
	}
	
	public void informacoesPatinete() {
		System.out.println("O patinete tem " + this.rodas + " rodas.");
		
		if (rodas == 2) {
			System.out.println("Essa você não sabia, hein? Duvido!");
		}
		System.out.println("O patinete foi fabricado no ano de: " + this.anoFab);
		System.out.println("É da marca: " + this.marca);
		System.out.println("O patinete está em boas condições? " + this.estado);
		
		if (estado == false) {
			System.out.println("Então conserta ele antes de usar pra não se acidentar depois.");
		}
		else {
			System.out.println("Agora bora dar uma role de patinete, meu caro!");
		}
	}
}
