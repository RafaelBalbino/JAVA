package exercicioHeranca;

public class Exercicio1Zoologico_Exe {

	public static void main(String[] args) {
		/* Classe desnecess�ria para o exerc�cio 1 mas � sempre 
		 * bom testar se tudo est� funcionando direitinho, n�? */
		
		Exercicio1Cachorro_Sub cachorro = new Exercicio1Cachorro_Sub();
		Exercicio1Cavalo_Sub cavalo = new Exercicio1Cavalo_Sub();
		Exercicio1Preguica_Sub preguica = new Exercicio1Preguica_Sub();
		
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
