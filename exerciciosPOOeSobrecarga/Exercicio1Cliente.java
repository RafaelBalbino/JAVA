package exerciciosPOOeSobrecarga;

/* 1) Crie uma classe cliente e apresente os atributos e m�todos 
 * referentes esta classe, em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informa��es
 * deste objeto no console. */

public class Exercicio1Cliente {
	//O que um cliente de banco fict�cio tem?
	boolean cadastro;
	String nome;
	int idade;
	double saldo;

	public void entrada() {
		if (cadastro == false) {
			System.out.println("ERRO! N�o h� cadastro deste cliente, ent�o n�o pode entrar.");
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
		System.out.println("Cliente � cadastrado? " + this.cadastro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Saldo do cliente: " + String.format("%.2f", this.saldo));
		// String.format("%.xf", vari�vel) � para o double com x casas
}

}