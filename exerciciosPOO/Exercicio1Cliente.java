package exerciciosPOOeSobrecarga;

/* 1) Crie uma classe cliente e apresente os atributos e métodos 
 * referentes esta classe, em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informações
 * deste objeto no console. */

public class Exercicio1Cliente {
	//O que um cliente de banco fictício tem?
	boolean cadastro;
	String nome;
	int idade;
	double saldo;

	public void entrada() {
		if (cadastro == false) {
			System.out.println("ERRO! Não há cadastro deste cliente, então não pode entrar.");
		}
		else {
			System.out.println("Bem-vindo a nosso estabelecimento!");
		}
	}
	public void cadastrar() {
		this.cadastro = true;		
	}
	public void desistencia() {
		this.cadastro = false;
	}
	public void status() {
		System.out.println("Cliente é cadastrado? " + this.cadastro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Saldo do cliente: " + String.format("%.2f", this.saldo));
		// String.format("%.xf", variável) é para o double com x casas
}

}