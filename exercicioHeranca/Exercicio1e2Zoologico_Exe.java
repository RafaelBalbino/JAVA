package exercicioHeranca;

public class Exercicio1e2Zoologico_Exe {

	public static void main(String[] args) {
		/* Classe desnecess�ria para o exerc�cio 1 e 2 mas � sempre 
		 * bom testar se tudo est� funciona direitinho, n�? */
		
		Exercicio1e2Cachorro_Sub cachorro = new Exercicio1e2Cachorro_Sub();
		Exercicio1e2Cavalo_Sub cavalo = new Exercicio1e2Cavalo_Sub();
		Exercicio1e2Preguica_Sub preguica = new Exercicio1e2Preguica_Sub();
		
		System.out.println("Venham, venham! Nossos queridos animais ir�o fazer "
			               + "suas apresenta��es! \n");
		
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println();
		
		cavalo.galopar();
		cavalo.emitirSom();
		
		System.out.println();
		
		preguica.subirEmArvore();
		preguica.emitirSom();
		
		System.out.println("\nIsso � tudo pessoal! Amanh� tem mais!");
	}

}
