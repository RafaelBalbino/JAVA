package exerciciosPOOeSobrecarga;

/* 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes a 
 * esta classe, em seguida crie um objeto avi�o, defina as instancias deste 
 * objeto e apresente as informa��es deste objeto no console.*/

public class Exercicio2Main {

	public static void main(String[] args) {
		Exercicio2Aviao aviao = new Exercicio2Aviao();
		
		aviao.anosConstruido = 50;
		aviao.uso = "Civil";
		aviao.marca = "TAN";
		aviao.atividade = true;
		aviao.manutencao = false;
		
		aviao.estadoAviao();
	}

}
