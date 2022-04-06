package exerciciosPOOeSobrecarga;

/* 2) Crie uma classe avião e apresente os atributos e métodos referentes a 
 * esta classe, em seguida crie um objeto avião, defina as instancias deste 
 * objeto e apresente as informações deste objeto no console.*/

public class Exercicio2Aviao {
	//O que tem um avião?
	
	String uso, marca;
	boolean atividade, manutencao;
	int anosConstruido;
	
	public void voar() {
		boolean atividade = true;
		System.out.println("Apertem os cintos, pois o avião irá decolar!");
	}
	
	public void pousar() {
		boolean atividade = false;
		System.out.println("Estamos pousando, caros passageiros!");
	}
	public void disponibilidade() {
		if(atividade = true ) {
			System.out.println("Avião está ocupado em sua rota.");
		}
		else {
			System.out.println("Avião pronto para voar!");
		}
	}
	public void chamarTecnicos() {
		if (manutencao == true) {
			System.out.println("Não precisa, a manutenção está em dia!");
		}
		else {
			System.out.println("Pode chamar, tá precisando de manutenção mesmo.");
		}
	}
	public void desgastar() {
		boolean manutencao = false;
	}
	public void revitalizar() {
		boolean manutencao = true;
	}
	public void estadoAviao() {
		System.out.println("O avião foi construído " + this.anosConstruido + " anos atrás");
		System.out.println("O avião é de uso " + this.uso);
		System.out.println("A marca do avião é: " + this.marca);
		System.out.println("Avião está voando no momento? " + this.atividade);
		System.out.println("O avião precisa de manutenção? " + this.manutencao);
	}
}
