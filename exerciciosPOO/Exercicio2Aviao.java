package exerciciosPOOeSobrecarga;

/* 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes a 
 * esta classe, em seguida crie um objeto avi�o, defina as instancias deste 
 * objeto e apresente as informa��es deste objeto no console.*/

public class Exercicio2Aviao {
	//O que tem um avi�o?
	
	String uso, marca;
	boolean atividade, manutencao;
	int anosConstruido;
	
	public void voar() {
		boolean atividade = true;
		System.out.println("Apertem os cintos, pois o avi�o ir� decolar!");
	}
	
	public void pousar() {
		boolean atividade = false;
		System.out.println("Estamos pousando, caros passageiros!");
	}
	public void disponibilidade() {
		if(atividade = true ) {
			System.out.println("Avi�o est� ocupado em sua rota.");
		}
		else {
			System.out.println("Avi�o pronto para voar!");
		}
	}
	public void chamarTecnicos() {
		if (manutencao == true) {
			System.out.println("N�o precisa, a manuten��o est� em dia!");
		}
		else {
			System.out.println("Pode chamar, t� precisando de manuten��o mesmo.");
		}
	}
	public void desgastar() {
		boolean manutencao = false;
	}
	public void revitalizar() {
		boolean manutencao = true;
	}
	public void estadoAviao() {
		System.out.println("O avi�o foi constru�do " + this.anosConstruido + " anos atr�s");
		System.out.println("O avi�o � de uso " + this.uso);
		System.out.println("A marca do avi�o �: " + this.marca);
		System.out.println("Avi�o est� voando no momento? " + this.atividade);
		System.out.println("O avi�o precisa de manuten��o? " + this.manutencao);
	}
}
