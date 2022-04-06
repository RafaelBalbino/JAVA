package exerciciosPOOeSobrecarga;

/* 5) Crie uma classe patinete e apresente os atributos e
 *  métodos referentes esta classe, em seguida crie um 
 *  objeto patinete, defina as instancias deste objeto e 
 *  apresente as informações deste objeto no console. */

public class Exercicio5Main {

	public static void main(String[] args) {
		Exercicio5Patinete pat = new Exercicio5Patinete();
		
		pat.rodas = 2;
		pat.anoFab = 2010;
		pat.marca = "Suzuki";
		pat.estado = true;
		
		pat.informacoesPatinete();
		pat.andar();
	}
}
