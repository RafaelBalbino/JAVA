package exerciciosPOOeSobrecarga;

/* 7) Crie uma classe paciente e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto paciente, 
 * defina as instancias deste objeto e apresente as informações 
 * deste objeto no console. */

public class Exercicio7Main {

	public static void main(String[] args) {
		Exercicio7Paciente pac = new Exercicio7Paciente();
		
		/* pac.nome = "Gabriel";
		pac.doenca = "Poliomelite";
		pac.sexo = false;
		pac.idade = 18;
		pac.peso = 61.00; */
		// Não precisa disso aqui por causa dos parâmetros lá no método 'pac.informacaoPaciente'
		
		pac.checarSexo();
		
		pac.informacaoPaciente("Gabriel", "Poliomelite", false, 18, 61.00);
	}

}
