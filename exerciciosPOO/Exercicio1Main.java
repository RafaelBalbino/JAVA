package exerciciosPOOeSobrecarga;

/* 1) Crie uma classe cliente e apresente os atributos e m�todos 
 * referentes esta classe, em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informa��es
 * deste objeto no console. */

public class Exercicio1Main {

	public static void main(String[] args) {
		Exercicio1Cliente cliente = new Exercicio1Cliente();
		
		cliente.cadastro = true;
		cliente.nome = "Rafael B. Balbino";
		cliente.idade = 20;
		cliente.saldo = 2.500;
		
		cliente.status();
		cliente.entrada();
	}
}
