package exerciciosPOOeSobrecarga;

/* 2) Crie uma classe avião e apresente os atributos e métodos referentes a 
 * esta classe, em seguida crie um objeto avião, defina as instancias deste 
 * objeto e apresente as informações deste objeto no console.*/

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
