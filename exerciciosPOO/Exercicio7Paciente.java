package exerciciosPOOeSobrecarga;

/* 7) Crie uma classe paciente e apresente os atributos e m�todos 
 * referentes esta classe, em seguida crie um objeto paciente, 
 * defina as instancias deste objeto e apresente as informa��es 
 * deste objeto no console. */

public class Exercicio7Paciente {
	// O que tem um paciente? Sim, eu sei que o hospital � que tem saber mas quebra uma galho a�.
	
	String nome, doenca;
	boolean sexo;
	int idade;
	double peso;
	
	public void checarSexo() {
		if (sexo == true) {
			System.out.println("O paciente � do sexo feminino.");
		}
		else {
			System.out.println("O paciente � do sexo masculino.");

		}
	}
	
	public void informacaoPaciente(String  nome, String doenca, boolean sexo, int idade, double peso) {
		System.out.println("Nome do paciente: " + this.nome);
		System.out.println("Motivo da consulta: " + this.doenca);
		System.out.println("O paciente � mulher nervosa? " + this.sexo);
		System.out.println("A idade do paciente: " + this.idade);
		System.out.println("Peso do paciente: " + String.format("%.2f", this.peso));
	}
}
